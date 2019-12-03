package baseball;

import java.util.HashSet;
import java.util.Set;

/**
 *  @ClassName Computer
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
public class Computer{
	
	private static final int NUMBER_RANGE = 9;
	
	public int insertRandomNumber() {	
		return (int) Math.random() * NUMBER_RANGE;
	}	
	
	
	public Set<Integer> numbetSet(int number) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 3) {
			set.add(number);
		}
		return set;
	}
	
}
