package rhsu.board2.randomGenerators;

import java.util.Random;
import rhsu.board2.RandomGenerator;

public class BooleanRandomGenerator implements RandomGenerator<Boolean>
{
	@Override
	public Boolean getRandom()
	{
		return new Random().nextBoolean();
	}
}
