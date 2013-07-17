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

	@Override
	public BoardPiece<T> getLeftPiece(int i, int j) 
	{
		return pieceAt(i,j - 1);
	}

	@Override
	public BoardPiece<T> getLeftPiece(BoardPiece<T> p) 
	{
		return getLeftPiece(p.getHorizontal(), p.getVertical() - 1);
	}

	@Override
	public BoardPiece<T> getRightPiece(int i, int j) 
	{
		return pieceAt(i, j + 1);
	}

	@Override
	public BoardPiece<T> getRightPiece(BoardPiece<T> p) 
	{
		return getRightPiece(p.getHorizontal(), p.getVertical() + 1);
	}

	@Override
	public BoardPiece<T> getDownPiece(int i, int j) 
	{
		return pieceAt(i + 1, j);
	}

	@Override
	public BoardPiece<T> getDownPiece(BoardPiece<T> p) 
	{
		return pieceAt(p.getHorizontal() + 1, p.getVertical());
	}

	@Override
	public BoardPiece<T> getUpPiece(int i, int j) 
	{
		return pieceAt(i - 1, j);
	}

	@Override
	public BoardPiece<T> getUpPiece(BoardPiece<T> p) 
	{
		return pieceAt(p.getHorizontal() - 1, p.getVertical());
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
	public void convertFromStringBoard(StringBoard baseBoard) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
