package rhsu.board2.randomGenerators;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerRandomGenerator extends AbstractRandomGenerator
{
	@Override
	public BigInteger getRandom()
	{
		return new BigInteger(new Integer(new Random().nextInt()).toString());
	}
}
