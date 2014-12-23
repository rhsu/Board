package rhsu.board2.boardModules.boardFileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public abstract class AbstractBoardFileReader<T> extends AbstractBoardFileIO<T> 
	implements BoardFileReader<T>
{
	private final String filename;
	private final String delimiter;
	
	public AbstractBoardFileReader(String filename, String delimiter) 
	{
		this.filename = filename;
		this.delimiter = delimiter;
	}
	
	@Override
	public void populate() 
	{
		this.populateFromFile(filename, delimiter);
	}	
	
	@Override
	public void populateFromFile(String filename, String delimiter)
	{
		List<String[]> fileContent = new LinkedList<>();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null)
			{			
				String[] row = line.split(delimiter);
				
				fileContent.add(row);
			}
		}
		catch (IOException exception)
		{
			ExceptionHandler.Handle(exception);
		}
		
		this.boardInitializer = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoard(fileContent.get(0).length, fileContent.size());
			
		int boardCounter = 0;
		
		for(String[] item : fileContent)
		{
			for(int i = 0; i < item.length; i++)
			{
				this.getBoardInitializer().setValueAt(i, boardCounter, item[i].trim());
			}
			boardCounter++;
		}
	}
}
