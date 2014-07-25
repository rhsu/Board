import java.io.BufferedReader;
import rhsu.board2.Board2IO;

public class Board2IOImpl implements Board2IO
{
	/**
	 * A string representing all the supported delimiters. A supported delimiter
	 * will be automatically picked up.
	 */
	private final static String DELIMITERS = "|,;:\t";
	
	/**
	 * Method to determine the delimiter of a line in a file
	 * @param line the line to determine the delimiter of
	 * @return a string that represents the delimiter of the file
	 */
	private String DetermineDelimiter(String line)
	{
		char[] test = DELIMITERS.toCharArray();
		
		for(char item : test) 
		{
			if(line.contains(String.valueOf(item))) return String.valueOf(item);
		}
		
		return " ";
	}
	
	@Override
	public void populateFromFile(String filename)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void populateFromResource(BufferedReader reader)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void export(String filename, char delimiter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void export(String filename)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
