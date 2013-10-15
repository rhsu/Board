package rhsu.board.randomDeprecated;

import rhsu.board.RandomGenerator;
import java.util.UUID;

/**
 *
 * @author rhsu
 */
public class StringRandomGenerator implements RandomGenerator<String>
{
	@Override
	public String getRandom() 
	{	
		return UUID.randomUUID().toString();
	}
}
