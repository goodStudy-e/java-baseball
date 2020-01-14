package repository;

import java.util.Scanner;

public class User implements NumberRepository {

	private Scanner sc;

	public User(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public int generate() {
		int number = sc.nextInt();
		return number;
	}

}
