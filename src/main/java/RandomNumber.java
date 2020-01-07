import java.util.Random;

public class RandomNumber {
    final int digit;
    StringBuilder sb;

    public RandomNumber(int digit) throws Exception {
        if (digit > 9) {
            throw new DigitException();
        }
        this.digit = digit;
    }

    private int getRandomNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        return ranNum;
    }

    private boolean isContain(String container, String content) {
        return container.contains(content);
    }

    public String getBaseBallNumber() {
        sb = new StringBuilder();
        while (sb.toString().length() < digit) {
            String randomNum = Integer.toString(getRandomNumber());
            if (!isContain(sb.toString(), randomNum)) {
                sb.append(randomNum);
            }
        }
        return sb.toString();
    }

}
