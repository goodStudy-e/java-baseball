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

		// ������ ���۵˴ϴ�.
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		
		// ��ǻ�ʹ� ���ڸ� ���ϴ�.
		Computer computer = new Computer();
		
		Set<Integer> com = computer.save();
		List<Integer> list = game.toList(com);

		System.out.println("��ǻ�ʹ� ���ڸ� 3���� ���ڸ� ������ϴ�.");
		
//		System.out.println(list);
		

		// �÷��̾�� ���ڸ� ���ϴ�.
		User user = new User(sc);
		
		System.out.println("�� ���ȿ� ���߰ڽ��ϱ�? ");
		int type = sc.nextInt();
		
		for (int i = 0; i < type; i++) {
			
			// �÷��̾�� ������ Ƚ�� ��ŭ ������ ���� �� �ֽ��ϴ�. 
			Set<Integer> userSet = user.save();
			List<Integer> userList = game.toList(userSet);
			
			// ������ �����մϴ�.
			game.play(list, userList);
			
			// ����� ǥ���մϴ�.
			System.out.println(game.result());
			
			// ���� Ȩ���� ��� ������ �����մϴ�.
			if (game.isHomerun()) {
				System.out.println("�÷��̾�� "+ (i+1)+"������ "+ "���߼̽��ϴ�.");
				break;
			}

			// �ʱ�ȭ
			game.intailize();
			
		}

	}
}
