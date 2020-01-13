import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    private final int digit;

    public RandomNumber(int digit) {
        final int limitDigit = 9;
        if (digit > limitDigit) {
            throw new OverDigitException();
        }
        this.digit = digit;
    }

    private int getRandomNumber() {
        final int randomBound = 10;
        Random random = new Random();
        int ranNum = random.nextInt(randomBound);
        return ranNum;
    }

    public String collectionToString(Collection collection) {
        StringBuilder sb = new StringBuilder();
        for (Object object : collection) {
            sb.append(object);
        }
        return sb.toString();
    }

    public String getBaseBallNumber() {
        Set<String> baseBallNumbers = new LinkedHashSet<>();
        int baseBallNumbersSize = 0;
        while (baseBallNumbersSize < digit) {
            baseBallNumbers.add(Integer.toString(getRandomNumber()));
            baseBallNumbersSize = baseBallNumbers.size();
        }

        return collectionToString(baseBallNumbers);
    }

}
