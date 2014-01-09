package rhsu.board.test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.basic.implementations.*;
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
		BooleanBoard b1 = new BooleanBoard(ResourceRetriever.GetResource("testCharBoard", TEST_RESOURCE));
		BooleanBoard b2 = new BooleanBoard(ResourceRetriever.GetResource("ExampleIntegerBoard"));
		
		print(b1);
		print(b2);
	}
}
