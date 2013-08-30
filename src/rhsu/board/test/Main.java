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
		BigDecimalBoard a = new BigDecimalBoard("test.txt");
		BigDecimalBoard b = new BigDecimalBoard("test.txt");
	
		BigDecimalBoard result = a.Multiply(b);
		
		System.out.println(result);
	}
}
