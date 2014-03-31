package rhsu.board.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test 
{
	// 24 - 27
	// seems like for loop is just naturally faster.
	public static void main(String[] args)
	{
		List<String> elementsTenThousand = new ArrayList();
		
		for(int i = 0; i < 100000; i++)
		{
			elementsTenThousand.add("a");
		}
		
		Iterator<String> iterator = elementsTenThousand.iterator();
		int a = 0;
		long startTime = System.currentTimeMillis();
		
		while(iterator.hasNext())
		{
			iterator.next();
			a++;
		}
		
		/*for (int i = 0 ; i < 100; i++)
		{
			for (int j = 0; j < 100; i++)
			{
				a++;
			}
		}*/
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println(a);
		System.out.println(duration);
	}
}
