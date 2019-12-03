package baseball;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName User
 * 
 * @Version 0.0.0
 * 
 * @Date 20191203
 * 
 * @author asqwklop12
 * 
 * @EMAIL asqwklop12@gmail.com
 *
 */
public class User implements NumberRepository {

	private static int MIN = -1;
	private static int MAX = 10;
	private Scanner sc;

	public User(Scanner sc) {
		this.sc = sc;
	}

	public int insert() {
		return sc.nextInt();
	}

	// 범위 지정
	private boolean range(int num) {
		return MIN < num && num < MAX;
	}

	@Override
	public Set<Integer> save() {
		Set<Integer> set = new HashSet<>();
		while (set.size() < REPOSITORYSIZE) {
			int num = insert();
			if (range(num)) {
				set.add(num);
			}
		}
		return set;
	}

}
