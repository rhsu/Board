package rhsu.board2.randomGenerators;

import java.math.BigDecimal;
import java.util.Random;

public class BigDecimalRandomGenerator extends AbstractRandomGenerator<BigDecimal>
{
	@Override
	public BigDecimal getRandom()
	{
		return new BigDecimal(new Random().nextDouble());
	}
}