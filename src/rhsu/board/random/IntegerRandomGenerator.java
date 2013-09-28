package rhsu.board.random;

/**
 *
 * @author rhsu
 */
public class IntegerRandomGenerator extends AbstractRandomGenerator<Integer>
{	
	public IntegerRandomGenerator()
	{
		super();
	}
	
	public IntegerRandomGenerator(int seed)
	{
		super(seed);
	}
		
	@Override
	public Integer getRandom() 
	{
		return (limit == null) ? random.nextInt() : random.nextInt(limit);
	}
}
