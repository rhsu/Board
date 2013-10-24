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
		IntegerBoard b = new IntegerBoard("test.txt");
		print(b);
	
		print(b.getSize());
		
		/*String s = "a b c d";
		
		char c = '\0';
		
		String[] split = s.split(String.valueOf(c));
		
		for(String str : split) System.out.println("item " + s);*/
	}
}
