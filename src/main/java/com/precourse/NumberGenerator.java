package com.precourse;

import java.util.ArrayList;

public class NumberGenerator {
    private final int ANSWER_LENGTH = 3;
    private final int RANGE_OF_NUMBER = 9;

    public ArrayList<Integer> numberGenerator() {
        System.out.println("컴퓨터가 문제를 생성합니다.");
        ArrayList<Integer> answerList = getAnswerList(RANGE_OF_NUMBER);
        return answerList;
    }

    public ArrayList<Integer> getAnswerList(int length) {
        ArrayList<Integer> list = new ArrayList<>();

        while (isSmallerAnswerLength(list)) {
            int randomNum = getRandomNum(length + 1);        // 0 ~ length 까지 난수 발생

            if (!list.contains(randomNum)) {
                list.add(randomNum);
            }
        }

        return list;
    }

    public boolean isSmallerAnswerLength(ArrayList<Integer> list) {
        return list.size() < ANSWER_LENGTH;
    }

    public int getRandomNum(int range) {
        return (int) (Math.random() * range);
    }
}
