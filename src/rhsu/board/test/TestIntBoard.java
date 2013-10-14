/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.board.test;

import java.util.Iterator;
import rhsu.board.BoardPiece;
import rhsu.board.implementations.arithmetic.IntegerBoard;

/**
 *
 * @author rhsu
 */
public class TestIntBoard extends IntegerBoard //implements BoardIterable<Integer>
{
	public TestIntBoard(int h, int v)
	{
		super(h, v);
	}

	public Iterator<BoardPiece<Integer>> iter() 
	{
		Iterator<BoardPiece<Integer>> iter = new Iterator()
		{
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() 
			{
				//if(currentIndex < size)
				//{
				//	return true;
				//}
				return false;
			}

			@Override
			public Object next() 
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}

			@Override
			public void remove() 
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		return iter;
	}
}
