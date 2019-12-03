package baseball;

import java.util.Scanner;

/**
 *  @ClassName User
 *  
 *  @Version 0.0.0
 *  
 *  @Date 20191203
 *  
 *  @author asqwklop12 
 * 
 *  @EMAIL asqwklop12@gmail.com
 *
 */
public class User extends NumberRepository{
	
	public int insertNumber(Scanner sc) {
		System.out.println("숫자를  입력해주세요.");
		return sc.nextInt();
	}	
	
}
