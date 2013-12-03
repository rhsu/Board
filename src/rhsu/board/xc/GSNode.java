package rhsu.board.xc;

import java.util.Objects;
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
	
	public boolean setNext(GSNode node)
	{	
		this.next = node;
		return node == null;
	}
	
	public GSNode<T> getNext()
	{
		return next;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof GSNode<?>)) return false;
		
		return this.hashCode() == other.hashCode();
	}

	@Override
	public int hashCode() 
	{
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(this.item);
		hash = 67 * hash + Objects.hashCode(this.next);
		return hash;
	}
}
