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
		IntegerBoard a = new IntegerBoard("test.txt");
		IntegerBoard b = new IntegerBoard("test.txt");
	
		//a = a.Transpose();
		
		IntegerBoard c = a.Multiply(b);
		
		print(a);
	}
}
