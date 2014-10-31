package rhsu.board2.boardModules.randomGenerators;

import rhsu.board2.AbstractBoardModule;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;

public abstract class AbstractRandomGenerator<T> extends AbstractBoardModule<T>
	implements RandomGenerator<T>,
	BoardInitializable<T>
{
	@Override
	public int getHorizontalSize()
	{
		return this.getParent().getHorizontalSize();
	}
	
	@Override
	public int getVerticalSize()
	{
		return this.getParent().getVerticalSize();
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
