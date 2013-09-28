package rhsu.board.random;

/**
 *
 * @author rhsu
 */
public class DoubleRandomGenerator extends AbstractRandomGenerator<Double>
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
		return (limit == null) ? random.nextDouble(): random.nextDouble();
	}	
}
