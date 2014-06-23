package rhsu.board2.random.implementations;

import java.math.BigInteger;
import java.util.Random;
import rhsu.board2.implementations.BigIntegerBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator2;

public class BigIntegerBoardRandom 
	extends BigIntegerBoard2
	implements RandomBoard<BigInteger>
{
	public BigIntegerBoardRandom(int horizontalSize, int verticalSize, BigInteger defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public BigIntegerBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator2<BigInteger> randomGenerator() 
	{
		RandomGenerator2<BigInteger> generator = new RandomGenerator2()
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
