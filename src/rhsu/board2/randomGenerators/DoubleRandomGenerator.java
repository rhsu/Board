package rhsu.board2.randomGenerators;

import java.util.Random;

public class DoubleRandomGenerator extends AbstractRandomGenerator<Double>
{
	@Override
	public Double getRandom()
	{ 
		return new Random().nextDouble();
	}	
}
