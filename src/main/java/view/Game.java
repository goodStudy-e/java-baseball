package view;

import java.util.List;
import java.util.Scanner;

import model.Record;
import model.Result;
import repository.Computer;
import repository.User;
import util.DataBoxing;

public class Game {
	
	public void generate() {
		Scanner sc = new  Scanner(System.in);
		Computer computer = new Computer();
		List<Integer> comSelect = DataBoxing.toList(computer.save());
		System.out.println("안녕하세요. 야구 게임입니다. 숫자는 스페이스(공백)으로 구분됩니다.");
		System.out.print("몇 번안에 맞추시겠습니까?: ");
		int t = sc.nextInt();
		User user = new User(sc);
		Record record = new Record();
		Result result = new Result();
		for (int i = 0; i < t; i++) {
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
