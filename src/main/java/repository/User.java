package repository;

import java.util.Scanner;

public class User extends Player {

	public boolean range(int number) {
		return -1 < number && number < 10;
	}

	@Override
	public int generate() {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
        if(range(number)) {
    		return number;	
        }
        
        return generate();
	}

}
