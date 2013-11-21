package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
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
	
	private String DetermineDelimiter(String line)
	{
		char[] test = DELIMITERS.toCharArray();
		
		for(char item : test) 
		{
			if(line.contains(String.valueOf(item))) return String.valueOf(item);
		}
		
		return " ";
	}
	
	public StringBoard buildOputputBoard2(String filename, String delimiter)
	{
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{			
				String[] row = line.split( delimiter == null 
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
	
	public StringBoard buildOutputBoard2(String filename)
	{
		return buildOputputBoard2(filename, null);
	}
	
	/**
	 * Constructs a string board from the given file
	 * @param filename the name of the file to read from
	 * @return a string board based off of the given file
	 */
	public StringBoard buildOutputBoard(String filename)
	{		
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] row = line.split(DetermineDelimiter(line));
				
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
				outputBoard.setValueAt(boardCounter, i, item[i]);
			}
			boardCounter++;
		}
		
		return outputBoard;
	}
	
	/**
	 * Constructs a string board based off of a file
	 * @param filename
	 * @return a String Board constructed by a given file
	 */
	public static StringBoard getBoardFromFile(String filename)
	{
		BoardReader reader = new BoardReader();
		
		return reader.buildOutputBoard(filename);
	}
}
