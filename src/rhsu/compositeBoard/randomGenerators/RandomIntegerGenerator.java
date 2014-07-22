package rhsu.compositeBoard.randomGenerators;

import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class RandomIntegerGenerator implements RandomGenerator<Integer>
{
	@Override
	public Integer getRandom()
	{
		return new Random().nextInt();
	}
}
