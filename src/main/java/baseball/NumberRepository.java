package baseball;

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

public interface NumberRepository {

	static final int REPOSITORYSIZE = 3;
	
	public int insert();
	public Set<Integer> save(); 
	
}