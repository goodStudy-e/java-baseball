import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    //수비 : 0~9중 4개의 수 중복되지 않게 뽑기
    //공격자 :  10번의 기회 안에 4개의 수 맞추기
    //숫자 맞으면 볼, 틀리면 스트라이크
    public static void main(String[] args) {
        //횟수를 지정하여 공수하므로 배열로 선언

        int strike = 0;
        int ball = 0;
        int count = 0; //횟수 체크
        int [] defenceArr = new int[4];

        //수비 숫자 설정
        for (int i=0;i<4; i++) {
        // defenceArr[i] = (int) ((Math.random() * 10) + 1);
            //수비 중복없이
            int tempNum = (int)((Math.random() * 10) + 1);
            //비교
            for(int j=0;j<defenceArr.length;j++){
                if(defenceArr[i] == tempNum) break;
            }
            //수비 숫자 입력
            defenceArr[i] = tempNum;
        }
        if(count == 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("공격 숫자를 입력하세요");
            count++;
            int attackNum = scanner.nextInt();

            //수비 공격 비교
            for (int i = 0; i < defenceArr.length; i++) {

                if (attackNum == defenceArr[i]) {
                    System.out.println("스트라이크 입니다.");
                    strike++;
                } else {
                    System.out.println("볼입니다.");
                    ball++;
                }


                if (strike == 4) {
                    System.out.println("홈런입니다.");
                }
            }


            System.out.println("결과는 strike" + strike + "회 ball은" + ball + "회 입니다");


        }
        //TODO int, integer
    }
}
