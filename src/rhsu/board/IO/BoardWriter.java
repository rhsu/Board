package rhsu.board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import rhsu.board.AbstractBoard;
 
public class BoardWriter 
{
	/**
	 * The content to write to the reader
	 */
	private String content;
	
	/**
	 * 
	 * @return the content that the reader wrote to the file
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Suggested Constructor for BoardWriter
	 * @param the board to write
	 * @param filename the name of the file to output
	 */
	public BoardWriter(AbstractBoard board, String filename)
	{
		try 
		{	
			content = board.toString();
			
			File file = new File(filename);
 
			// if file doesnt exists, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			try (BufferedWriter bw = new BufferedWriter(fw))
			{
				bw.write(content);
			}
 
			System.out.println("Done creating file: " + filename);
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
	/**
	 * Makes the filename to be output.txt
	 * @param board the board to write
	 */
	public BoardWriter(AbstractBoard board)
	{
		this(board, "output.txt");
	}
		
	public static void main(String[] args) 
	{
		
	}
}