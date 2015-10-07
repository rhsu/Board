package rhsu.board3.implementations;

import rhsu.board3.Direction;
import rhsu.board3.Board3;

public class ArrayBoard3<T> implements Board3<T>
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	
	private final int horizontalSize;
	private final int verticalSize;
	private final T[][] boardArray;
	private final T defaultValue;	
	
	//</editor-fold>
	
	//<editor-fold desc="Accessors -- Inheirited from Board3" defaultstate="collapsed">
	@Override
	public int getHorizontalSize() { return this.horizontalSize; }

	@Override
	public int getVerticalSize() { return this.verticalSize; }

	@Override
	public int getSize() { return this.horizontalSize * this.verticalSize; }

	//</editor-fold>
	
	//<editor-fold desc="Value Retrieval Methods -- Inheirited from Board3" defaultstate="collapsed">
	
	@Override
	public T getValueAt(int horizontal, int vertical) 
	{
		if (horizontal < 0 || horizontal >= this.horizontalSize)
			throw new IndexOutOfBoundsException("horizontal index is out of bounds");
		
		if (vertical < 0 || vertical >= this.verticalSize)
			throw new IndexOutOfBoundsException("vertical index is out of bounds");
		
		return this.boardArray[horizontal][vertical];
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units) 
	{	
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	//</editor-fold>
	
	//<editor-fold desc="Value Setter Methods -- Inheirited from Board3" defaultstate="collapsed">
	
	@Override
	public void setValueAt(int horizontal, int vertical, T value) 
	{
		this.boardArray[horizontal][vertical] = value;
	}
	
	//</editor-fold>
			
	//<editor-fold desc="Constructors" defaultstate="collapsed">

	public ArrayBoard3(int horizontalSize, int verticalSize, T defaultValue)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardArray = (T[][]) new Object[verticalSize][horizontalSize];
		this.defaultValue = defaultValue;
	}
	
	public ArrayBoard3(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, null);
	}

	//</editor-fold>
}
