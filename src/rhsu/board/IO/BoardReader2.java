package rhsu.board.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import rhsu.board.implementations.StringBoard;

/**
 *
 * @author robert
 */
public class BoardReader2 
{
	/**
	 * All the supported delimiters: space, pipe, comma, semicolon, colon, tab
	 */
	private final static String DELIMITERS = " |,;:\t";
		
	/**
	 * Creates an output board based off of user inputted items
	 * @param h the horizontal size of the board
	 * @param v the vertical size of the board
	 * @param items the user inputted items (as a queue)
	 */
	public StringBoard buildOutputBoard(int h, int v, LinkedList<String> items)
	{
		StringBoard outputBoard = new StringBoard(h, v);

		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				outputBoard.setTypeAt(i, j, items.remove());
			}
		}
		
		return outputBoard;
	}
	
	/**
	 * Reads in from file
	 */
	public StringBoard buildOutputBoard(String filename) throws IOException
	{		
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS);
				String[] delimitedLines = new String[tokenizer.countTokens()];

				int index = 0;

				while(tokenizer.hasMoreTokens())
				{
					delimitedLines[index] = tokenizer.nextToken().trim();
					index++;
				}

				fileContent.add(delimitedLines);
			}
		}
		catch (IOException e)
		{
			//return new StringBoard(0,0);
			throw new IOException("File not found");
		}
		
		
		StringBoard outputBoard = new StringBoard(fileContent.size(), fileContent.get(0).length);
		
		int boardCounter = 0;
		
		for(String[] item : fileContent)
		{
			for(int i = 0; i < item.length; i++)
			{
				outputBoard.setTypeAt(boardCounter, i, item[i]);
			}
			boardCounter++;
		}
		
		return outputBoard;
	}
}
