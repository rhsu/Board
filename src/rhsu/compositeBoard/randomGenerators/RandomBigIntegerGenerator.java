package rhsu.compositeBoard.randomGenerators;

import java.math.BigInteger;
import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class RandomBigIntegerGenerator implements RandomGenerator<BigInteger>
{
	@Override
	public BigInteger getRandom()
	{
		Random random = new Random();
		return new BigInteger(new Integer(random.nextInt()).toString());
	}
}
