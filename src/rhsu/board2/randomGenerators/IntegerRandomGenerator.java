package rhsu.board2.randomGenerators;

import java.util.Random;
import rhsu.board2.RandomGenerator;

public class IntegerRandomGenerator implements RandomGenerator<Integer>
{
	@Override
	public Integer getRandom()
	{
		return new Random().nextInt();
	}
}
