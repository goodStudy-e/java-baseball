package view;

public class Result {

	private static final String HUMRUN = "HUMRUN";
	private static final String OUT = "OUT";
	
	public String answer(Record record) {
		
		if (record.getStrike() == 3) {
			return HUMRUN;
		}
		
		if (record.getBall() == 0 && record.getStrike() == 0) {
			return OUT;
		}
		
		return record.getStrike() + "S" + record.getBall() + "B";
	}
}
