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
	public void play(List<Integer> com, List<Integer> player ) {
		
		for (int i = 0; i < com.size(); i++) {            
			computerCompareToPlayer(com, player, i);
		}

		
	}

	// ��ǻ�Ϳ� �÷��̾� ��
	private void computerCompareToPlayer(List<Integer> comList, List<Integer> playerList, int player) {
		for (int i = 0; i < playerList.size(); i++) {     
			increaseCount(comList, playerList, player, i);
				
		}
	}


	// ��Ʈ����ũ, �� ����
	private void increaseCount(List<Integer> comList, List<Integer> playerList, int com, int player) {
		if(comList.get(com) == playerList.get(player)) {
			increaseStrike(com, player);
			increaseBall(com, player);
			
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
	private boolean isNotOut() {
		int zero = 0;
		return  !(getBall()  == zero && getStrike() == zero); 
	}
	
	// Ȩ���϶�
	public boolean isHomerun() {
		int three = 3;
		return  getStrike() == three; 
	}
	
	
	// ��� ǥ��
	public String result() {
		return isHomerun() ? HUMERUN 
			  : (isNotOut() ? STRIKE + getStrike() + " , " +BALL + getBall() 
			  :  OUT);
	}
	
	// �� , ��Ʈ����ũ �ʱ�ȭ
	public void intailize() {
		this.strike = 0;
		this.ball = 0;
	}
	
	private int getStrike() {
		return strike;
	}
	
	private int getBall() {
		return ball;
	}

}