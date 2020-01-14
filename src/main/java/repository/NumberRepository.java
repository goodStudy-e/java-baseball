package repository;

import java.util.LinkedHashSet;
import java.util.Set;

public interface NumberRepository {

	static final int MAX_COUNT = 3;
	static final int MIN_RANGE = -1;
	static final int MAX_RANGE = 10;

	int generate();
	

	static boolean range(int number) {
		return MIN_RANGE < number && number < MAX_RANGE;
	}

	default Set<Integer> save() {
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
