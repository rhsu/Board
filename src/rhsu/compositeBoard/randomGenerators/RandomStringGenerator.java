package rhsu.compositeBoard.randomGenerators;

import java.util.UUID;
import rhsu.board2.random.RandomGenerator;

public class RandomStringGenerator implements RandomGenerator<String>
{
	@Override
	public String getRandom()
	{
		return UUID.randomUUID().toString();
	}
}
