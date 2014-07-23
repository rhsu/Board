package rhsu.board2.randomGenerators;

import java.math.BigDecimal;
import java.util.Random;
import rhsu.board2.RandomGenerator;

public class BigDecimalRandomGenerator implements RandomGenerator<BigDecimal>
{
	@Override
	public BigDecimal getRandom()
	{
		return new BigDecimal(new Random().nextDouble());
	}
}