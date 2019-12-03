package baseball;

import java.util.Scanner;

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


	@Override
	public int insert() {
		return sc.nextInt();
	}


}
