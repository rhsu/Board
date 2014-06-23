package rhsu.board2.basic;

import java.util.Arrays;
import java.util.Objects;
import rhsu.board2.Board2;

public class BoardImpl<T> implements Board2<T>
{	
	static final Object DEFAULT_VALUE = new Object();
	
	//<editor-fold desc="Protected Variables" defaultstate="collapsed">
	
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected T defaultValue;
	protected BoardPieceImpl<T>[][] boardArray;
	
	//</editor-fold>
		
	//<editor-fold desc="Accessors" defaultstate="collapsed">
	
	@Override
	public int getHorizontalSize() { return this.horizontalSize; }

	@Override
	public int getVerticalSize() { return this.verticalSize; }

	@Override
	public int getSize() { return this.size; }

	@Override
	public T getDefaultValue() { return this.defaultValue; }
	
	@Override
	public BoardPieceImpl<T>[][] getBoardArray() { return this.boardArray; }
	
	//</editor-fold>
	
	@Override
	public BoardPieceImpl<T> getPieceAt(int horizontalIndex, int verticalIndex)
	{
		throw new UnsupportedOperationException("This method is not implemented yet");
	}
		
	//<editor-fold desc="Constructors">
	
	public BoardImpl(int horizontalSize, int verticalSize, Object defaultValue)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.boardArray = new BoardPieceImpl[verticalSize][horizontalSize];
		this.defaultValue = (T) defaultValue;
		this.boardArray = new BoardPieceImpl[verticalSize][horizontalSize];
		int columnNumber = 0;

		for (BoardPieceImpl<T>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, columnNumber, defaultValue);
			}
			columnNumber++;
		}
	}
	
	public BoardImpl(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Inheirited From Object" defaultstate="collapsed">
	
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
		hash = 67 * hash + Arrays.deepHashCode(this.boardArray);
		return hash;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < this.verticalSize; i++)
		{
			for (int j = 0; j < this.horizontalSize; j++)
			{
				builder.append(this.boardArray[i][j]).append(" ");
			}
			
			builder.append("\n");
		}
		
		return builder.toString().trim();
	}
	
	//</editor-fold>
}
