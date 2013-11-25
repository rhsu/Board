package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.implementations.*;
import rhsu.board.implementations.arithmetic.*;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
		
	public static long main1()
	{		
		long startTime = System.currentTimeMillis();
		Iterator<BoardPiece<Integer>> iter = test.iterBoard();
		
		while(iter.hasNext())
		{
			BoardPiece<Integer> item = (BoardPiece<Integer>) iter.next();
			print(item);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		return duration;
	}
	
	public static long main2()
	{
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < test.getHorizontal_size(); i++)
		{
			for(int j = 0; j< test.getVertical_size(); j++)
			{
				print(test.pieceAt(i, j));
			}
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		return duration;
	}
	
	static IntegerBoard test = new IntegerBoard(100,100, 1);
	
	public static void main(String[] args)
	{	
		long i = main1();
		long j = main2();
		
		print(i);
		print(j);
	}
}
