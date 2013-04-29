package board.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class Writer 
{
	public static void main(String[] args) 
	{
		try 
		{
			String content = "asdfasdf jaksdfjdks jfajsdkfjalsf";
 
			File file = new File("test.txt");
 
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
 
			System.out.println("Done");
 
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
}