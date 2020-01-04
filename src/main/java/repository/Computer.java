package repository;

import java.util.LinkedHashSet;
import java.util.Set;

public class Computer {

	public int generate() {
		return (int) (Math.random() * 10);
	}

	public Set<Integer> save() {
		Set<Integer> callNumbers = new LinkedHashSet<>();

		while (callNumbers.size() != 3) {
			int number = generate();
			callNumbers.add(number);
		}

		return callNumbers;
	}
}
