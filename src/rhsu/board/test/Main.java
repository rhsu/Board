package rhsu.board.test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.basic.implementations.*;
import rhsu.board.basic.implementations.arithmetic.*;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.xc.*;

public class Main
{	
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		BigDecimalBoard test = new BigDecimalBoard(3,3, new BigDecimal("6"));
		
		//print(test);
		
		//BigDecimalBoard temp = test.multiply( new BigDecimal("6"));
		
		BigDecimal asdf = new BigDecimal("6");
		
		print(asdf);
		
		Object o = asdf.multiply(asdf);
		
		print(o);
	}
}
