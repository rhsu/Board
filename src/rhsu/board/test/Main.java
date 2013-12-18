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
		StringBoard board = new StringBoard(2,2);
		StringBoard board3 = new StringBoard(2,2);
		CharBoard board2 = new CharBoard(2,2);
		
		//print(board.getClass());
		//print(board2.getClass());
		
		//print(board.getClass().equals(board2.getClass()));
		
		print(board.equals(board2));
	}
}
