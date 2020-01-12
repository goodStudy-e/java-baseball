package com.precourse;

public class MassageSystem {

    static void sendCollectMessage() {
        System.out.println("3 Strike!!");
        System.out.println("정답입니다.");
    }

    static void sendHint(int strike, int ball) {
        if (strike != 0) {
            System.out.print(strike + "S ");
        }

        if (ball != 0) {
            System.out.println(ball + "B ");
        }

        if (strike == 0 && ball == 0) {
            System.out.println("아웃!");
        }
    }
}
