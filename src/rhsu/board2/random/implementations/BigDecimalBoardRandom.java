package rhsu.board2.random.implementations;

import java.math.BigDecimal;
import java.util.Random;
import rhsu.board2.implementations.BigDecimalBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class BigDecimalBoardRandom 
	extends BigDecimalBoard2 
	implements RandomBoard<BigDecimal>
{
	public BigDecimalBoardRandom(int horizontalSize, int verticalSize, BigDecimal defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigDecimalBoardRandom(int horizontalSize, int verticalSize)
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
