package rhsu.board.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.*;
import rhsu.board.IO.*;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.implementations.*;
import rhsu.board.implementations.arithmetic.*;
import rhsu.board.resources.ResourceRetriever;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		try(BufferedReader br = ResourceRetriever.GetResource("test.txt"))
		{
			String line;

			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(Exception ex)
		{
			ExceptionHandler.Handle(ex);
		}
	}
}
