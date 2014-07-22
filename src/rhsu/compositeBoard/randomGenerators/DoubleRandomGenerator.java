package rhsu.compositeBoard.randomGenerators;

import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class DoubleRandomGenerator implements RandomGenerator<Double>
{
	@Override
	public Double getRandom()
	{ 
		return new Random().nextDouble();
	}	
}
