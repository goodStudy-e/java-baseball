package view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.Test;

import repository.Computer;
import repository.User;
import util.DataBoxing;

public class ResultTest {

	@Test
	public void answerTest() {
		Computer computer = new Computer();
		Set<Integer> comSet = computer.save();
		System.out.println(comSet);
		Scanner sc = new Scanner(System.in);
		User user = new User(sc);
		Set<Integer> userSet = user.save();
		
		Record record = new Record();
		record.compare(new DataBoxing().toList(comSet), new DataBoxing().toList(userSet));

		Result result = new Result();
		
		System.out.println(result.answer(record));
		assertEquals(1+"S"+2+"B", result.answer(record));
		
	}
}
