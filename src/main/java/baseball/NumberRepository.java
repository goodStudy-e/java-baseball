package baseball;

import java.util.HashSet;
import java.util.Set;

/**
 *  @ClassName NumberRepository
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

public class NumberRepository {

	private static final int REPOSITORYSIZE = 3;
	
	
	public Set<Integer> save(int number) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < REPOSITORYSIZE) {
			set.add(number);
		}
		return set;
	}
	
}