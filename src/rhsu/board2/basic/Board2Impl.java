package rhsu.board2.basic;

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
