/*
 * Copyright (c) 2019 Gyeonglok Kim
 * All rights reserved.
 */

package com.precourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Delayed;

/**
 * 클래스 이름: InputNumber.java
 * 기능2) 사용자로부터 3개의 숫자를 입력받는다.
 * (제약조건: 서로 다른 숫자가 아닌경우 다시 숫자를 입력받는다.)
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.04 (수)
 * @version 1.0.0
 */
public class InputNumber {
    private static int INPUT_LENGTH = 3;

    /**
     * 유저로부터 숫자를 입력받는 메서드
     *
     * @return
     */
    public static ArrayList<Integer> insertNumber() {
        Scanner input = new Scanner(System.in);
        String inputNumber;

        do {
            System.out.println("숫자를 입력해주세요: ");
            inputNumber = input.nextLine();
        } while (isaRightInput(inputNumber));

        ArrayList<Integer> list = new ArrayList<>();
        inputToList(inputNumber, list);

        return list;
    }

    /**
     * 유로부터 받은 input(String)을 ArrayList 타입으로 캐스트하는 메서드
     *
     * @param inputNumber
     * @param list
     */
    private static void inputToList(String inputNumber,
                                    ArrayList<Integer> list) {
        for (int i = 0; i < inputNumber.length(); i++) {
            list.add(Integer.parseInt(inputNumber.split("")[i]));
        }
    }

    /**
     * 유저가 입력한 숫자가 옳바른 입력형인지 확인하는 메서드
     * ( 1.중복되는 숫자없음, 2.길이가 3이 아니다)
     *
     * @param inputNumber
     * @return
     */
    private static boolean isaRightInput(String inputNumber) {
        if (inputNumber.length() != INPUT_LENGTH) {
            System.out.println("3자리 수를 입력해주세요!");
            return true;
        }

        if (isOverlap(inputNumber)) {
            System.out.println("중복되지 않게 입력하세요!");
            return true;
        }

        return false;
    }

    /**
     * 리스트에 중복되는 값이 있는지 확인하는 메서드
     *
     * @param inputNumber
     * @return
     */
    private static boolean isOverlap(String inputNumber) {
        return Arrays.stream(inputNumber.split(""))
                .distinct()
                .count() != inputNumber.length();
    }

}
