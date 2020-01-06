package repository;

import util.Construct;

public class Computer extends Player {

	public int generate() {
		return (int) (Math.random() * Construct.MAX_RANGE);
	}



}
