package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DataBoxing {
	
	public static List<Integer> toList(Set<Integer> set) {
		return new ArrayList<Integer>(set);
	}

}
