package rhsu.board.test;

import rhsu.board.implementations.basic.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.basic.BasicBoardPiece;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.implementations.basic.BooleanBoard;
import rhsu.board.implementations.basic.arithmetic.*;
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
		BufferedReader reader = ResourceRetriever.GetResource("ExampleIntegerBoard");
		
		Board test = new IntegerBoard(reader);
		
		print(test);
	}
}
