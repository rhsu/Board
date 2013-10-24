package rhsu.board;

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
	/**
	 * the board object to allocate in the constructor
	 */
	protected BoardPiece<T>[][] board;
	/**
	 * The horizontal size of the board
	 */
	protected int horizontal_size;
	/**
	 * The vertical size of the board
	 */
	protected int vertical_size;
	/**
	 * A private string board variable used for constructing an instance from a file
	 */
	protected StringBoard baseBoard;
	
	protected int size;
	
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(int h, int v, T defaultValue)
	{
		this.horizontal_size = h;
		this.vertical_size = v;
		this.size = h*v;
		this.board = new BoardPiece[h][v];
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				this.board[i][j] = new BoardPiece(i, j, defaultValue);
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
		
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];
		this.size = this.horizontal_size * this.vertical_size;
	}
		
	@Override
	public BoardPiece<T> pieceAt(int i, int j)
	{		
		return ((i >= this.horizontal_size || j >= this.vertical_size || i < 0 || j < 0))
				? null
				: board[i][j];
	}
	
	@Override
	public T getValueAt(int i, int j)
	{
		return board[i][j].getValue();
	}
	
	@Override
	public void setValueAt(int i, int j, T t)
	{
		board[i][j].setValue(t);
	}
		
	@Override
	public BoardPiece<T> getLeftPiece(int i, int j) 
	{
		return pieceAt(i,j - 1);
	}

	@Override
	public BoardPiece<T> getLeftPiece(BoardPiece<T> p) 
	{	
		return getLeftPiece(p.getHorizontal(), p.getVertical());
	}

	@Override
	public BoardPiece<T> getRightPiece(int i, int j) 
	{
		return pieceAt(i, j + 1);
	}

	@Override
	public BoardPiece<T> getRightPiece(BoardPiece<T> p) 
	{
		return getRightPiece(p.getHorizontal(), p.getVertical());
	}

	@Override
	public BoardPiece<T> getDownPiece(int i, int j) 
	{
		return pieceAt(i + 1, j);
	}

	@Override
	public BoardPiece<T> getDownPiece(BoardPiece<T> p) 
	{
		return getDownPiece(p.getHorizontal(), p.getVertical());
	}

	@Override
	public BoardPiece<T> getUpPiece(int i, int j) 
	{
		return pieceAt(i - 1, j);
	}

	@Override
	public BoardPiece<T> getUpPiece(BoardPiece<T> p) 
	{
		return getUpPiece(p.getHorizontal(), p.getVertical());
	}

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
	
	/**
	 * Exports the board object
	 * @param filename the name of the file to be exported
	 */
	public void export(String filename)
	{
		BoardWriter.write(filename, this);
	}
	
	@Override
	public T getLeftValue(BoardPiece<T> p)
	{
		return this.getLeftPiece(p).getValue();
	}
	
	@Override
	public T getLeftValue(int i, int j)
	{
		return this.getLeftPiece(i, j).getValue();
	}
	
	@Override
	public T getRightValue(BoardPiece<T> p)
	{
		return this.getRightPiece(p).getValue();
	}
	
	@Override
	public T getRightValue(int i, int j)
	{
		return this.getRightPiece(i, j).getValue();
	}
	
	@Override
	public T getUpValue(BoardPiece<T> p)
	{
		return this.getUpPiece(p).getValue();
	}
	
	@Override
	public T getUpValue(int i, int j)
	{
		return this.getUpPiece(i, j).getValue();
	}
	
	@Override
	public T getDownValue(BoardPiece<T> p)
	{
		return this.getDownPiece(p).getValue();
	}
	
	@Override
	public T getDownValue(int i, int j)
	{
		return this.getDownPiece(i, j).getValue();
	}

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
	 * @param t the object to find
	 * @return the first instance of the object in the Board. Null if nothing is found
	 */
	@Override
	public BoardPiece<T> find(T t)
	{
		Iterator iter = this.iterBoard();
		
		while(iter.hasNext())
		{
			BoardPiece<T> nextItem = (BoardPiece<T>) iter.next();
			
			if(nextItem.getValue() == t)
			{
				return nextItem;
			}
		}
		return null;
	}
	
	@Override
	public List<BoardPiece<T>> findAll(T t)
	{
		Iterator iter = this.iterBoard();
		
		LinkedList<BoardPiece<T>> list = new LinkedList<>();
		
		while(iter.hasNext())
		{
			BoardPiece<T> nextItem = (BoardPiece<T>) iter.next();
			
			if(nextItem.getValue() == t)
			{
				list.add(nextItem);
			}
		}
		return list;
	}
	
	@Override
	public abstract RandomGenerator<T> randomGenerator();
	
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
}

