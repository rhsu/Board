package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class IntegerRandomBoard 
	extends AbstractRandomBoard<Integer>
	implements RandomBoard<Integer>
{
	public IntegerRandomBoard(int horizontalSize, int verticalSize, Integer defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public IntegerRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator<Integer> randomGenerator() 
	{	
		RandomGenerator<Integer> generator = new RandomGenerator()
		{
			Random random = new Random();
			
			@Override
			public Integer getRandom() 
			{
				return random.nextInt();
			}	
		};
		return generator;
	}
}
