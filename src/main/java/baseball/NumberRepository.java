package baseball;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName NumberRepository
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

public abstract class NumberRepository {

	private static final int REPOSITORYSIZE = 3;
	private static int MIN = -1;
	private static int MAX = 10;
	
	// 범위 지정
	private boolean range(int num) {
		return MIN < num && num < MAX;
	}

	// 숫자 입력
	protected abstract int insert();

	// 숫자 저장
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