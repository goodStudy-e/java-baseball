package view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.Test;

import model.Record;
import repository.Computer;
import repository.User;
import util.DataBoxing;

public class RecordTest {

	@Test
	public void compareTest() {
		Computer computer = new Computer();
		Set<Integer> comSet = computer.save();
		System.out.println(comSet);
		Scanner sc = new Scanner(System.in);
		User user = new User(sc);
		Set<Integer> userSet = user.save();
		
		Record game = new Record();
		game.compare(new DataBoxing().toList(comSet), new DataBoxing().toList(userSet));
		
		assertEquals(3, game.getBall());
	}
}
