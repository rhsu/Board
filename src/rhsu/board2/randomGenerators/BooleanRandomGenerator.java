package rhsu.board2.randomGenerators;

import java.util.Random;

public class BooleanRandomGenerator extends AbstractRandomGenerator<Boolean>
{
	@Override
	public Boolean getRandom()
	{
		return new Random().nextBoolean();
	}
}
