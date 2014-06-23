package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.implementations.DoubleBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator2;

public class DoubleBoardRandom 
	extends DoubleBoard2
	implements RandomBoard<Double>
{
	public DoubleBoardRandom(int horizontalSize, int verticalSize, Double defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public DoubleBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator2<Double> randomGenerator() 
	{
		RandomGenerator2<Double> generator = new RandomGenerator2()
		{
			Random random = new Random();
			
			@Override
			public Double getRandom() 
			{
				return random.nextDouble();
			}	
		};
		
		return generator;
	}
}
