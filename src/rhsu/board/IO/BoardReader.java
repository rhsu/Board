package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import rhsu.board.implementations.StringBoard;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *
 * @author robert
 */
public class BoardReader 
{
	/**
	 * All the supported delimiters: space, pipe, comma, semicolon, colon, tab
	 */
	private final static String DELIMITERS = "|,;:\t";
		
	/**
	 * Creates an output board based off of user input
	 * @param h the horizontal size of the board
	 * @param v the vertical size of the board
	 * @param items the user inputted items (as a queue)
	 * @return a string board based off of the user input 
	 */
	public StringBoard buildOutputBoard(int h, int v, LinkedList<String> items)
	{
		StringBoard outputBoard = new StringBoard(h, v);

		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				outputBoard.setValueAt(i, j, items.remove());
			}
		}
		
		return outputBoard;
	}
	
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
	
	/**
	 * Constructs the output board given a filename and a delimiter
	 * @param filename the name of the file
	 * @param delimiter the delimiter to split each line of the file on
	 * @return a String Board representing the output
	 */
	public StringBoard buildOutputBoard(String filename, String delimiter)
	{
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{			
				String[] row = line.split( "".equals(delimiter) 
						? DetermineDelimiter(line)
						: delimiter);
				
				fileContent.add(row);
			}
		}
		catch (Exception exception)
		{
			ExceptionHandler.Handle(exception);
		}
		
		StringBoard outputBoard = new StringBoard(fileContent.size(), fileContent.get(0).length);
		
		int boardCounter = 0;
		
		for(String[] item : fileContent)
		{
			for(int i = 0; i < item.length; i++)
			{
				outputBoard.setValueAt(boardCounter, i, item[i].trim());
			}
			boardCounter++;
		}
		
		return outputBoard;
	}
	
	/**
	 * Constructs the output board given a filename. The delimiter will be assumed to be the default of space
	 * @param filename the name of the file
	 * @return a String Board representing the output
	 */
	public StringBoard buildOutputBoard(String filename)
	{
		return buildOutputBoard(filename, "");
	}
	
	/**
	 * Constructs a string board based off of a file
	 * @param filename the name of the file
	 * @return a String Board constructed by a given file
	 */
	public static StringBoard getBoardFromFile(String filename)
	{
		return getBoardFromFile(filename, "");
	}
	
	/**
	 * Constructs a string board based off of a file
	 * @param filename the name of the file
	 * @param delimiter the delimiter to split the file on
	 * @return a String Board constructed by a given file
	 */
	public static StringBoard getBoardFromFile(String filename, String delimiter)
	{
		BoardReader reader = new BoardReader();
		
		return reader.buildOutputBoard(filename, delimiter);
	}
}
