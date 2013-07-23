package rhsu.board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import rhsu.board.AbstractBoard;
 
public class BoardWriter 
{	
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
		catch (IOException e) 
		{
			System.out.println(e);
		}		
	}
	
	public void writeBoardToFile(AbstractBoard board)
	{
		writeBoardToFile("output.txt", board);
	}
	
	public static void write(String filename, AbstractBoard board)
	{
		BoardWriter writer = new BoardWriter();
		writer.writeBoardToFile(filename, board);
	}
}