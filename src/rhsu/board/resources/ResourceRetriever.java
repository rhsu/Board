package rhsu.board.resources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *
 * @author rhsu
 */
public class ResourceRetriever 
{
	private BufferedReader bufferedReader;
		
	private ResourceRetriever(String filename, String location)
	{
		try
		{
			bufferedReader = new BufferedReader(new InputStreamReader( getClass().getResourceAsStream(
					location + filename)));
		}
		catch (Exception ex)
		{
			ExceptionHandler.Handle(ex);
		}
	}
	
	public BufferedReader GetReader()
	{
		return bufferedReader;
	}
	
	public static BufferedReader GetResource(String filename)
	{
		return GetResource(filename, "/rhsu/board/resources/");
	}
	
	public static BufferedReader GetResource(String filename, String location)
	{		
		ResourceRetriever retriever = new ResourceRetriever(filename, location);
		return retriever.GetReader();
	}
}
