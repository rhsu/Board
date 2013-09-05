package rhsu.board;

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
	
	/**
	 * General Constructor for creating an abstract board.
	 * @param h the height of the abstract board to create
	 * @param v the width of the abstract board to create
	 */
	public AbstractBoard(int h, int v)
	{
		horizontal_size = h;
		vertical_size = v;
	}
	
	/**
	 * Constructor for building an instance of an abstract board from a file.
	 * @param filename 
	 */
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(String filename)
	{
		baseBoard = BoardReader.getBoardFromFile(filename);
		
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];
	}
	
	/**
	 * Returns the piece at the location specified
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return The piece at the location (i, j). Returns null if invalid location
	 */
	@Override
	public BoardPiece<T> pieceAt(int i, int j)
	{		
		return ((i >= this.horizontal_size || j >= this.vertical_size || i < 0 || j < 0))
				? null
				: board[i][j];
	}
	
	/**
	 * Method for returning the value at a location
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @return The value at the location (i,j)
	 */
	@Override
	public T getValueAt(int i, int j)
	{
		return board[i][j].getType();
	}
	
	/**
	 * Method for setting a value t at a specific location (i,j)
	 * @param i the horizontal index
	 * @param j the vertical index
	 * @param t the value to set
	 */
	@Override
	public void setValueAt(int i, int j, T t)
	{
		board[i][j].setType(t);
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
		return builder.toString();
	}
	
	/**
	 * Exports the board object
	 * @param filename the name of the file to be exported
	 */
	public void export(String filename)
	{
		BoardWriter.write(filename, this);
	}
}
