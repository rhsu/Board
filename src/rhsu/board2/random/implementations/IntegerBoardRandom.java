package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.implementations.IntegerBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class IntegerBoardRandom 
	extends IntegerBoard2
	implements RandomBoard<Integer>
{
	public IntegerBoardRandom(int horizontalSize, int verticalSize, Integer defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public IntegerBoardRandom(int horizontalSize, int verticalSize)
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
