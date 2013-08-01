package rhsu.board.reflection;

import rhsu.board.Board;
import rhsu.board.BoardPiece;
import java.lang.reflect.Array;

/**
 *
 * @author rhsu
 */
public class ReflectionBoard<T> implements Board<T>
{
	protected BoardPiece<T>[][] board;
	protected int horizontal_size;
	protected int vertical_size;
	
	public ReflectionBoard(Class<T> c, int h, int v)
	{
		board = (BoardPiece<T>[][]) Array.newInstance(c, h, v);
	}
	
	@Override
	public BoardPiece<T> pieceAt(int i, int j) 
	{
		return board[i][j];
	}

	@Override
	public BoardPiece<T> getLeftPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getLeftPiece(BoardPiece<T> p) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getRightPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getRightPiece(BoardPiece<T> p) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getDownPiece(int i, int j) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getDownPiece(BoardPiece<T> p) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getUpPiece(int i, int j) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BoardPiece<T> getUpPiece(BoardPiece<T> p) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
}
