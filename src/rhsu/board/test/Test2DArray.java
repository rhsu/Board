package rhsu.board.test;

import java.util.Iterator;

public class Test2DArray implements Iterable<Integer> 
{
	private int[][] board;
	private int size;
	private int h;
	private int v;
	
	public int getSize()
	{
		return size;
	}
	
	public Test2DArray(int h, int v)
	{
		this.h = h;
		this.v = v;
		
		size = h * v;
		int ctr = 0;
		board = new int[h][v];
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = ctr++;
			}
		}
	}

	@Override
	public Iterator<Integer> iterator() 
	{
		Iterator testIter = new Iterator()
		{
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() 
			{
				if(currentIndex < size)
				{
					return true;
				}
				return false;
			}

			@Override
			public Object next() 
			{
				currentIndex++;				
				return board[currentIndex%h][currentIndex+1/v];
			}

			@Override
			public void remove() 
			{
				throw new UnsupportedOperationException("Not supported yet."); 
			}
		};
		
		return testIter;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				int ctr = board[i][j];
				
				String output = String.format("%d(%d, %d):::%d***%d ", 
						board[i][j], i, j, ctr/v, ctr%v);
				
				//String output = String.format("%d ", board[i][j]);
				
				builder.append(output);
			}
			builder.append("\n");
		}
		return builder.toString();
	}
	
	public static void main(String[] args)
	{
		Test2DArray test = new Test2DArray(5,3);
		
		Iterator testI = test.iterator();
		
		System.out.println(test);
		
		/*while(testI.hasNext())
		{
			testI.next();
			System.out.println("here");
		}*/
	}
}
