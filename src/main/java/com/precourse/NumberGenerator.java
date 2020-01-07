/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */

package com.precourse;

import java.util.ArrayList;

/**
 * 클래스 이름: NumberGenerator.java
 * 기능1) 0~9 사이의 서로 다른 3개의 숫자를 만드는 기능(정답)
 *
 * @author rok
 * @version 1.0.0
 * <p>
 * 날짜: 2019.12.04 (수)
 */
public class NumberGenerator {
    private static final int ANSWER_LENGTH = 3;        // 정답의 길이 3으로 고정
    private static final int RANGE_OF_NUMBER = 9;
    private static ArrayList<Integer> answerList = new ArrayList<>();

    /**
     * 정답으로 설정할 숫자 리스트 생성하는 메서드
     *
     * @return
     */
    public static ArrayList<Integer> numberGenerator() {
        System.out.println("컴퓨터가 문제를 생성합니다.");
        answerList = getAnswerList(RANGE_OF_NUMBER);
        return answerList;
    }

    /**
     * 중복되지 않는 서로 다른 3개의 수를 생성하는 메서드
     */
    public static ArrayList<Integer> getAnswerList(int length) {
        ArrayList<Integer> list = new ArrayList<>();

        while (listSmallerLength(ANSWER_LENGTH, list)) {
            int randomNum = getRandomNum(length + 1);        // 0 ~ length 까지 난수 발생

            if (!list.contains(randomNum)) {
                list.add(randomNum);
            }
        }

        return list;
    }

    /**
     * list의 길이가 length보다 큰지 작은지 판단하는 메서드(작으면 True)
     *
     * @param length
     * @param list
     * @return
     */
    public static boolean listSmallerLength(int length, ArrayList<Integer> list) {
        return list.size() < length;
    }

    /**
     * 범위(0 ~ range-1)내의 정수형 난수 발생하는 메서드(여기서는 0 ~ 9)
     *
     * @param range
     * @return
     */
    public static int getRandomNum(int range) {
        return (int) (Math.random() * range);
    }

}
