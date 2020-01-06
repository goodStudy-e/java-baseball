package repository;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Player {

	public boolean range(int number) {
		return -1 < number && number < 10;
	}

	public abstract int generate();

	public Set<Integer> save() {
		Set<Integer> callNumbers = new LinkedHashSet<>();

		while (callNumbers.size() != 3) {
			int number = generate();
			if (range(number)) {
				callNumbers.add(number);
			}

		}

		return callNumbers;
	}
}
