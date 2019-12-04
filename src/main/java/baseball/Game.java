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
	public void play(List<Integer> com, List<Integer> player) {
		
		for (int index = 0; index < com.size(); index++) {            
			computerCompareToPlayer(com, player, index);
		}

		
	}

	// 컴퓨터와 플레이어 비교
	private void computerCompareToPlayer(List<Integer> com, List<Integer> player, int index) {
		for (int j = 0; j < player.size(); j++) {     
			increaseCount(com, player, index, j);
				
		}
	}


	// 스트라이크, 볼 증가
	private void increaseCount(List<Integer> com, List<Integer> player, int index, int playerIndex) {
		if(com.get(index) == player.get(playerIndex)) {
			increaseStrike(index, playerIndex);
			increaseBall(index, playerIndex);
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
	private boolean outCondition() {
		return  getBall()  == 0 && getStrike() == 0; 
	}
	
	// 홈런일때
	private boolean homerunCondition() {
		return  getStrike() == 3; 
	}
	
	// 결과 표시
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