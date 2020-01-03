package repository;

public class Computer extends Player {

	@Override
	public int generate() {
		return (int)(Math.random() * 10);
	}

}
