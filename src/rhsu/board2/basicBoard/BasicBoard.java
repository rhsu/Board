package rhsu.board2.basicBoard;

import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board2.matrices.Matrix2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import rhsu.board.Direction;
import rhsu.board2.Board2;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardModule;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.boardIO.Board2IO;

class BasicBoard<T> implements Board2<T>,
	BoardInitializable
{
	static final Object DEFAULT_VALUE = new Object();
	
	private final Board2IO boardIO;
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
	public Board2IO getBoardIO() { return this.boardIO; }

	@Override
	public Matrix2<T> getMatrix() { return this.matrix; }

	@Override
	public MobilityBoard<T> getMobilityBoard()	{ return this.mobilityBoard; }

	@Override
	public RandomGenerator<T> getRandomGenerator() { return this.randomGenerator; }
		
	public BasicBoard(
		Integer horizontalSize,
		Integer verticalSize,
		Board2IO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomGenerator,
		T defaultValue,
		BoardInitializable<T> boardInitializer)
	{
		this.horizontalSize = horizontalSize == null 
			? boardInitializer.getHorizontalSize()
			: horizontalSize;
		
		this.verticalSize = verticalSize == null
			? boardInitializer.getVerticalSize()
			: verticalSize;
		
		this.size = ((horizontalSize == null) || (verticalSize == null)) ?
			0 : horizontalSize * verticalSize;
		
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomGenerator = randomGenerator;
		
		this.defaultValue = (T) (defaultValue == null ? DEFAULT_VALUE : defaultValue);
				
		this.boardArray = new BoardPieceImpl[this.verticalSize][this.horizontalSize];
		this.boardInitializer = boardInitializer;
		initializeBoardArray();
		setupBoardModules();
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
	
	private void checkCoordinates(int horizontalIndex, int verticalIndex)
	{
		String horizontalIndexOutOfRange = "The Horizontal Index Is Out of Range: %s. ";
		String horizontalIndexNegative = "The Horizontal Index Is Negative: %s. ";
		String verticalIndexOutOfRange = "The Vertical Index Is Out of Range: %s. ";
		String verticalIndexNegative = "The Vertical Index Is Negative: %s. ";
		
		List<String> errors = new LinkedList<>();
		
		if (horizontalIndex >= this.horizontalSize) errors.add(String.format(horizontalIndexOutOfRange, horizontalIndex));
		if (horizontalIndex < 0) errors.add(String.format(horizontalIndexNegative, horizontalIndex));
		if (verticalIndex >= this.verticalSize) errors.add(String.format(verticalIndexOutOfRange, verticalIndex));
		if (verticalIndex < 0) errors.add(String.format(verticalIndexNegative, verticalIndex));
		
		if (!errors.isEmpty())
		{
			StringBuilder errorMessage = new StringBuilder();
			
			for (String error : errors)
			{
				errorMessage.append(error);
			}
			
			errorMessage.append("Error Occurred at line: ").append(verticalIndex+1);
			
			throw new IllegalArgumentException(errorMessage.toString().trim());
		}
	}
	
	@Override
	public void setPieceAt(int horizontalIndex, int verticalIndex, T value)
	{	
		this.checkCoordinates(horizontalIndex, verticalIndex);
		
		this.boardArray[verticalIndex][horizontalIndex] = new BoardPieceImpl<>(horizontalIndex,
			verticalIndex,
			value);
	}
	
	@Override
	public void setPieceAt(int horizontalIndex, int verticalIndex, BoardPiece2<T> piece)
	{
		this.checkCoordinates(horizontalIndex, verticalIndex);
		
		this.boardArray[verticalIndex][horizontalIndex] = piece;
	}
	
	@Override
	public void setValueAt(int horizontalIndex, int verticalIndex, T value)
	{
		this.checkCoordinates(horizontalIndex, verticalIndex);

		this.boardArray[verticalIndex][horizontalIndex] = new BoardPieceImpl<>(
			horizontalIndex, 
			verticalIndex, 
			value);
	}
	
	//</editor-fold>	
	
	private void setupBoardModules()
	{
		if (this.getBoardIO() != null)
		{
			this.setupBoardModule((this.getBoardIO()));
		}
		
		if (this.getMatrix() != null)
		{
			this.setupBoardModule(this.getMatrix());
		}
		
		if (this.getMobilityBoard() != null)
		{
			this.setupBoardModule(this.getMobilityBoard());
		}
	}
	
	private void setupBoardModule(BoardModule module)
	{
		module.setParent(this);
	}
	
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
 		if ( !(aInstance instanceof BasicBoard ) ) return false; 
 		
 		BasicBoard instance = (BasicBoard) aInstance;
 		
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
				if (row[rowNumber] == null)
				{
					row[rowNumber] = new BoardPieceImpl(rowNumber, 
						columnNumber, 
						defaultValue);
				}
			}
			columnNumber++;
		}
		
		return boardArray;
	}
	
	@Override
	public BoardPiece2<T> find(T value)
	{		
		
		Iterator<BoardPiece2<T>> boardIterator = this.boardIterator();
		
		while(boardIterator.hasNext())
		{
			BoardPiece2<T> next = boardIterator.next();
			
			if (next.getValue() == value)
			{
				return next;
			}
		}
		
		return null;
	}
	
	@Override
	public List<BoardPiece2<T>> findAll(T value)
	{
		Iterator<BoardPiece2<T>> boardIterator = this.boardIterator();
		
		LinkedList<BoardPiece2<T>> list = new LinkedList<>();
		
		while(boardIterator.hasNext())
		{
			BoardPiece2<T> nextItem = boardIterator.next();
			
			if (nextItem.getValue() == value)
			{
				list.add(nextItem);
			}
		}
		return list;
	}
	
	@Override
	public Iterator<BoardPiece2<T>> boardIterator()
	{
		return new Iterator() 
		{
			private int currentIndex = 0;

			@Override
			public boolean hasNext()
			{
				return currentIndex < size;
			}

			@Override
			public BoardPiece2<T> next()
			{
				BoardPiece2<T> retPiece = boardArray[currentIndex/verticalSize][currentIndex % verticalSize];
				currentIndex++;
				return retPiece;
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
	}
}
