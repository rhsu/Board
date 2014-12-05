package rhsu.board2.boardModules.boardIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public class Board2IOFileReader<T> extends AbstractBoardIO<T>
{	
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

	@Override
	protected T convertFromString(String string) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}