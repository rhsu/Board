package rhsu.board2.basic;

import java.util.Arrays;
import java.util.Objects;
import rhsu.board2.Board2;

public class BoardImpl<T> implements Board2<T>
{	
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected T defaultValue;
	protected BoardPieceImpl<T>[][] board;
	
	@Override
	public int getHorizontalSize() { return horizontalSize; }

	@Override
	public int getVerticalSize() { return verticalSize; }

	@Override
	public int getSize() { return size; }

	@Override
	public T getDefaultValue() { return defaultValue; }
	
	@Override
	public BoardPieceImpl<T> getPieceAt(int horizontalIndex, int verticalIndex)
	{
		throw new UnsupportedOperationException("This method is not implemented yet");
	}
	
	@Override
	public BoardPieceImpl<T>[][] getBoardArray() { return this.board; }
	
	@Override
	public boolean equals(Object aInstance)
	{
		if (this == aInstance) return true;
		if ( !(aInstance instanceof BoardImpl ) ) return false; 
		
		BoardImpl instance = (BoardImpl) aInstance;
		
		return
			instance.getHorizontalSize() == this.getHorizontalSize() &&
			instance.getVerticalSize() == this.getVerticalSize() &&
			Arrays.deepEquals(instance.getBoardArray(), this.getBoardArray());
	}

	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 67 * hash + this.horizontalSize;
		hash = 67 * hash + this.verticalSize;
		hash = 67 * hash + this.size;
		hash = 67 * hash + Objects.hashCode(this.defaultValue);
		hash = 67 * hash + Arrays.deepHashCode(this.board);
		return hash;
	}
	
	public BoardImpl(int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.defaultValue = null;
		this.board = new BoardPieceImpl[verticalSize][horizontalSize];
		
		this.doInitializeBoardArray();
	}
	
	/**
	 * 
	 */
	private void doInitializeBoardArray()
	{
		initializeBoardArray();
	}
	
	/**
	 * Initializes the board array. Assume that the variable this.boardArray is already initialized
	 */
	protected void initializeBoardArray()
	{		
		int columnNumber = 0;
		
		for (BoardPieceImpl<T>[] row : board)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, columnNumber, null);
			}
			columnNumber++;
		}
	}
}
