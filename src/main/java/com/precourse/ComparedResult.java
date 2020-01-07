/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */

package com.precourse;

import java.util.ArrayList;

/**
 * 클래스 이름: ComparedResult.java
 * 유저가 입력한 세자리 정수와 정답이 일치하는지 확인하는 기능
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.04 (수)
 * @version 1.0.0
 */
public class ComparedResult {
    private int strike = 0;
    private int ball = 0;
    private static final int LENGTH = 3;
    private static boolean isRight = false;

    /** 유저가 입력한 세자리 정수와 정답을 비교하는 메서드 */
    public boolean compareResult(ArrayList<Integer> answer,
                                 ArrayList<Integer> input, int tryNumber) {
        for (int i = 0; i < LENGTH; i++) {
            if (isContains(answer, input.get(i))) {
                checkDigit(answer.get(i), input.get(i));
            }
        }

        if (strike == 3) {
            isRight = true;
            MassageSystem.sendCollectMessage();
        } else {
            MassageSystem.sendHint(strike, ball);
        }
        System.out.println(tryNumber + "회 시도하였습니다.");

        return !isRight;
    }

    /** 유저로부터 받은 값 중 하나가 정답에 포함되어있는지 유무를 파악하는 메서드 */
    private boolean isContains(ArrayList<Integer> answer, int part_input) {
        return answer.contains(part_input);
    }

    /** a(answer.get(i))와 b(input.get(i))의 값을 비교하여 strike, ball 판별 */
    private void checkDigit(int a, int b) {
        if (a == b) {
            strike++;
        } else {
            ball++;
        }
    }
}
