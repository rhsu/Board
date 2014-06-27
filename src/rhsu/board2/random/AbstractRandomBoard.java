package rhsu.board2.random;

import rhsu.board2.BoardImpl;
import rhsu.board2.BoardPieceImpl;

public abstract class AbstractRandomBoard<T> 
	extends BoardImpl<T>
	implements RandomBoard<T>
{
	public AbstractRandomBoard(int horizontalSize, int verticalSize, T defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public AbstractRandomBoard(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public void initializeBoardArray()
	{
		int columnNumber = 0;
		
		RandomGenerator<T> randomGenerator = this.randomGenerator();
		
		for (BoardPieceImpl<T>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, columnNumber, randomGenerator.getRandom());
			}
			columnNumber++;
		}
	}
}
