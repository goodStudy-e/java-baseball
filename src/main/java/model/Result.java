package model;

public class Result {

	private static final String HUMRUN = "HUMRUN";
	private static final String OUT = "OUT";
	private String state;

	public String answer(Record record) {

		state = record.getStrike() + "S" + record.getBall() + "B";
		if (record.getStrike() == 3) {
			return state = HUMRUN;
		}

		if (record.getBall() == 0 && record.getStrike() == 0) {
			return state = OUT;
		}

		return state;
	}

	public String getState() {
		return state;
	}

}
