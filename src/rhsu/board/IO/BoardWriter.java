package rhsu.board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import rhsu.board.basic.AbstractBasicBoard;
import rhsu.board.exceptionHandler.ExceptionHandler;
 
/**
 *The board writer class contains methods to write board objects to a file
 */
public class BoardWriter 
{	
	/**
	 * Writes a board to a file
	 * @param filename  the name of the file to create
	 * @param board the board to export to a file
	 */
	private void writeBoardToFile(String filename, AbstractBasicBoard board)
	{
		try 
		{	
			String content = board.toString();
			
			File file = new File(filename);
 
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
		catch (Exception exception) 
		{
			ExceptionHandler.Handle(exception);
		}		
	}
		
	/**
	 * Initializes a BoardWriter object to write the given board to a file
	 * @param filename the name of the file to create
	 * @param board the board object to export to a file
	 */
	public static void write(String filename, AbstractBasicBoard board)
	{
		BoardWriter writer = new BoardWriter();
		writer.writeBoardToFile(filename, board);
	}
	
	public static void write(AbstractBasicBoard board)
	{
		BoardWriter writer = new BoardWriter();
		writer.writeBoardToFile("output.txt", board);
	}
}