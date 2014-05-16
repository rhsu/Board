package rhsu.board2.factory;

import rhsu.board2.basic.Board2Impl;
import rhsu.board2.basic.implementations.BooleanBoard2;
import rhsu.board2.basic.implementations.CharacterBoard2;
import rhsu.board2.basic.implementations.StringBoard2;
import rhsu.board2.basic.implementations.arithmetic.BigDecimalBoard2;
import rhsu.board2.basic.implementations.arithmetic.BigIntegerBoard2;
import rhsu.board2.basic.implementations.arithmetic.DoubleBoard2;
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
	
	public Board2Impl createBoardImpl()
	{
		return new Board2Impl(horizontalSize, verticalSize);
	}
	
	public BooleanBoard2 createBooleanBoard()
	{
		return new BooleanBoard2(horizontalSize, verticalSize);
	}
	
	public CharacterBoard2 createCharacterBoard()
	{
		return new CharacterBoard2(horizontalSize, verticalSize);
	}
	
	public StringBoard2 createStringBoard()
	{
		return new StringBoard2(horizontalSize, verticalSize);
	}
	
	public BigDecimalBoard2 createBigDecimalBoard()
	{
		return new BigDecimalBoard2(horizontalSize, verticalSize);
	}
	
	public BigIntegerBoard2 createBigIntegerBoard()
	{
		return new BigIntegerBoard2(horizontalSize, verticalSize);
	}
	
	public DoubleBoard2 createDoubleBoard()
	{
		return new DoubleBoard2(horizontalSize, verticalSize);
	}
	
	public IntegerBoard2 createIntegerBoard()
	{
		return new IntegerBoard2(horizontalSize, verticalSize);
	}
	
	
}
