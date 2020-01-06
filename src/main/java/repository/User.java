package repository;

import java.util.Scanner;

public class User extends Player {

	private Scanner sc;

	public User(Scanner sc) {
		this.sc = sc;
	}

	public int generate() {
		int number = sc.nextInt();
		return number;
	}

}
