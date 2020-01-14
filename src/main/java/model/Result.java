package model;

import util.Talk;

public class Result {

	private static final String OUT = "OUT";
	private static final int DEFAULT_COUNT = 0;
	protected static final int MAX_COUNT = 3;
	private static final String STRIKE = "STRIKE:";
	private static final String BALL = "BALL:";
	private String state;

	public String answer(Record record) {
		state = STRIKE + record.getStrike() + " " + BALL + record.getBall();
		if (record.getStrike() == MAX_COUNT) {
			state = Talk.HUMRUN;
		}

		if (record.getBall() == DEFAULT_COUNT && record.getStrike() == DEFAULT_COUNT) {
			state = OUT;
		}

		return state;
	}

	public String getState() {
		return state;
	}

}
