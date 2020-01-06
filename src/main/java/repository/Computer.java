package repository;

public class Computer extends Player {

	public int generate() {
		return (int) (Math.random() * 10);
	}

}
