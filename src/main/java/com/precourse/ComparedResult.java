package com.precourse;

import java.util.ArrayList;

public class ComparedResult {
    private int strike = 0;
    private int ball = 0;
    private final int LENGTH = 3;
    private final int THREE_STRIKE = 3;

    public boolean compareResult(ArrayList<Integer> answer,
                                 ArrayList<Integer> input, int tryNumber) {
        for (int i = 0; i < LENGTH; i++) {
            if (answer.contains(input.get(i))) {
                checkDigit(answer.get(i), input.get(i));
            }
        }

        boolean isRight = false;
        if (strike == THREE_STRIKE) {
            isRight = true;
            MassageSystem.sendCollectMessage();
        } else {
            MassageSystem.sendHint(strike, ball);
        }
        System.out.println(tryNumber + "회 시도하였습니다.");

        return !isRight;
    }

    private void checkDigit(int a, int b) {
        if (a == b) {
            strike++;
        } else {
            ball++;
        }
    }
}
