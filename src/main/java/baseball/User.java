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
public class User extends NumberRepository {

	private Scanner sc;
	
	public User(Scanner sc) {
		this.sc = sc;
	}
	
	private int insertNumber() {
		return sc.nextInt();
	}

	@Override
	public Set<Integer> save() {
		Set<Integer> set = new HashSet<>();
		while (set.size() < REPOSITORYSIZE) {
			set.add(insertNumber());
		}
		return set;
	}
	
	

}
