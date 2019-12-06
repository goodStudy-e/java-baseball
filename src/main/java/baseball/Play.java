package baseball;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName Play
 * 
 * @Version 0.0.0
 * 
 * @Date 20191205
 * 
 * @author asqwklop12
 * 
 * @EMAIL asqwklop12@gmail.com
 *
 */

public class Play {

	public static void main(String[] args) {

		// 게임이 시작됩니다.
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		
		// 컴퓨터는 숫자를 고릅니다.
		Computer computer = new Computer();
		
		Set<Integer> comSet = computer.save();
		List<Integer> comList = game.toList(comSet);

		System.out.println("컴퓨터는 숫자를 3개의 숫자를 골랐습니다.");
		
//		System.out.println(list);
		

		// 플레이어는 숫자를 고릅니다.
		User user = new User(sc);
		
		System.out.println("몇 번안에 마추겠습니까? ");
		int type = sc.nextInt();
		Set<Integer> userSet = null;
		
		for (int i = 0; i < type; i++) {
			
			
			// 플레이어는 지정한 횟수 만큼 정답을 맞출 수 있습니다. 
			 userSet = user.save();
			List<Integer> userList = game.toList(userSet);
			
			// 게임을 시작합니다.
			game.play(comList, userList);
			
			// 결과를 표시합니다.
			System.out.println(game.result());
			
			// 만약 홈런일 경우 게임을 종료합니다.
			if (game.isHomerun()) {
				System.out.println("플레이어는 "+ (i+1)+"번만에 "+ "맞추셨습니다.");
				break;
			}

			// 초기화
			game.intailize();
			
		}
		
		if (!userSet.equals(comSet)) {
			System.out.println("정답 : "+comSet);			
		}

	}
}
