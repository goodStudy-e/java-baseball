package com.precourse;

public class MassageSystem {

    /**
     * 기능3) 3 스트라이크 (정답) 메시지 출력하는 메서드
     */
    static void sendCollectMessage() {
        System.out.println("3 Strike!!");
        System.out.println("정답입니다.");
    }

    /**
     * 기능3-2) 오답일 경우 힌트 메시지를 출력하는 메서드
     */
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
