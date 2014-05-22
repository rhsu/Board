package rhsu.board2.basic;

import java.util.Arrays;
import java.util.Objects;
import rhsu.board2.Board2;

public class Board2Impl<T> implements Board2<T>
{	
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected T defaultValue;
	protected BoardPiece2Impl<T>[][] board;
	
	@Override
	public int getHorizontalSize() { return horizontalSize; }

	@Override
	public int getVerticalSize() { return verticalSize; }

	@Override
	public int getSize() { return size; }

	@Override
	public T getDefaultValue() { return defaultValue; }
	
	public BoardPiece2Impl<T>[][] getBoard() { return this.board; }
	
	@Override
	public boolean equals(Object aInstance)
	{
System.out.println("HERE???");		
		if (this == aInstance) return true;
		if ( !(aInstance instanceof Board2Impl ) ) return false;
		
		Board2Impl instance = (Board2Impl) aInstance;
		
		return
			instance.getHorizontalSize() == this.getHorizontalSize() &&
			instance.getVerticalSize() == this.getVerticalSize() &&
			Arrays.deepEquals(instance.getBoard(), this.getBoard());
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
	
	public Board2Impl(int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.defaultValue = null;
		
		this.board = new BoardPiece2Impl[verticalSize][horizontalSize];
		
		int columnNumber = 0;
		for (BoardPiece2Impl<T>[] row : board)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPiece2Impl(rowNumber, columnNumber, null);
			}
			columnNumber++;
		}
	}
	
	public static void main(String[] args)
	{
		Board2Impl<Object> board = new Board2Impl<>(5,6);
	}
}
