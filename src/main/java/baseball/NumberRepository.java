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
	
	// ���� ����
	private boolean range(int num) {
		return MIN < num && num < MAX;
	}

	// ���� �Է�
	protected abstract int insert();

	
	// ������ ������ ����
	private void rangeTrue(Set<Integer> set, int num) {
		if (range(num)) {
			set.add(num);
		}
	}
	
	
	// ���� ����
	public Set<Integer> save() {
		Set<Integer> set = new LinkedHashSet<>();
		while (set.size() < REPOSITORYSIZE) {
			int num = insert();
			rangeTrue(set, num);
		}
		return set;
	}

	

}