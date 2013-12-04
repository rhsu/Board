package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import rhsu.board.implementations.StringBoard;
import rhsu.board.exceptionHandler.ExceptionHandler;

public class BoardReader 
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
	
	/**
	 * Creates an output board based off of user input. This is called from the 
	 * console application.
	 * @param horizontal_index the horizontal size of the board
	 * @param vertical_index the vertical size of the board
	 * @param items the user inputted items (as a queue)
	 * @return a string board based off of the user input 
	 */
	private StringBoard buildOutputBoard(int horizontal_index, int vertical_index, LinkedList<String> items)
	{
		StringBoard outputBoard = new StringBoard(horizontal_index, vertical_index);

		for(int i = 0; i < horizontal_index; i++)
		{
			for(int j = 0; j < vertical_index; j++)
			{
				outputBoard.setValueAt(i, j, items.remove());
			}
		}
		
		return outputBoard;
	}
	
	/**
	 * Constructs the output board given a filename and a delimiter
	 * @param filename the name of the file
	 * @param delimiter the delimiter to split each line of the file on
	 * @return a String Board Object representing the output
	 */
	private StringBoard buildOutputBoard(String filename, String delimiter)
	{
		try 
		{
			return buildOutputBoard(new BufferedReader(new FileReader(filename)), delimiter);		
		} 
		catch (Exception exception) 
		{
			ExceptionHandler.Handle(exception);
			return new StringBoard(0,0);
		}
	}
	
	private StringBoard buildOutputBoard(BufferedReader reader, String delimiter)
	{
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try
		{
			String line;
			while ((line = reader.readLine()) != null)
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
	
	public static StringBoard getBoardFromFile(String filename)
	{
		BoardReader reader = new BoardReader();
		
		return reader.buildOutputBoard(filename, "");
	}
	
	public static StringBoard getBoardFromFile(BufferedReader bufferedReader)
	{
		BoardReader reader = new BoardReader();
		
		return reader.buildOutputBoard(bufferedReader, "");
	}
	
	public static StringBoard getBoardFromFile(BufferedReader bufferedReader, String delimiter)
	{
		BoardReader reader = new BoardReader();
		
		return reader.buildOutputBoard(bufferedReader, delimiter);
	}
	
	public static StringBoard getOutputBoard(int horizontal_index, int vertical_index, LinkedList<String> items)
	{
		BoardReader reader = new BoardReader();
		return reader.buildOutputBoard(horizontal_index, vertical_index, items);
	}
}
