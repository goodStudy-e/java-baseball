package baseball;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
public class User {
	
	public int insertNumber(Scanner sc) {
		System.out.println("숫자를  입력해주세요.");
		return sc.nextInt();
	}	
	
	
	public Set<Integer> numbetSet(int number) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 3) {
			set.add(number);
		}
		return set;
	}
}
