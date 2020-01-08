package repository;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Player {

	protected static final int MAX_COUNT = 3;
	protected static final int MIN_RANGE = -1;
	protected static final int MAX_RANGE = 10;

	private boolean range(int number) {
		return MIN_RANGE < number && number < MAX_RANGE;
	}

	protected abstract int generate();

	public Set<Integer> save() {
		Set<Integer> callNumbers = new LinkedHashSet<>();

		while (callNumbers.size() != MAX_COUNT) {
			int number = generate();
			if (range(number)) {

				callNumbers.add(number);

			}

		}

		return callNumbers;
	}
}
