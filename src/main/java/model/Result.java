package model;

public class Result {

	private static final String HUMRUN = "HUMRUN";
	private static final String OUT = "OUT";
	private static final int MAX_COUNT = 3;
	private static final int DEFAULT_COUNT = 0;
	private static final String INITIALS_S = "S";
	private static final String INITIALS_B = "B";
	private String state;

	public String answer(Record record) {

		state = record.getStrike() + INITIALS_S + record.getBall() + INITIALS_B;
		if (record.getStrike() == MAX_COUNT) {
			return state = HUMRUN;
		}

		if (record.getBall() == DEFAULT_COUNT && record.getStrike() == DEFAULT_COUNT) {
			return state = OUT;
		}

		return state;
	}

	public String getState() {
		return state;
	}

}
