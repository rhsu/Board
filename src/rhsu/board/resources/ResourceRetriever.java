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
	
	public ResourceRetriever(String filename)
	{
		try
		{	
			bufferedReader = new BufferedReader(new InputStreamReader( getClass().getResourceAsStream(
					"/rhsu/board/resources/" + filename)));
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
		ResourceRetriever retriever = new ResourceRetriever(filename);
		return retriever.GetReader();
	}
}
