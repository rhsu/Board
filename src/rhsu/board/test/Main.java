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
	
	public static void main()
	{
		IntegerBoard b = new IntegerBoard(10,10, -1);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		main();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("The duration is: " + duration);
	}
}
