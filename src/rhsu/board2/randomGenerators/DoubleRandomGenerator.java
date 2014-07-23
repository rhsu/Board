package rhsu.board2.randomGenerators;

import java.util.Random;
import rhsu.board2.RandomGenerator;

public class DoubleRandomGenerator implements RandomGenerator<Double>
{
	@Override
	public Double getRandom()
	{ 
		return new Random().nextDouble();
	}	
}
