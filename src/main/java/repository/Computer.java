package repository;

import static repository.Player.MAX_RANGE;

public class Computer extends Player {

	public int generate() {
		return (int) ((Math.random()) * (MAX_RANGE));
	}

}
