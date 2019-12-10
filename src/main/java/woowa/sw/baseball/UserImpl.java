package woowa.sw.baseball;

import java.util.Scanner;

public class UserImpl implements User{
    private static final int USER_INPUT_CNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String[] getUserRandomBall() throws IllegalArgumentException {
        System.out.print("숫자를 입력하세요 : ");
        String[] arrUserInput = SCANNER.nextLine().replaceAll(" ", "").split("");
        if (arrUserInput.length != USER_INPUT_CNT) throw new IllegalArgumentException("3자리 숫자를 입력하세요.");

        return arrUserInput;
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    @Override
    public void printEndMsg() {
        System.out.println("User가 모든 숫자를 맞췄습니다. 게임을 종료합니다.");
    }

    @Override
    public String checkEndOrContinue() throws IllegalArgumentException {
        System.out.println("다시하려면 1, 종료하려면 0을 입력하세요");
        return SCANNER.nextLine();
    }
}
