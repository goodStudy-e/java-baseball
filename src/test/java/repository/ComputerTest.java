package repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ComputerTest {

	private Computer com = new Computer();
	private static final int MAX = 1000000;

	@Test
	public void 숫자가_범위를_넘을때_Test() {
		for (int i = 0; i < MAX; i++) {
			assertFalse(com.generate() > 9);
		}
	}

	@Test
	public void 숫자가_범위보다_작을때_Test() {
		for (int i = 0; i < MAX; i++) {
			assertFalse(com.generate() < 0);
		}
	}

	@Test
	public void countTest() {

		assertEquals(3, com.save().size());
	}
}
