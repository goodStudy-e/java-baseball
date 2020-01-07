package com.precourse;

/**
 * 클래스 이름: MassageSystem
 * 사용자가 입력한 숫자에따라 힌트또는 정답 메시지를 출력한다.
 *
 * @author rok, github.com/rok93
 * <p>
 * 날짜: 2019.12.04 (수)
 * @version 1.0.0
 */
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
