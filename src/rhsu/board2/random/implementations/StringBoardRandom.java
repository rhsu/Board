package rhsu.board2.random.implementations;

import java.util.UUID;
import rhsu.board2.random.RandomGenerator2;
import rhsu.board2.implementations.StringBoard2;
import rhsu.board2.random.RandomBoard;

public class StringBoardRandom 
	extends StringBoard2 
	implements RandomBoard<String>
{
	public StringBoardRandom(int horizontalSize, int verticalSize, String defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}

	public StringBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	public StringBoardRandom(int horizontalSize, int verticalSize, RandomGenerator2 randomGenerator)
	{
		super(horizontalSize, verticalSize);
		//TODO: Need to think this one through;
		//Maybe initializing the board array isn't done or we set a flag to not call initialize board arry?
	}
	
	@Override
	public RandomGenerator2<String> randomGenerator()
	{
		RandomGenerator2<String> generator = new RandomGenerator2() 
		{
			@Override
			public Object getRandom()
			{
				return UUID.randomUUID().toString();
			}
		};
		
		return generator;
	}
}
