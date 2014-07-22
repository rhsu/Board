package rhsu.compositeBoard;

import rhsu.board.Direction;
import rhsu.board.io.BoardIO;
import rhsu.board2.matrix2.Matrix2;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.random.RandomGenerator;

public class CompositeBoardImpl<T> implements CompositeBoard<T>
{
	static final Object DEFAULT_VALUE = new Object();
	
	private final BoardIO boardIO;
	private final Matrix2<T>matrix;
	private final MobilityBoard<T> mobilityBoard;
	private final RandomGenerator<T> randomBoard;

	//<editor-fold desc="Protected Variables" defaultstate="collapsed">
	
	protected int horizontalSize;
	protected int verticalSize;
	protected int size;
	protected T defaultValue;
	protected BoardPiece2<T>[][] boardArray;
	
	//</editor-fold>
	
	@Override
	public BoardIO getBoardIO() { return this.boardIO; }

	@Override
	public Matrix2<T> getMatrix() { return this.matrix; }

	@Override
	public MobilityBoard<T> getMobilityBoard()	{ return this.mobilityBoard; }

	@Override
	public RandomGenerator<T> getRandomGenerator() { return this.randomBoard; }
		
	public CompositeBoardImpl(
		Integer horizontalSize,
		Integer verticalSize,
		BoardIO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomBoard,
		T defaultValue)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomBoard = randomBoard;
		this.defaultValue = (T) (defaultValue == null ? DEFAULT_VALUE : defaultValue);
		
		initializeBoardArray();
	}

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
	public BoardPiece2<T>[][] getBoardArray() { return this.boardArray; }
	
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
	public void setPieceAt(int horizontalIndex, int verticalIndex, BoardPiece2<T> piece)
	{
		if(horizontalIndex > this.horizontalSize || horizontalIndex < 0 || verticalIndex > this.verticalSize || verticalIndex < 0)
			throw new RuntimeException("Out of Bounds");
		
		this.boardArray[verticalIndex][horizontalIndex] = piece;
	}
	
	@Override
	public void setValueAt(int horizontalIndex, int verticalIndex, T value)
	{
		if(horizontalIndex > this.horizontalSize || horizontalIndex < 0 || verticalIndex > this.verticalSize || verticalIndex < 0)
			throw new RuntimeException("Out of Bounds");
		
		this.boardArray[verticalIndex][horizontalIndex] = new BoardPieceImpl(
			horizontalIndex, 
			verticalIndex, 
			value);
	}
	
	//</editor-fold>	
	
	private void initializeBoardArray()
	{
		if (randomBoard != null)
		{
			throw new UnsupportedOperationException("This is not implemented yet");
		}
		else if (matrix != null)
		{
			throw new UnsupportedOperationException("This is not implemented yet");
		}
		else
		{
			int columnNumber = 0;
		
			for (BoardPiece2<T>[] row : this.boardArray)
			{
				for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
				{ 
					row[rowNumber] = new BoardPieceImpl(rowNumber, columnNumber, defaultValue);
				}
				columnNumber++;
			}
		}
	}
}
