package rhsu.board2;

import java.util.Arrays;
import java.util.Objects;
import rhsu.board.Direction;
import rhsu.board.io.BoardIO;

public class CompositeBoardImpl<T> implements CompositeBoard<T>,
	BoardInitializable
{
	static final Object DEFAULT_VALUE = new Object();
	
	private final BoardIO boardIO;
	private final Matrix2<T>matrix;
	private final MobilityBoard<T> mobilityBoard;
	private final RandomGenerator<T> randomGenerator;
	private final BoardInitializable<T> boardInitializer;
	
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
	public RandomGenerator<T> getRandomGenerator() { return this.randomGenerator; }
		
	public CompositeBoardImpl(
		Integer horizontalSize,
		Integer verticalSize,
		BoardIO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomGenerator,
		T defaultValue,
		BoardInitializable<T> boardInitializer)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;	
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomGenerator = randomGenerator;
		this.defaultValue = (T) (defaultValue == null ? DEFAULT_VALUE : defaultValue);
		this.boardArray = new BoardPieceImpl[verticalSize][horizontalSize];
		this.boardInitializer = boardInitializer;
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
					returnValue = this.getPieceAt(returnValue.getHorizontalIndex() - 1, vertical);
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
					returnValue = this.getPieceAt(horizontal, returnValue.getVerticalIndex() - 1);
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
	
	//</editorfold>
	
	//<editorfold desc="Value Retrieval Methods" defaultstate="collapsed">
	
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
		this.boardArray = (boardInitializer != null) ? boardInitializer.initializeBoard(boardArray)
			: this.initializeBoard(boardArray);
	}
	
	//<editor-fold desc="Inheirited From Object" defaultstate="collapsed">
	
	@Override
 	public boolean equals(Object aInstance)
 	{
 		if (this == aInstance) return true;
 		if ( !(aInstance instanceof CompositeBoardImpl ) ) return false; 
 		
 		CompositeBoardImpl instance = (CompositeBoardImpl) aInstance;
 		
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

	@Override
	public BoardPiece2[][] initializeBoard(BoardPiece2[][] boardArray)
	{
		int columnNumber = 0;

		for (BoardPiece2<T>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{ 
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					defaultValue);
			}
			columnNumber++;
		}
		
		return boardArray;
	}
}
