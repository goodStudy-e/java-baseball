package baseball;

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
public class Computer extends NumberRepository{
	
	private static final int NUMBER_RANGE = 9;
	
	public int insertRandomNumber() {	
		return (int) Math.random() * NUMBER_RANGE;
	}	
		
}
