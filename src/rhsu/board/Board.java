package rhsu.board;

import rhsu.board.implementations.StringBoard;

/**
 *
 * @author RHsu
 */
public interface Board <T>
{
	public T getLeftPiece(int i, int j);
	public T getLeftPiece(T p);	
	public T getRightPiece(int i, int j);
	public T getRightPiece(T p);
	public T getDownPiece(int i, int j);
	public T getDownPiece(T p);
	public T getUpPiece(int i, int j);
	public T getUpPiece(T p);
	public T pieceAt(int i, int j);
	public int getHorizontal_size();
	public int getVertical_size();
	public Object getTypeAt(int i, int j);
	public void setTypeAt(int i, int j, Object obj);
	public void convertFromStringBoard(StringBoard baseBoard);
}

