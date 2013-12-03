package rhsu.board.xc;

import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class GSNode<T>
{
	private BoardPiece<T> item;
	private GSNode<T> next;
	
	public GSNode(int horizontal, int vertical, T t)
	{
		item = new BoardPiece(horizontal, vertical, t);
		next = null;
	}
	
	public BoardPiece<T> getItem()
	{
		return item;
	}
	
	public T getValue()
	{
		return getItem().getValue();
	}
}
