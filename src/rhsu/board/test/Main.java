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
	
	public static void main(String[] args)
	{
		//IntegerBoard b = new IntegerBoard("test.txt");
		//print(b);
		
		BoardReader reader = new BoardReader();
		print(reader.buildOutputBoard2("test.txt"));
	}
}
