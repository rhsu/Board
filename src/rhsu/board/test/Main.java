package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.arithmetic.*;
import rhsu.board.implementations.math.*;
import rhsu.board.implementations.*;

public class Main
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{
		DoubleBoard test = new DoubleBoard("test.txt", -1.5);
		//BooleanBoard test = new BooleanBoard("test.txt");
		
		//IntegerBoard test = new IntegerBoard(3,3, 600);
		
		print(test);
	}
}
