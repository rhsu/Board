package rhsu.board2.randomGenerators;

import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;

public abstract class AbstractRandomGenerator<T> implements RandomGenerator<T>,
	BoardInitializable<T>
{
	@Override
	public int getHorizontalSize()
	{
		throw new UnsupportedOperationException("Get Horizontal Size is not supported in AbstractRandomGenerator");
	}
	
	@Override
	public int getVerticalSize()
	{
		throw new UnsupportedOperationException("Get Vertical Size is not supported in AbstractRandomGenerator");
	}
	
	@Override
	public BoardPiece2<T>[][] initializeBoard(BoardPiece2<T>[][] boardArray)
	{
		int columnNumber = 0;

		for (BoardPiece2<T>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					this.getRandom());
			}
			columnNumber++;
		}
		
		return boardArray;
	}
	
}
