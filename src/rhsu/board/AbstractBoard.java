package rhsu.board;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rhsu.board.IO.BoardReader;
import rhsu.board.IO.BoardWriter;
import rhsu.board.implementations.StringBoard;

/**
 * This class provides skeletal implementations of some of Board operations.This class also contains an export method, for putting all entries of a board object into a file.
 * 
 * @param <T> Tye type of elements for the abstract board
 */
public abstract class AbstractBoard<T> implements Board<T>
{	
	//<editor-fold desc="Member Variables" defaultstate="collapsed">
	
	/**
	 * the board object to allocate in the constructor
	 */
	protected BoardPiece<T>[][] board;
	
	/**
	 * the horizontal size of the board
	 */
	protected int horizontal_size;
	
	/**
	 * the vertical size of the board
	 */
	protected int vertical_size;
	
	/**
	 * the total size of the board. this variable is equal to horizontal_size times vertical_size.
	 */
	protected int size;
	
	/**
	 * the string board variable used for constructing an instance from a file
	 */
	protected Board<String> baseBoard;
	
	//</editor-fold>
	
	//<editor-fold defaultstate="collapsed" desc="Constructors">
	
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(int horizontal, int vertical, T defaultValue)
	{
		this.horizontal_size = horizontal;
		this.vertical_size = vertical;
		this.size = horizontal*vertical;
		this.board = new BasicBoardPiece[horizontal][vertical];
		
		for(int i = 0; i < horizontal; i++)
		{
			for(int j = 0; j < vertical; j++)
			{
				this.board[i][j] = new BasicBoardPiece(i, j, defaultValue);
			}
		}
	}
	
	/**
	 * Constructor for building an instance of an abstract board from a file.
	 * @param filename 
	 */
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(String filename)
	{
		this.baseBoard = BoardReader.getBoardFromFile(filename);
		initializeBaseBoard();
	}
	
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(BufferedReader reader)
	{
		this.baseBoard = BoardReader.getBoardFromFile(reader);
		initializeBaseBoard();
	}
	
	private void initializeBaseBoard()
	{
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BasicBoardPiece[horizontal_size][vertical_size];
		this.size = this.horizontal_size * this.vertical_size;
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Inheirited from Board Interface: Piece Retrieval Methods" defaultstate="collapsed">
	
	@Override
	public BoardPiece<T> pieceAt(int horizontal, int vertical)
	{		
		return ((horizontal >= this.horizontal_size || vertical >= this.vertical_size || horizontal < 0 || vertical < 0))
				? null
				: board[horizontal][vertical];
	}
	
	@Override
	public BoardPiece<T> getLeftPiece(int horizontal, int vertical) 
	{
		return pieceAt(horizontal,vertical - 1);
	}

	@Override
	public BoardPiece<T> getLeftPiece(BoardPiece<T> piece) 
	{	
		return getLeftPiece(piece.getHorizontal(), piece.getVertical());
	}

	@Override
	public BoardPiece<T> getRightPiece(int horizontal, int vertical) 
	{
		return pieceAt(horizontal, vertical + 1);
	}

	@Override
	public BoardPiece<T> getRightPiece(BoardPiece<T> piece) 
	{
		return getRightPiece(piece.getHorizontal(), piece.getVertical());
	}

	@Override
	public BoardPiece<T> getDownPiece(int horizontal, int vertical) 
	{
		return pieceAt(horizontal + 1, vertical);
	}

	@Override
	public BoardPiece<T> getDownPiece(BoardPiece<T> piece) 
	{
		return getDownPiece(piece.getHorizontal(), piece.getVertical());
	}

	@Override
	public BoardPiece<T> getUpPiece(int horizontal, int vertical) 
	{
		return pieceAt(horizontal - 1, vertical);
	}

	@Override
	public BoardPiece<T> getUpPiece(BoardPiece<T> piece) 
	{
		return getUpPiece(piece.getHorizontal(), piece.getVertical());
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Inheirited from Board Interface: Value Retrieval Methods" defaultstate="collapsed">
	
	@Override
	public T getValueAt(int horizontal, int vertical)
	{
		return board[horizontal][vertical].getValue();
	}
	
	@Override
	public void setValueAt(int horizontal, int vertical, T value)
	{
		board[horizontal][vertical].setValue(value);
	}

	@Override
	public T getLeftValue(BoardPiece<T> piece)
	{
		return this.getLeftPiece(piece).getValue();
	}
	
	@Override
	public T getLeftValue(int horizontal, int vertical)
	{
		return this.getLeftPiece(horizontal, vertical).getValue();
	}
	
	@Override
	public T getRightValue(BoardPiece<T> piece)
	{
		return this.getRightPiece(piece).getValue();
	}
	
	@Override
	public T getRightValue(int horizontal, int vertical)
	{
		return this.getRightPiece(horizontal, vertical).getValue();
	}
	
	@Override
	public T getUpValue(BoardPiece<T> piece)
	{
		return this.getUpPiece(piece).getValue();
	}
	
	@Override
	public T getUpValue(int horizontal, int vertical)
	{
		return this.getUpPiece(horizontal, vertical).getValue();
	}
	
	@Override
	public T getDownValue(BoardPiece<T> piece)
	{
		return this.getDownPiece(piece).getValue();
	}
	
	@Override
	public T getDownValue(int horizontal, int vertical)
	{
		return this.getDownPiece(horizontal, vertical).getValue();
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Inheirited from Board Interface: Accessors" defaultstate="collapsed">
	
	@Override
	public int getHorizontal_size() 
	{
		return this.horizontal_size;
	}

	@Override
	public int getVertical_size() 
	{
		return this.vertical_size;
	}

	@Override
	public int getSize()
	{
		return this.size;
	}
		
	//</editor-fold>
	
	//<editor-fold desc="Inheirited from Board Interface" defaultstate="collapsed">
	@Override
	public Iterator<BoardPiece<T>> iterBoard()
	{
		Iterator<BoardPiece<T>> retIter = new Iterator()
		{
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() 
			{
				return currentIndex < size;
			}

			@Override
			public BoardPiece<T> next() 
			{
				BoardPiece<T> retPiece = board[currentIndex/vertical_size][currentIndex % vertical_size];
				currentIndex++;
				return retPiece;
			}

			@Override
			public void remove() 
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		return retIter;
	}
	
	/**
	 * Iterates through the board to find the specified object. Returns the result
	 * as a board piece to preserve it's horizontal and vertical indices
	 * @param value the object to find
	 * @return the first instance of the object in the Board. Null if nothing is found
	 */
	@Override
	public BasicBoardPiece<T> find(T value)
	{
		Iterator<BoardPiece<T>> iter = this.iterBoard();
		
		while(iter.hasNext())
		{
			BasicBoardPiece<T> nextItem = (BasicBoardPiece<T>) iter.next();
			
			if(nextItem.getValue() == value)
			{
				return nextItem;
			}
		}
		return null;
	}
	
	@Override
	public List<BoardPiece<T>> findAll(T value)
	{
		Iterator<BoardPiece<T>> iter = this.iterBoard();
		
		LinkedList<BoardPiece<T>> list = new LinkedList<>();
		
		while(iter.hasNext())
		{
			BoardPiece<T> nextItem = (BasicBoardPiece<T>) iter.next();
			
			if(nextItem.getValue() == value)
			{
				list.add(nextItem);
			}
		}
		return list;
	}
	
	@Override
	public abstract RandomGenerator<T> randomGenerator();
	
	//</editor-fold>
	
	/**
	 * Exports the board object
	 * @param filename the name of the file to be exported
	 */
	public void export(String filename)
	{
		BoardWriter.write(filename, this);
	}
		
	public static AbstractBoard CreateRandomBoard(AbstractBoard board)
	{
		RandomGenerator generator = board.randomGenerator();
		
		for(int i = 0; i < board.getHorizontal_size(); i++)
		{
			for(int j = 0; j < board.getVertical_size(); j++)
			{
				board.setValueAt(i, j, generator.getRandom());
			}
		}
		
		return board;
	}
	
	//<editor-fold desc="Inheirited from Class Object" defaultstate="collapsed">
	
	/**
	 * Method to allow the object to be printed
	 * @return a string representation of the abstract board
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < horizontal_size; i++)
		{
			for (int j = 0; j < vertical_size; j++)
			{
				builder.append(pieceAt(i,j).toString()).append(" ");
			}
			builder.append("\n");
		}
		return builder.toString().trim();
	}

	@Override
	public int hashCode() 
	{
		int hash = 7;
		hash = 59 * hash + Arrays.deepHashCode(this.board);
		hash = 59 * hash + this.horizontal_size;
		hash = 59 * hash + this.vertical_size;
		return hash;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other == null) return false; 
		if (other == this) return true;
		
		if (!this.getClass().equals(other.getClass())) return false;
		
		AbstractBoard otherAbstractBoard = (AbstractBoard) other;
		
		return (otherAbstractBoard.hashCode() == other.hashCode());
	}
	
	//</editor-fold>
}

