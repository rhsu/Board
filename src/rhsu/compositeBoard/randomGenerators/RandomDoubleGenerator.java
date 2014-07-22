package rhsu.compositeBoard.randomGenerators;

import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class RandomDoubleGenerator implements RandomGenerator<Double>
{
	@Override
	public Double getRandom()
	{
		Random random = new Random();
		return random.nextDouble();
	}	
}
