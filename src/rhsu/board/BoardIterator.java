package rhsu.board;

import java.util.Iterator;

/**
 *
 * @author robert
 */
public class BoardIterator<T> implements Iterable<T> 
{

	@Override
	public Iterator<T> iterator() 
	{
		Iterator<T> it = new Iterator<T>()
		{
			private int currentIndex = 0;
				
			@Override
			public boolean hasNext() 
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public T next() 
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public void remove() 
			{
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
			
			public void reset()
			{
				currentIndex = 0;
			}
		};
				
		return it;
	}
	
}
