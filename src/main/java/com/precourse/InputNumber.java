package com.precourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputNumber {
    private final int INPUT_LENGTH = 3;

    public ArrayList<Integer> insertNumber() {
        Scanner input = new Scanner(System.in);
        String inputNumber;

        do {
            System.out.println("숫자를 입력해주세요: ");
            inputNumber = input.nextLine();
        } while (!isaRightInput(inputNumber));

        ArrayList<Integer> list = new ArrayList<>();
        SpringToList(inputNumber, list);

        return list;
    }

    private void SpringToList(String inputNumber, ArrayList<Integer> list) {
        for (int i = 0; i < inputNumber.length(); i++) {
            list.add(Integer.parseInt(inputNumber.split("")[i]));
        }
    }

    private boolean isaRightInput(String inputNumber) {
        if (inputNumber.length() != INPUT_LENGTH) {
            System.out.println("3자리 수를 입력해주세요!");
            return false;
        }

        if (isOverlap(inputNumber)) {
            System.out.println("중복되지 않게 입력하세요!");
            return false;
        }

        return true;
    }

    private boolean isOverlap(String inputNumber) {
        return Arrays.stream(inputNumber.split(""))
                .distinct()
                .count() != inputNumber.length();
    }

}
