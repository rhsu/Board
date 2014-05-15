package rhsu.board2.boardFactory;

import rhsu.board2.basic.Board2Impl;
import rhsu.board2.basic.implementations.arithmetic.IntegerBoard2;

public class BoardFactory
{
	private final int horizontalSize;
	private final int verticalSize;
	
	public BoardFactory(int horizontalSize, int verticalSize) 
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
	}
	
	public int getHorizontalSize() { return horizontalSize; }
	
	public int getVerticalSize() { return verticalSize; }
	
	public Board2Impl createBoard2Impl()
	{
		return new Board2Impl(horizontalSize, verticalSize);
	}
	
	public IntegerBoard2 createIntegerBoard()
	{
		return new IntegerBoard2(horizontalSize, verticalSize);
	}
}
