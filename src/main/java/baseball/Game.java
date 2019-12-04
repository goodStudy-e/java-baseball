package baseball;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName Game
 * 
 * @Version 0.0.0
 * 
 * @Date 20191204
 * 
 * @author asqwklop12
 * 
 * @EMAIL asqwklop12@gmail.com
 *
 */

public class Game {
	
	private int strike;
	private int ball;
	
	private static final String HUMERUN = "HUMERUN!~";
	private static final String OUT = "OUT TT";
	private static final String STRIKE = "Strike: ";
	private static final String BALL = "Ball: ";
	
	//set -> list�� �ٲٴ� �޼ҵ� 
	public List<Integer> toList(Set<Integer> set) {
		List<Integer> list = new LinkedList<>();
		list.addAll(set);
		return list;
	}
	
	
	
	// ���� �߱����� ����
	public void play(List<Integer> com, List<Integer> player) {
		
		for (int index = 0; index < com.size(); index++) {            
			computerCompareToPlayer(com, player, index);
		}

		
	}

	// ��ǻ�Ϳ� �÷��̾� ��
	private void computerCompareToPlayer(List<Integer> com, List<Integer> player, int index) {
		for (int j = 0; j < player.size(); j++) {     
			increaseCount(com, player, index, j);
				
		}
	}


	// ��Ʈ����ũ, �� ����
	private void increaseCount(List<Integer> com, List<Integer> player, int index, int playerIndex) {
		if(com.get(index) == player.get(playerIndex)) {
			increaseStrike(index, playerIndex);
			increaseBall(index, playerIndex);
		}
	}
	
	// �ε��� ��
	private boolean compare(int com, int player) {
		return com == player;
	}


	// �� ���� ����
	private void increaseBall(int com, int player) {
		if (!compare(com,player)) {
			ball++;
		}
	}



	// ��Ʈ����ũ ���� ����
	private void increaseStrike(int com, int player) {
		if (compare(com, player)) {
			strike++;
		}
	}
	
	// �ƿ��϶�	
	private boolean outCondition() {
		return  getBall()  == 0 && getStrike() == 0; 
	}
	
	// Ȩ���϶�
	private boolean homerunCondition() {
		return  getStrike() == 3; 
	}
	
	// ��� ǥ��
	public String result() {
		return homerunCondition() ? HUMERUN 
			  : (outCondition() ? OUT 
			  : STRIKE + getStrike() + " , " +BALL + getBall());	
	}
	
	private int getStrike() {
		return strike;
	}
	
	private int getBall() {
		return ball;
	}

}