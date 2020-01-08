package repository;

import java.util.LinkedHashSet;
import java.util.Set;

import util.Construct;

public abstract class Player {

	private static final int MIN_RANGE = -1;

	private boolean range(int number) {
		return MIN_RANGE < number && number < Construct.MAX_RANGE;
	}

	protected abstract int generate();

	public Set<Integer> save() {
		Set<Integer> callNumbers = new LinkedHashSet<>();

		while (callNumbers.size() != Construct.MAX_COUNT) {
			int number = generate();
			if (range(number)) {

				callNumbers.add(number);

			}

		}

		return callNumbers;
	}
}
