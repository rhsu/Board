package rhsu.board2;

import java.util.Arrays;
import java.util.Objects;
import rhsu.board.Direction;

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
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
			
	public BoardImpl(int horizontalSize, int verticalSize, Object defaultValue)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.size = horizontalSize * verticalSize;
		this.boardArray = new BoardPieceImpl[verticalSize][horizontalSize];
		this.defaultValue = (T) defaultValue;
		this.boardArray = new BoardPieceImpl[verticalSize][horizontalSize];
	
		this.doInitializeBoardArray();
	}
	
	public BoardImpl(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	private void doInitializeBoardArray()
	{
		this.initializeBoardArray();
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Retrieval Methods" defaultstate="collapsed">
	
	@Override
	public BoardPiece2<T> getPieceAt(int horizontalIndex, int verticalIndex)
	{
		return ((horizontalIndex >= this.horizontalSize || verticalIndex >= this.verticalSize || horizontalIndex < 0 || verticalIndex < 0))
				? null
				: this.boardArray[verticalIndex][horizontalIndex];
	}
	
	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical, Direction direction, int units)
	{
		if(units == 0) return this.getPieceAt(horizontal, vertical);
		
		if(units < 0)
		{
			switch(direction)
			{
				case UP:
					direction = Direction.DOWN;
					break;
				case DOWN:
					direction = Direction.DOWN;
					break;
				case LEFT:
					direction = Direction.RIGHT;
					break;
				case RIGHT:
					direction = Direction.LEFT;
			}
		}
		
		BoardPiece2<T> returnValue;
		
		switch(direction)
		{
			case UP:
			{
				returnValue = this.getPieceAt(horizontal - 1, vertical);
				
				for(int i = 1; i < units; i++)
				{
					returnValue = this.getPieceAt(returnValue.getHorizontalIndex()- 1, vertical);
				}
				
				return returnValue;
			}
			case DOWN:
			{
				returnValue = this.getPieceAt(horizontal + 1, vertical);
				
				for(int i = 1; i < units; i++)
				{
					returnValue = this.getPieceAt(returnValue.getHorizontalIndex()+ 1, vertical);
				}
				
				return returnValue;
			}
			case LEFT:
			{
				returnValue = this.getPieceAt(horizontal, vertical - 1);
				
				for(int i = 1; i < units; i++)
				{
					returnValue = this.getPieceAt(horizontal, returnValue.getVerticalIndex()- 1);
				}
				
				return returnValue;
			}
			default:
			case RIGHT:
			{
				returnValue = this.getPieceAt(horizontal, vertical + 1);
				
				for(int i = 1; i < units; i++)
				{
					returnValue = this.getPieceAt(horizontal, returnValue.getVerticalIndex()+ 1);
				}
				
				return returnValue;
			}
		}
	}

	@Override
	public BoardPiece2<T> getPieceAt(BoardPiece2<T> piece, Direction direction, int units)
	{
		return this.getPieceAt(piece.getHorizontalIndex(), piece.getVerticalIndex(), direction, units);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Value Retrieval Methods" defaultstate="collapsed">
	
	@Override
	public T getValueAt(int horizontal, int vertical)
	{
		return this.getPieceAt(horizontal, vertical).getValue();
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units)
	{
		return this.getPieceAt(horizontal, vertical, direction, units).getValue();
	}

	@Override
	public T getValueAt(BoardPiece2<T> piece, Direction direction, int units)
	{
		return this.getValueAt(piece.getHorizontalIndex(), piece.getVerticalIndex(), direction, units);
	}
	
	
	//</editor-fold>
	
	//<editor-fold desc="Piece Setting Methods" defaultstate="collapsed">
	
	@Override
	public void setPieceAt(int horizontalIndex, int verticalIndex, T value)
	{
		this.boardArray[verticalIndex][horizontalIndex] = new BoardPieceImpl<>(horizontalIndex,
			verticalIndex,
			value);
	}
	
	@Override
	public void setPieceAt(int horizontal, int vertical, BoardPiece2<T> piece)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void setValueAt(int horizontal, int vertical, T value)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	//</editor-fold>
	
	@Override
	public void initializeBoardArray()
	{
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
