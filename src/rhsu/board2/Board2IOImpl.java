package rhsu.board2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import rhsu.board.basic.implementations.StringBoard;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board2.Board2IO;
import rhsu.board2.implementations.StringBoard2Composite;

public class Board2IOImpl implements Board2IO
{
	private CompositeBoard<String> boardInitializer;
	
	public CompositeBoard<String> getBoardInitializer() { return this.boardInitializer; }
	
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
	public void populateFromFile(String filename, String delimiter)
	{
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null)
			{			
				String[] row = line.split( "".equals(delimiter) 
						? DetermineDelimiter(line)
						: delimiter);
				
				fileContent.add(row);
			}
		}
		catch (IOException exception)
		{
			ExceptionHandler.Handle(exception);
		}
		
		this.boardInitializer = StringBoard2Composite.createStringBoard(fileContent.size(), fileContent.get(0).length);
		
		int boardCounter = 0;
		
		for(String[] item : fileContent)
		{
			for(int i = 0; i < item.length; i++)
			{
				boardInitializer.setValueAt(boardCounter, i, item[i].trim());
			}
			boardCounter++;
		}
	}

	@Override
	public void populateFromResource(BufferedReader reader, String delimiter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void export(String filename, char delimiter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
