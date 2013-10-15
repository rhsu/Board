package rhsu.board.randomDeprecated;

import rhsu.board.RandomGenerator;
import java.util.Random;

/**
 *
 * @author rhsu
 */
public class BooleanRandomGenerator implements RandomGenerator<Boolean>
{
	@Override
	public Boolean getRandom() 
	{
		return new Random().nextBoolean();
	}
}
