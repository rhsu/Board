package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
		
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.*;
import rhsu.board.implementations.arithmetic.*;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		/*IntegerRandomGenerator test = new IntegerRandomGenerator(156);
				
		for(int i = 0; i < 5; i++)
		{
			print(test.getRandom());
		}*/
		
		IntegerBoard test = new IntegerBoard(5,5);
		
		RandomGenerator rg = test.randomGenerator();
		
		Integer i = (Integer) rg.getRandom();
		
		print(i);
	}
}
