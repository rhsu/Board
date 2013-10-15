package rhsu.board.random;

/**
 *
 * @author rhsu
 */
public class IntegerRandomGenerator extends AbstractNumberRandomGenerator<Integer>
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
		return random.nextInt();
	}
}
