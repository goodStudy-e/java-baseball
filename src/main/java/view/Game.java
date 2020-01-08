package view;

import java.util.List;
import java.util.Scanner;

import model.Record;
import model.Result;
import repository.Computer;
import repository.User;
import util.DataBoxing;
import util.Tell;

public class Game {
	
	public void generate() {
		Scanner sc = new  Scanner(System.in);
		Computer computer = new Computer();
		List<Integer> comSelect = DataBoxing.toList(computer.save());
		System.out.println(Tell.GREET);
		System.out.print(Tell.HOW_COUNT);
		int t = sc.nextInt();
		User user = new User(sc);
		Record record = new Record();
		Result result = new Result();
		for (int i = 0; i < t; i++) {
			record.compare(comSelect,DataBoxing.toList(user.save()));
			System.out.println(result.answer(record));
			
			if (result.getState().equals(Tell.HUMRUN)) {
				System.out.println(Tell.WINNER);
				return;
			}
			record.crear();
		}
	}
	
}
