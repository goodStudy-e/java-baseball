package com.precourse;

import java.util.ArrayList;

/**
 * 클래스 이름: BaseballSystem.java
 * 숫자야구게임의 전체적인 시스템을 구축하는 클래스
 */
public class BaseballSystem {
    private static ArrayList<Integer> answer = new ArrayList<>();
    private static ArrayList<Integer> insert = new ArrayList<>();

    /**
     * 숫자야구게임을 시작한다.
     */
    public void playBaseball() {
            answer = NumberGenerator.numberGenerator();

            while (true) {
                insert = InputNumber.insertList;
            }
    }

}
