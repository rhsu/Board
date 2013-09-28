package rhsu.board.random;

import java.util.Random;

/**
 *
 * @author rhsu
 */
public abstract class AbstractRandomGenerator<T> implements RandomGenerator<T>
{
	protected T limit;
	protected Random random;
	
	public AbstractRandomGenerator()
	{
		random = new Random();
	}
	
	public AbstractRandomGenerator(int seed)
	{
		random = new Random(seed);
	}
	
	public void setLimit(T limit)
	{
		this.limit = limit;
	}
}
