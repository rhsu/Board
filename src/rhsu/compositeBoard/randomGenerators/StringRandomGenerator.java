package rhsu.compositeBoard.randomGenerators;

import java.util.UUID;
import rhsu.board2.RandomGenerator;

public class StringRandomGenerator implements RandomGenerator<String>
{
	@Override
	public String getRandom()
	{
		return UUID.randomUUID().toString();
	}
}
