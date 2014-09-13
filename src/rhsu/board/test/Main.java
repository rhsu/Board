package rhsu.board.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import rhsu.board.io.BoardIO;
import rhsu.board2.*;
import rhsu.board2.boardIO.AbstractBoardIO;
import rhsu.board2.boardIO.AbstractBoardIOFactory;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
    public static void print(Object o)
    {
		System.out.println(o);
    }
    
	public static void main(String[] args)
	{		
		List<String> filenames = new LinkedList<>();
		
		filenames.add("Mi_Alex");
		filenames.add("Mi_Hep");
		filenames.add("Mi_huh");
		
		filenames.add("Sid_Alex");
		filenames.add("Sid_Huh");
		filenames.add("Sid_hep");
		
		for(String filename : filenames)
		{
			processFile(filename);
		}
	}
	
	private static void processFile(String filename)
	{
		CompositeBoard<String> fileBoard = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoardFromFile(filename);
		
		List<String> results = new LinkedList<>();
		
		for (int i = 0; i < fileBoard.getHorizontalSize(); i++)
		{
			for (int j = 0; j < fileBoard.getVerticalSize(); j++)
			{
				if ("transcript".equals(fileBoard.getValueAt(2, j).trim()))
				{
					String geneName = fileBoard.getValueAt(8, j)
						.split(" ")[1]
						.replace(";", "")
						.replace("\"","");
					
					String firstColumn = fileBoard.getValueAt(0,j);
					String fifthColumn = fileBoard.getValueAt(4, j);
					String fourthColumn = fileBoard.getValueAt(3, j);
					
					Integer length = new Integer(fifthColumn) - new Integer(fourthColumn);
					
					String item = new StringBuilder()
						.append(geneName)
						.append("_")
						.append(firstColumn)
						.append("_")
						.append(fifthColumn)
						.append("_")
						.append(fourthColumn)
						.append(" ")
						.append(length)
						.toString();
					
					results.add(item);
				}
			}
		}
		
		String filenameOutput = new StringBuilder()
			.append(filename)
			.append("OUTPUT")
			.toString();
		
		try
		{
			File file = new File(filenameOutput);
 
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			
			try (BufferedWriter bw = new BufferedWriter(fw))
			{
				for (String result : results)
				{
					bw.write(result);
					bw.write("\n");
				}
			}
 
			System.out.println("Done creating file: " + filenameOutput);
			
		}
		catch (IOException exception)
		{
			System.out.println(exception);
			System.exit(1);
		}
	}
}
