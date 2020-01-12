package com.precourse;

import java.util.ArrayList;

public class BaseballSystem {

    public void playBaseball() {
        NumberGenerator numberGenerator = new NumberGenerator();
        ArrayList<Integer> answer = numberGenerator.numberGenerator();

        int tryNumber = 0;
        boolean incorrect = true;
        while (incorrect) {
            tryNumber++;
            InputNumber inputNumber = new InputNumber();
            ArrayList<Integer> insert = inputNumber.insertNumber();
            ComparedResult comparedResult = new ComparedResult();
            incorrect = comparedResult.compareResult(answer, insert, tryNumber);
        }
    }

}
