package rhsu.board2.randomGenerators;

import java.util.UUID;

public class StringRandomGenerator extends AbstractRandomGenerator<String>
{
	@Override
	public String getRandom()
	{
		return UUID.randomUUID().toString();
	}
}
