package rhsu.board.test;

import java.util.Iterator;
import rhsu.board.BoardPiece;
import rhsu.board.implementations.arithmetic.IntegerBoard;

/**
 *
 * @author rhsu
 */
public class BenchmarkTest 
{
	private static IntegerBoard testboard = new IntegerBoard(100,100, 1);
	
	private static void print(Object o)
	{
		System.out.println(o);
	}
		
	private static long main1()
	{		
		long startTime = System.currentTimeMillis();
		Iterator<BoardPiece<Integer>> iter = testboard.iterBoard();
		
		while(iter.hasNext())
		{
			BoardPiece<Integer> item = (BoardPiece<Integer>) iter.next();
			print(item);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		return duration;
	}
	
	private static long main2()
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < testboard.getHorizontal_size(); i++)
		{
			for(int j = 0; j< testboard.getVertical_size(); j++)
			{
				print(testboard.pieceAt(i, j));
			}
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		return duration;
	}
		
	public static void Test()
	{
		long i = main1();
		long j = main2();
		
		print(i);
		print(j);
	}
}
