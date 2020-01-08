package model;

import util.Construct;
import util.Tell;

public class Result {

	private static final String OUT = "OUT";
	private static final int DEFAULT_COUNT = 0;
	private static final String STRIKE = "STRIKE";
	private static final String BALL = "BALL";
	private String state;

	public String answer(Record record) {
		state = record.getStrike() + STRIKE + record.getBall() + BALL;
		if (record.getStrike() == Construct.MAX_COUNT) {
			state = Tell.HUMRUN;
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
