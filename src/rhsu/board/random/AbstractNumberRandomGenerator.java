package rhsu.board.random;

import java.util.Random;

/**
 *
 * @author rhsu
 */
public abstract class AbstractNumberRandomGenerator<T> implements RandomGenerator<T>
{
	protected Random random;
	
	public AbstractNumberRandomGenerator()
	{
		random = new Random();
	}
	
	public AbstractNumberRandomGenerator(int seed)
	{
		random = new Random(seed);
	}
}
