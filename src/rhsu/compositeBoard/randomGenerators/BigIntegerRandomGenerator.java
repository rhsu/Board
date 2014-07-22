package rhsu.compositeBoard.randomGenerators;

import java.math.BigInteger;
import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class BigIntegerRandomGenerator implements RandomGenerator<BigInteger>
{
	@Override
	public BigInteger getRandom()
	{
		return new BigInteger(new Integer(new Random().nextInt()).toString());
	}
}
