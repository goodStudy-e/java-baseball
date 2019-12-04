public class BaseBall {
    public static void main(String[] args) {
        new TDDClass().run();
        String rand = new RandomNumber().getNumber(4);
        String test = "123";
        System.out.println(test.substring(0, 1) + " " + rand);
        System.out.println(new Confirm().isOut(test.substring(0, 1), rand));
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
}

class Confirm {
    public boolean isOut(String oneNum, String numbers) {
        boolean isOut = true;
        for (int i = 0; i < numbers.length(); i++) {
            if (oneNum.equals(numbers.substring(0, 1))) {
                isOut = false;
            }
        }
        return isOut;
    }

    // out판단 하면 ball은 확정 -> 따라서 Strike 여부만 판단
    public boolean isBall(String oneNum, String numbers) {
        return false;
    }

    public boolean isStrike(String oneNum, String numbers, int index) {
        return numbers.substring(index, 1).equals(oneNum);
    }
}

class TDDClass {
    public void run() {
        RandomNumber randomNumber = new RandomNumber();
        if (randomNumber.getNumber(3).length() != 3) {
            System.out.println("TDD ERROR : randomNumber.getNumber(3)");
        }
        if (randomNumber.getNumber(4).length() != 4) {
            System.out.println("TDD ERROR : randomNumber.getNumber(4)");
        }
        Confirm confirm = new Confirm();
        if (!confirm.isOut("3", "345")) {
            System.out.println("TDD ERROR : confirm.isOut(\"3\",\"345\")");
        }
        if (confirm.isStrike("3", "345", 1)) {
            System.out.println("TDD ERROR : confirm.isStrike(\"3\",\"345\", 1)");
        }
    }
}