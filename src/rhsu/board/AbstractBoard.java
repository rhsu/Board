package rhsu.board;

import rhsu.board.IO.BoardReader;
import rhsu.board.IO.BoardWriter;
import rhsu.board.implementations.StringBoard;

/**
 *
 * @author rhsu
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
	
	protected StringBoard baseBoard;
	
	public AbstractBoard(int h, int v)
	{
		horizontal_size = h;
		vertical_size = v;
	}

	/*@SuppressWarnings({"unchecked"})
	public AbstractBoard(String filename)
	{
		StringBoard baseBoard = BoardReader.getBoardFromFile(filename);
			
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];
	}*/
	
	@SuppressWarnings({"unchecked"})
	public AbstractBoard(String filename)
	{
		baseBoard = BoardReader.getBoardFromFile(filename);
		
		this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];
	}
	
	@Override
	public BoardPiece<T> pieceAt(int i, int j)
	{
		return board[i][j];
	}
	
	@Override
	public T getTypeAt(int i, int j)
	{
		return board[i][j].getType();
	}
	
	@Override
	public void setTypeAt(int i, int j, T t)
	{
		board[i][j].setType(t);
	}
	
	public void export(String filename)
	{
		BoardWriter.write(filename, this);
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
	
	public String printString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("==============").append("\n");		
		for (int i = 0; i < horizontal_size; i++)
		{
			for (int j = 0 ; j < vertical_size; j++)
			{				
				builder.append(pieceAt(i,j).toString()).append(" ");
			}
			builder.append("\n");
		}
		builder.append("==============");
		return builder.toString();
	}
}
