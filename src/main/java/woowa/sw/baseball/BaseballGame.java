package woowa.sw.baseball;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 숫자야구 게임 로직 class
 * author : sw
 */
public class BaseballGame {
    private User user;
    private RandomBallGenerate randomBallGenerate;

    public BaseballGame(User user, RandomBallGenerate randomBallGenerate) {
        this.user = user;
        this.randomBallGenerate = randomBallGenerate;
    }

    public void playBaseballGame() {
        ResultCalcMachine resultCalcMachine = new ResultCalcMachine(generateRandomBalls());
        StrikeBallInfo strikeBallInfo;
        do {
            strikeBallInfo = resultCalcMachine.resultCalc(generateUserBalls());
            user.printResult(makePrintResultMsg(strikeBallInfo));
        } while (resultCalcMachine.isThreeStrike(strikeBallInfo));

        user.printEndMsg();
        if (isContinueBaseballGame()) playBaseballGame();
    }

    private Map<Integer, Integer> generateRandomBalls() {
        try {
            return new RandomBalls(randomBallGenerate.makeThreeRandomBalls())
                    .convertRandomBallSetToMap();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return generateRandomBalls();
        }
    }

    private Map<Integer, Integer> generateUserBalls() {
        try {
            return new RandomBalls(convertStrArrayToSet(user.getUserRandomBall()))
                    .convertRandomBallSetToMap();
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return generateUserBalls();
        }
    }

    private Set<Integer> convertStrArrayToSet(String[] userRandomBall) {
        try {
            Set<Integer> userBallsSet = new LinkedHashSet<>();
            for (String userBall : userRandomBall)
                userBallsSet.add(new RandomBall(Integer.parseInt(userBall)).getRandomNum());

            return userBallsSet;
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 입력 입니다.");
        }
    }

    private String makePrintResultMsg(StrikeBallInfo strikeBallInfo) {
        StringBuilder sb = new StringBuilder();
        if (strikeBallInfo.getStrikeCnt() != 0) sb.append(strikeBallInfo.getStrikeCnt() + "스트라이크");
        if (strikeBallInfo.getBallCnt() != 0) sb.append(strikeBallInfo.getBallCnt() + "볼");
        if (strikeBallInfo.getStrikeCnt() == 0 && strikeBallInfo.getBallCnt() == 0) sb.append("맞춘 숫자가 없습니다.");

        return sb.toString();
    }

    private boolean isContinueBaseballGame() {
        try {
            int userInput = Integer.parseInt(user.checkEndOrContinue());
            if (userInput == 1) return true;
            else if (userInput == 0) return false;
            else throw new IllegalArgumentException("다시하려면 1, 종료하려면 0을 입력하세요.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return isContinueBaseballGame();
        }
    }

}
