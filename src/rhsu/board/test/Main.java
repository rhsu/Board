package rhsu.board.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
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
		
		Matrix a = new IntegerBoard("test.txt");
		Matrix b = new IntegerBoard("test.txt");
		
		Matrix c = a.Add(b);
		
		System.out.println(c);
	}
}
