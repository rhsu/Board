package rhsu.board.test;

import java.io.BufferedReader;
import java.io.FileReader;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.exceptionHandler.HandleType;

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
			ExceptionHandler.Handle(exception, HandleType.Ignore);
		}
	}
}
