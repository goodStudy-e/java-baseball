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
	
	//set -> list로 바꾸는 메소드 
	public List<Integer> toList(Set<Integer> set) {
		List<Integer> list = new LinkedList<>();
		list.addAll(set);
		return list;
	}
	
	
	
	// 숫자 야구게임 실행
	public void play(List<Integer> com, List<Integer> player ) {
		
		for (int i = 0; i < com.size(); i++) {            
			computerCompareToPlayer(com, player, i);
		}

		
	}

	// 컴퓨터와 플레이어 비교
	private void computerCompareToPlayer(List<Integer> comList, List<Integer> playerList, int player) {
		for (int i = 0; i < playerList.size(); i++) {     
			increaseCount(comList, playerList, player, i);
				
		}
	}


	// 스트라이크, 볼 증가
	private void increaseCount(List<Integer> comList, List<Integer> playerList, int com, int player) {
		if(comList.get(com) == playerList.get(player)) {
			increaseStrike(com, player);
			increaseBall(com, player);
			
		}
	}
	
	// 인덱스 비교
	private boolean compare(int com, int player) {
		return com == player;
	}


	// 볼 갯수 증가
	private void increaseBall(int com, int player) {
		if (!compare(com,player)) {
			ball++;
		}
	}


	// 스트라이크 갯수 증가
	private void increaseStrike(int com, int player) {
		if (compare(com, player)) {
			strike++;
		}
	}
	
	// 아웃일때	
	private boolean isNotOut() {
		int zero = 0;
		return  !(getBall()  == zero && getStrike() == zero); 
	}
	
	// 홈런일때
	public boolean isHomerun() {
		int three = 3;
		return  getStrike() == three; 
	}
	
	
	// 결과 표시
	public String result() {
		return isHomerun() ? HUMERUN 
			  : (isNotOut() ? STRIKE + getStrike() + " , " +BALL + getBall() 
			  :  OUT);
	}
	
	// 볼 , 스트라이크 초기화
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