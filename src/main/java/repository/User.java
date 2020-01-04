package repository;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class User {

	private Scanner sc;
	
	public User(Scanner sc) {
		this.sc = sc;
	}
	

	public boolean range(int number) {
		return -1 < number && number < 10;
	}

	public int generate() {
		int number = sc.nextInt();
		return number;
	}

	public Set<Integer> save() {
		Set<Integer> callNumbers = new LinkedHashSet<>();

		while (callNumbers.size() != 3) {
			int number = generate();
			if (range(number)) {
				callNumbers.add(number);
				System.out.println("정상적으로 저장 되엇습니다.");
			} else {
				System.out.println("범위를 넘어섰습니다. 다시 입력해주세요.");	
			}
			
		}

		return callNumbers;
	}

}
