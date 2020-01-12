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

        while (list.size() < ANSWER_LENGTH) {
            int randomNumber = getRandomNumber(length + 1);

            if (!list.contains(randomNumber)) {
                list.add(randomNumber);
            }
        }
        return list;
    }

    public int getRandomNumber(int range) {
        return (int) (Math.random() * range);
    }
}
