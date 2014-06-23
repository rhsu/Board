package rhsu.board2.random.implementations;

import java.math.BigDecimal;
import java.util.Random;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class BigDecimalRandomBoard 
	extends AbstractRandomBoard<BigDecimal> 
	implements RandomBoard<BigDecimal>
{
	public BigDecimalRandomBoard(int horizontalSize, int verticalSize, BigDecimal defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigDecimalRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}

	@Override
	public RandomGenerator<BigDecimal> randomGenerator()
	{
		RandomGenerator<BigDecimal> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public BigDecimal getRandom() 
			{
				return new BigDecimal(random.nextDouble());
			}
		};
		return generator;
	}
}
