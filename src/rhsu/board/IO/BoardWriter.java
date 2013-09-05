package rhsu.board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import rhsu.board.AbstractBoard;
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
	public void writeBoardToFile(String filename, AbstractBoard board)
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
	 * Writes a board to the default filename "output.txt"
	 * @param board the board to export to a file
	 */
	public void writeBoardToFile(AbstractBoard board)
	{
		writeBoardToFile("output.txt", board);
	}
	
	/**
	 * Initializes a BoardWriter object to write the given board to a file
	 * @param filename the name of the file to create
	 * @param board the board object to export to a file
	 */
	public static void write(String filename, AbstractBoard board)
	{
		BoardWriter writer = new BoardWriter();
		writer.writeBoardToFile(filename, board);
	}
}