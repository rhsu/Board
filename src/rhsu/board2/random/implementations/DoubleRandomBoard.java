package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class DoubleRandomBoard 
	extends AbstractRandomBoard<Double>
	implements RandomBoard<Double>
{
	public DoubleRandomBoard(int horizontalSize, int verticalSize, Double defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public DoubleRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator<Double> randomGenerator() 
	{
		RandomGenerator<Double> generator = new RandomGenerator()
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
