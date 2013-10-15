package rhsu.board.randomDeprecated;

/**
 *
 * @author rhsu
 */
public class DoubleRandomGenerator extends AbstractNumberRandomGenerator<Double>
{	
	public DoubleRandomGenerator()
	{
		super();
	}
	
	public DoubleRandomGenerator(int seed)
	{
		super(seed);
	}
	
	@Override
	public Double getRandom() 
	{
		return random.nextDouble();
	}	
}
