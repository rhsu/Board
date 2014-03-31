package rhsu.board.test;

import java.util.Iterator;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.BoardPiece;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;

/**
 *
 * @author rhsu
 */
public class BenchmarkTest 
{
	private static final IntegerBoard testboard = new IntegerBoard(1000,1000, 1);
	
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
			Object item = iter.next();
			//BasicBoardPiece<Integer> item = (BasicBoardPiece<Integer>) iter.next();
			//print(item);
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
				Object t = testboard.getPieceAt(i, j);
				print(t);
			}
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		return duration;
	}
		
	public static void main(String[] args)
	{
		long i = main1();
		long j = main2();
		
		print(i);
		print(j);
	}
}


//37762
//40510