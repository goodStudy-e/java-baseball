package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class UserTest {
	private Scanner sc = new Scanner(System.in);
	private User user = new User(sc);

	@Test
	public void sizeTest() {
		assertEquals(3, user.save().size());
	}
}
