package rhsu.compositeBoard.randomGenerators;

import java.math.BigDecimal;
import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class RandomBigDecimalGenerator implements RandomGenerator<BigDecimal>
{
	@Override
	public BigDecimal getRandom()
	{
		return new BigDecimal(new Random().nextDouble());
	}
}