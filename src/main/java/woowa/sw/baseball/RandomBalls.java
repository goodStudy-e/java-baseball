package woowa.sw.baseball;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 난수 3자리 정보를 가지고 있는 class
 * author : sw
 */
public class RandomBalls {
    private static final int RANDOM_BALL_CNT = 3;
    private final Set<Integer> randomBallSet;

    public RandomBalls(Set<Integer> randomBallSet) {
        if (randomBallSet.size() != RANDOM_BALL_CNT) throw new IllegalArgumentException("중복된 숫자가 존재합니다.");

        this.randomBallSet = randomBallSet;
    }

    public Map<Integer, Integer> convertRandomBallSetToMap() {
        Map<Integer, Integer> randomBallMap = new HashMap<>();
        int numIdx = 1;
        for (Integer randomBall : randomBallSet) randomBallMap.put(numIdx++, randomBall);

        return randomBallMap;
    }
}
