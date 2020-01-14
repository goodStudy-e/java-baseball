package view;

import java.util.List;
import java.util.Scanner;

import model.Record;
import model.Result;
import repository.Computer;
import repository.User;
import util.DataBoxing;
import util.Talk;

public class Game {
	private static final int HUMRUN = 3;

	private List<Integer> settingComputer() {
		Computer computer = new Computer();
		List<Integer> comSelect = DataBoxing.toList(computer.save());
		System.out.println(comSelect);
		System.out.println(Talk.GREET);
		return comSelect;
	}

	private int settingCount(Scanner sc) {
		System.out.print(Talk.HOW_COUNT);
		return sc.nextInt();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		printResult(settingComputer(), settingCount(sc), new User(sc), new Record(), new Result());
	}

	private void printResult(List<Integer> comSelect, int time, User user, Record record, Result result) {
		for (int i = 0; i < time; i++) {
			record.compare(comSelect, DataBoxing.toList(user.save()));
			System.out.println(result.answer(record));

			if (record.getStrike() == HUMRUN) {
				System.out.println(Talk.WINNER);
				return;
			}
			record.clear();
		}
	}

}
