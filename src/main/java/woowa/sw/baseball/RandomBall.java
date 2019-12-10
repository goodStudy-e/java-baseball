package woowa.sw.baseball;

/**
 * 랜덤으로 1~9까지의 난수 정보를 가진 class
 * auther : sw
 */
public class RandomBall {
    private final static int MAX_NUMBER = 9;
    private final static int MIN_NUMBER = 1;
    private final int randomNum;

    RandomBall(int randomNum) {
        if (randomNum < MIN_NUMBER || randomNum > MAX_NUMBER) {
            throw new IllegalArgumentException("야구공의 숫자는 1 ~ 9 사이입니다.");
        }
        this.randomNum = randomNum;
    }

    public int getRandomNum() {
        return this.randomNum;
    }
}
