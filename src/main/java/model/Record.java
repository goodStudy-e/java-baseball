package model;

import java.util.List;

public class Record {

	private final static int BASEBALL_COUNT = 3;
	private int ball;
	private int strike;
	private boolean isStrike;

	public void compare(List<Integer> com, List<Integer> user) {
		for (int i = 0; i < BASEBALL_COUNT; i++) {
			isStrike = true;
			strikeUp(com, user, i);
			ballUp(com, user, i);
		}

	}

	private void strikeUp(List<Integer> com, List<Integer> user, int index) {
		if (com.get(index) == user.get(index)) {
			strike++;
			isStrike = false;
		}
	}

	private void ballUp(List<Integer> com, List<Integer> user, int index) {
		for (int j = 0; j < BASEBALL_COUNT; j++) {
			if (com.get(index) == user.get(j) && isStrike) {
				ball++;
			}
		}
	}

	public void clear() {
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
