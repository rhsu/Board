package rhsu.board2.basic;

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
	
	public BoardImpl(int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.defaultValue = null;
		
		this.board = new BoardPieceImpl[verticalSize][horizontalSize];
		
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
	
	public static void main(String[] args)
	{
		BoardImpl<Object> board = new BoardImpl<>(5,6);
	}
}
