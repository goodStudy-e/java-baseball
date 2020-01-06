package model;

import java.util.List;

public class Record {

	private int ball;
	private int strike;

	public void compare(List<Integer> com, List<Integer> user) {

		for (int i = 0; i < com.size(); i++) {

			for (int j = 0; j < user.size(); j++) {

				if (i == j && com.get(i) == user.get(j)) {
					strike++;
				}
				if (i != j && com.get(i) == user.get(j)) {
					ball++;
				}
			}
		}
	}
	
	public void intialize() {
		this.ball = 0;
		this.strike = 0;
	}
	
	public int getBall() {
		return ball;
	}
	
	public int getStrike() {
		return strike;
	}
}
