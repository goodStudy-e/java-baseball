package repository;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Player {

	public abstract int generate();


	public Set<Integer> save() {
		Set<Integer> storage = new LinkedHashSet<>();

		while(storage.size() != 3) {
			storage.add(generate());
		}
		
		return storage;
	}
}
