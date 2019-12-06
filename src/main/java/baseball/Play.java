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
		
		Set<Integer> comSet = computer.save();
		List<Integer> comList = game.toList(comSet);

		System.out.println("��ǻ�ʹ� ���ڸ� 3���� ���ڸ� ������ϴ�.");
		
//		System.out.println(list);
		

		// �÷��̾�� ���ڸ� ���ϴ�.
		User user = new User(sc);
		
		System.out.println("�� ���ȿ� ���߰ڽ��ϱ�? ");
		int type = sc.nextInt();
		Set<Integer> userSet = null;
		
		for (int i = 0; i < type; i++) {
			
			
			// �÷��̾�� ������ Ƚ�� ��ŭ ������ ���� �� �ֽ��ϴ�. 
			 userSet = user.save();
			List<Integer> userList = game.toList(userSet);
			
			// ������ �����մϴ�.
			game.play(comList, userList);
			
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
		
		if (!userSet.equals(comSet)) {
			System.out.println("���� : "+comSet);			
		}

	}
}
