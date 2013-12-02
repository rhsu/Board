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
import rhsu.board.implementations.*;
import rhsu.board.implementations.arithmetic.*;

public class Main
{
	public Main()
	{
		try 
		{	
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( getClass().getResourceAsStream(
					"/rhsu/board/resources/resource.txt")));
			
			
		} 
		catch (Exception ex) 
		{
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		Main myProj = new Main();
		
	}
}
