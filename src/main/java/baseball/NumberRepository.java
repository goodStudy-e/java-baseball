package baseball;

import java.util.HashSet;
import java.util.LinkedHashSet;
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

	
	// 범위가 맞으면 실행
	private void rangeTrue(Set<Integer> set, int num) {
		if (range(num)) {
			set.add(num);
		}
	}
	
	
	// 숫자 저장
	public Set<Integer> save() {
		Set<Integer> set = new LinkedHashSet<>();
		while (set.size() < REPOSITORYSIZE) {
			int num = insert();
			rangeTrue(set, num);
		}
		return set;
	}

	

}