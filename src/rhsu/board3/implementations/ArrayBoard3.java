package rhsu.board3.implementations;

import rhsu.board.Direction;
import rhsu.board3.Board3;

public class ArrayBoard3<T> implements Board3<T>
{
	private final int horizontalSize;
	private final int verticalSize;
	private final T[][] boardArray;
		
	@Override
	public int getHorizontalSize() { return this.horizontalSize; }

	@Override
	public int getVerticalSize() { return this.verticalSize; }

	@Override
	public int getSize() { return this.horizontalSize * this.verticalSize; }

	@Override
	public T getValueAt(int horizontal, int vertical) 
	{
		return this.boardArray[horizontal][vertical];
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units) 
	{	
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setValueAt(int horizontal, int vertical, T value) 
	{
		this.boardArray[horizontal][vertical] = value;
	}
	
	public ArrayBoard3(int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardArray = (T[][]) new Object[verticalSize][horizontalSize];
	}

	@Override
	public boolean findInstance(T instance) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean containsValue(T value) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
