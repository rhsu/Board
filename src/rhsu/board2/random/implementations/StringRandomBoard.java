package rhsu.board2.random.implementations;

import java.util.UUID;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.random.RandomGenerator;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;

public class StringRandomBoard 
	extends AbstractRandomBoard<String> 
	implements RandomBoard<String>
{
	public StringRandomBoard(int horizontalSize, int verticalSize, String defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}

	public StringRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	public StringRandomBoard(int horizontalSize, int verticalSize, RandomGenerator randomGenerator)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator<String> randomGenerator()
	{
		RandomGenerator<String> generator = new RandomGenerator() 
		{
			@Override
			public Object getRandom()
			{
				return UUID.randomUUID().toString();
			}
		};
		
		return generator;
	}
	
	public static void main(String[] args)
	{
		StringRandomBoard board = new StringRandomBoard(2,2);
		System.out.println(board);
	}
}
