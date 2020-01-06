package view;

import java.util.List;
import java.util.Scanner;

import model.Record;
import model.Result;
import repository.Computer;
import repository.User;
import util.DataBoxing;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		Computer computer = new Computer();
		List<Integer> comSelect = DataBoxing.toList(computer.save());
		System.out.print("몇 번안에 맞추시겠습니까?: ");
		int t = sc.nextInt();
		User user = new User(sc);
		Record record = new Record();
		Result result = new Result();
		for (int i = 0; i < t; i++) {
			System.out.println(comSelect);
			record.compare(comSelect,DataBoxing.toList(user.save()));
			System.out.println(result.answer(record));
			
			if (result.getState().equals("HUMRUN")) {
				System.out.println("홈런입니다. 종료합니다.");
				return;
			}
			record.intialize();
		}
		
	}
}
