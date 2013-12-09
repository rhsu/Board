package rhsu.board.test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.implementations.*;
import rhsu.board.implementations.arithmetic.*;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.xc.*;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		//IntegerBoard board = new IntegerBoard(ResourceRetriever.GetResource("ExampleIntegerBoard"));
		//IntegerBoard board = new IntegerBoard("test.txt");
		/*CharBoard board = new CharBoard(2,2);
		print(board);*/
		
		//BooleanBoard testBoard = new BooleanBoard(ResourceRetriever.GetResource("ExampleBooleanBoard"));
		
		StringBoard board = new StringBoard(2,2);
		
		print(board);
	}
}
