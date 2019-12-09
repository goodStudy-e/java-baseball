import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {

        new TDDClass().run();

        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            System.out.println("몇 자리로 하시겠습니까?");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 10) {
                break;
            } else {
                System.out.println("10자리 이하로만 가능합니다.");
            }
        }

        String rand = new RandomNumber().getNumber(size);
        int count = 0;
        System.out.println(rand);
        Confirm confirm = new Confirm();

        while (count < 20) {
            System.out.println("중복되지 않는 " + size + "자리 수를 입력하세요.");
            StringBuilder sb = new StringBuilder();
            String scan = scanner.nextLine();
            if (scan.length() != size) {
                System.out.println("자리수가 맞지않습니다. 다시 입력해주세요");
                continue;
            }
            int[] result = confirm.outBallStrike(confirm.confirmAll(scan, rand));
            sb.append(result[0]);
            sb.append("아웃, ");
            sb.append(result[1]);
            sb.append("볼, ");
            sb.append(result[2]);
            sb.append("스트라이크 ");
            System.out.println(sb.toString());
            if (rand.equals(scan)) {
                break;
            }
            count++;
        }

        if (count == 20) {
            System.out.println("기회 끝!");
        }
    }

}

//1. 각자 3/4자리 숫자를 임의로 정한 뒤, 서로에게 3/4자리의 숫자를 불러서 결과를 확인한다. 그리고 그 결과를 토대로 상대가 적은 숫자를 예상한 뒤 맞힌다.
class RandomNumber {
    public String getNumber(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            double ran = Math.random();
            int ranNum = (int) (ran * 10);
            if (isContain(sb.toString(), ranNum)) {
                i--;
            } else {
                sb.append(ranNum);
            }
        }
        return sb.toString();
    }

    private boolean isContain(String numbers, int number) {
        boolean isContain;
        if (numbers.length() > 0) {
            isContain = numbers.indexOf(Integer.toString(number)) != -1;
        } else {
            isContain = false;
        }
        return isContain;
    }

    public void TDD() {
        if (getNumber(3).length() != 3) {
            System.out.println("TDD ERROR : randomNumber.getNumber(3)");
        }
        if (getNumber(4).length() != 4) {
            System.out.println("TDD ERROR : randomNumber.getNumber(4)");
        }
    }
}

class Confirm {
    public int[] outBallStrike(int[] confirmAll) {
        int[] outBallStrike = new int[3];
        int out = 0;
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < confirmAll.length; i++) {
            switch (confirmAll[i]) {
                case 0:
                    out++;
                    break;
                case 1:
                    ball++;
                    break;
                case 2:
                    strike++;
                    break;
                default:
                    break;
            }
        }
        outBallStrike[0] = out;
        outBallStrike[1] = ball;
        outBallStrike[2] = strike;
        return outBallStrike;
    }

    public int[] confirmAll(String scanNums, String numbers) {
        int[] confirmAll = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            confirmAll[i] = confirm(scanNums.substring(i, i + 1), numbers, i);
        }
        return confirmAll;
    }


    // out : 0, ball : 1, strike : 2
    private int confirm(String scanNum, String numbers, int index) {
        int confirm;
        if (!isOut(scanNum, numbers)) {
            if (isStrike(scanNum, numbers, index)) {
                confirm = 2;
            } else {
                confirm = 1;
            }
        } else {
            confirm = 0;
        }
        return confirm;
    }


    private boolean isOut(String oneNum, String numbers) {
        boolean isOut = true;
        for (int i = 0; i < numbers.length(); i++) {
            if (oneNum.equals(numbers.substring(i, i + 1))) {
                isOut = false;
            }
        }
        return isOut;
    }

    // out판단 하면 ball은 확정 -> 따라서 Strike 여부만 판단
//    public boolean isBall(String oneNum, String numbers) {
//        return false;
//    }

    private boolean isStrike(String oneNum, String numbers, int index) {
        return numbers.substring(index, index + 1).equals(oneNum);
    }

    public void TDD() {
        if (!isOut("2", "345")) {
            System.out.println("TDD ERROR : confirm.isOut(\"3\",\"345\")");
        }
        if (isStrike("3", "345", 1)) {
            System.out.println("TDD ERROR : confirm.isStrike(\"3\",\"345\", 1)");
        }
    }
}

class TDDClass {
    public void run() {
        new RandomNumber().TDD();
        new Confirm().TDD();
    }
}