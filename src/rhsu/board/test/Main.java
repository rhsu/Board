package rhsu.board.test;

import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.basic.implementations.CharBoard;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.utilities.PrintUtilityDebugger;
import rhsu.board.xc.*;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	private int a;
	
	public Main(int a)
	{
		this.a = a;
	}
	
	@Override
	public String toString()
	{
		return a + "";
	}
	
	public static void main(String[] args)
	{	
		PrintUtilityDebugger debugger = new PrintUtilityDebugger();
		
		//testing swap
		
		/*int a = 1;
		int b = 10;
		
		print("a is: " + a);
		print("b is: " + b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		print("a is: " + a);
		print("b is: " + b);*/
		
		//testing object swap
		
		Main x = new Main(1);
		Main y = new Main(10);
		
		print("x is: " + x);
		print("y is: " + y);
		
		Main temp;
		
		temp = x;
		x = y;
		y = temp;
		
		print("x is: " + x);
		print("y is: " + y);
	}
}
