package rhsu.board2.randomGenerators;

import java.util.Random;

public class IntegerRandomGenerator extends AbstractRandomGenerator<Integer>
{
	@Override
	public Integer getRandom()
	{
		return new Random().nextInt();
	}
}
