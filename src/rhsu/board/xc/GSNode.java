package rhsu.board.xc;

import java.util.Objects;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class GSNode<T>
{
	private BoardPiece<T> piece;
	private GSNode<T> next;
	
	public GSNode(int horizontal, int vertical, T value)
	{
		this.piece = new BoardPiece(horizontal, vertical, value);
		this.next = null;
	}
	
	public GSNode(BoardPiece<T> piece)
	{
		this.piece = piece;
		this.next = null;
	}
	
	public BoardPiece<T> getItem()
	{
		return piece;
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
		hash = 67 * hash + Objects.hashCode(this.piece);
		hash = 67 * hash + Objects.hashCode(this.next);
		return hash;
	}
}
