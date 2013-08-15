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
	public static void main(String[] args)
	{
		//Integer b = new Integer(6);
		//Object s = "abcdefg";
		
		//b.compareTo((Integer) s);
		
		IntegerBoard a = new IntegerBoard("test.txt");
		IntegerBoard b = new IntegerBoard("test.txt");
		
		//IntegerBoard result = a.Multiply(b);
		
		IntegerBoard result = a.Multiply(b);
		
		System.out.println(result);
	}
}
