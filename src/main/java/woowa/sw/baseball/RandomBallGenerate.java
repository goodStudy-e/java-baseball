package woowa.sw.baseball;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * RandomBall 객체를 이용한 난수 생성 class
 * auther : sw
 */
public class RandomBallGenerate {
    private final static int MAX_RANDOM_NUM = 9;
    private final static int MIN_RANDOM_NUM = 1;
    private final static int RANDOM_BALL_CNT = 3;

    // 난수 생성
    private int generateRandomBall() {
        return (int) (Math.random() * MAX_RANDOM_NUM) + MIN_RANDOM_NUM;
    }

    public Set<Integer> makeThreeRandomBalls() {
        Set<Integer> threeRandomBallSet = new LinkedHashSet<>();
        for (int i=0; i<RANDOM_BALL_CNT; i++) threeRandomBallSet.add(new RandomBall(generateRandomBall()).getRandomNum());

        return threeRandomBallSet;
    }
}
