package woowa.sw.baseball;

import java.util.Map;

/**
 * 3자리 난수와 사용자가 입력한 숫자를 비교하는 class
 * author : sw
 */
public class ResultCalcMachine {
    private static final int[] BALL_IDX = {1, 2, 3};
    private Map<Integer, Integer> randBalls;

    public ResultCalcMachine(Map<Integer, Integer> randBalls) {
        this.randBalls = randBalls;
    }

    public StrikeBallInfo resultCalc(Map<Integer, Integer> userBalls) {
        StrikeBallInfo strikeBallInfo = new StrikeBallInfo(0, 0);
        for (int numBallIdx : BALL_IDX) {
            if (randBalls.get(numBallIdx).equals(userBalls.get(numBallIdx))) {
                strikeBallInfo.setStrikeCnt(strikeBallInfo.getStrikeCnt()+1);
            } else if (randBalls.containsValue(userBalls.get(numBallIdx))) {
                strikeBallInfo.setBallCnt(strikeBallInfo.getBallCnt()+1);
            }
        }

        return strikeBallInfo;
    }

    public boolean isThreeStrike(StrikeBallInfo strikeBallInfo) {
        return strikeBallInfo.getStrikeCnt() != 3;
    }
}
