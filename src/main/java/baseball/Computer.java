package baseball;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Computer
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
public class Computer extends NumberRepository {

	private static final int NUMBER_RANGE = 9;

	private int insert() {
		return (int) (Math.random() * NUMBER_RANGE);
	}

	@Override
	public Set<Integer> save() {
		Set<Integer> set = new HashSet<>();
		while (set.size() < REPOSITORYSIZE) {
			set.add(insert()());
		}
		return set;
	}

}
