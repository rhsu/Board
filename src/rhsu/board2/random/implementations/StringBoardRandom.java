package rhsu.board2.random.implementations;

import java.util.UUID;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.random.RandomGenerator;
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
	
	public StringBoardRandom(int horizontalSize, int verticalSize, RandomGenerator randomGenerator)
	{
		super(horizontalSize, verticalSize);
		//TODO: Need to think this one through;
		//Maybe initializing the board array isn't done or we set a flag to not call initialize board arry?
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
	
	@Override
	public void initializeBoardArray()
	{
		int columnNumber = 0;
		
		RandomGenerator<String> randomGenerator = this.randomGenerator();
		
		for (BoardPieceImpl<String>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, columnNumber, randomGenerator.getRandom());
			}
			columnNumber++;
		}
	}
	
	public static void main(String[] args)
	{
		StringBoardRandom board = new StringBoardRandom(2,2);
		System.out.println(board);
	}
}
