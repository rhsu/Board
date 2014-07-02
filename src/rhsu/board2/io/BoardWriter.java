package rhsu.board2.io;

import rhsu.board.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import rhsu.board.Board;
import rhsu.board.exceptionHandler.ExceptionHandler;
 
/**
 *The board writer class contains methods to write board objects to a file
 * @param <T> The type of the board to export. This is just to suppress some warnings
 */
public class BoardWriter<T> 
{	
	/**
	 * Writes a board to a file
	 * @param filename  the name of the file to create
	 * @param board the board to export to a file
	 */
	/*private void writeBoardToFile(String filename, Board<T> board)
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
		catch (IOException exception) 
		{
			ExceptionHandler.Handle(exception);
		}		
	}*/
	
	private void writeBoardToFile(String filename, Board<T> board, char delimiter)
	{
		try 
		{	
			String content = board.toOutputString(delimiter);
			
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
		catch (IOException exception) 
		{
			ExceptionHandler.Handle(exception);
		}	
	}
		
	/**
	 * Initializes a BoardWriter object to write the given board to a file
	 * @param filename the name of the file to create
	 * @param board the board object to export to a file
	 * @param delimiter the delimiter to write.
	 */
	public static void write(String filename, Board board, char delimiter)
	{
		BoardWriter writer = new BoardWriter();
		writer.writeBoardToFile(filename, board, delimiter);
	}
	
	/**
	 * Initializes a BoardWriter object to write the given board to a file.
	 * The default name of "output.txt" will be used.
	 * @param board the board object to export to a file.
	 */
	public static void write(Board board, char delimiter)
	{
		write("output.txt", board, delimiter);
	}
}