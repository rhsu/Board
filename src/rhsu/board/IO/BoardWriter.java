package rhsu.board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import rhsu.board.AbstractBoard;
 
public class BoardWriter 
{
	private String content;
	
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
	
	public BoardWriter(AbstractBoard board)
	{
		this(board, "output.txt");
	}
		
	public static void main(String[] args) 
	{
		
	}
}