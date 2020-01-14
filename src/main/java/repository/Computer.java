package repository;

import java.util.Random;

public class Computer implements NumberRepository {

	public int generate() {
		return  new Random().nextInt(MAX_RANGE);
	}

}
