package rhsu.board.test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author rhsu
 */
public class ExceptionHandlerDemoMain 
{
	public static void main(String[] args)
	{
		String filename = "abcdefg";
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
		
		}
		catch(Exception exception)
		{
			ExceptionHandlerDemo.Handle(exception);
			//System.out.println(IOException);
		}
	}
}
