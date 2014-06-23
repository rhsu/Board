package rhsu.board2.random.implementations;

import java.math.BigInteger;
import java.util.Random;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class BigIntegerRandomBoard 
	extends AbstractRandomBoard<BigInteger>
	implements RandomBoard<BigInteger>
{
	public BigIntegerRandomBoard(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator<BigInteger> randomGenerator() 
	{
		RandomGenerator<BigInteger> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public BigInteger getRandom() 
			{
				return new BigInteger(new Integer(random.nextInt()).toString());
			}	
		};
		return generator;
	}
}
