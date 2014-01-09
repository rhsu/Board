package rhsu.board.xc;

import rhsu.board.basic.BasicBoardPiece;

/**
 *
 * @author rhsu
 */
public class LinkedGStruct<T>
{
	private GSNode<T> head;
	
	public LinkedGStruct()
	{
		head = null;
	}
	
	public int count()
	{
		int count = 0;
		GSNode temp = head;
		while(temp != null)
		{
			temp = temp.getNext();
			count++;
		}
		return count;
	}
		
	public void insertFront(BasicBoardPiece<T> piece)
	{		
		insertFront(new GSNode(piece));
	}
	
	public void insertFront(GSNode<T> node)
	{
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.setNext(head);
			head = node;
		}
	}
	
	public void insertLast(BasicBoardPiece<T> piece)
	{

	}
	
	public void insertLast(GSNode<T> node)
	{
		
	}
	
	public void clean()
	{
		head = null;
	}
}
