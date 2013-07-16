package rhsu.board;

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
	
	public AbstractBoard(int h, int v)
	{
		horizontal_size = h;
		vertical_size = v;
	}
	
	//<editor-fold defaultstate="collapsed" desc="BOARD">
	@Override
	public T getLeftPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getLeftPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getRightPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getRightPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getDownPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public T getDownPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getUpPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public T getUpPiece(Object p) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public int getHorizontal_size() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public int getVertical_size() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	//</editor-fold>
}
