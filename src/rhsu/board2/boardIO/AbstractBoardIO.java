package rhsu.board2.boardIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.CompositeBoard;
import rhsu.board2.implementations.factories.BoardFactoryClient;

public abstract class AbstractBoardIO<T> implements Board2IO,
	BoardInitializable<T>
{
	private CompositeBoard<String> boardInitializer;
	
	@Override
	public CompositeBoard<String> getBoardInitializer() { return this.boardInitializer; }
	
	/**
	 * A string representing all the supported delimiters. A supported delimiter
	 * will be automatically picked up.
	 */
	private final static String DELIMITERS = "|,;:\t";
	
	/**
	 * Method to determine the delimiter of a line in a file
	 * @param line the line to determine the delimiter of
	 * @return a string that represents the delimiter of the file
	 */
	private String DetermineDelimiter(String line)
	{
		char[] test = DELIMITERS.toCharArray();
		
		for(char item : test) 
		{
			if(line.contains(String.valueOf(item))) return String.valueOf(item);
		}
		
		return " ";
	}
	
	@Override
	public void populateFromFile(String filename, String delimiter)
	{
		LinkedList<String[]> fileContent = new LinkedList<>();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null)
			{			
				String[] row = line.split( "".equals(delimiter) 
						? DetermineDelimiter(line)
						: delimiter);
				
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
				this.boardInitializer.setValueAt(i, boardCounter, item[i].trim());
			}
			boardCounter++;
		}
	}

	@Override
	public void populateFromResource(BufferedReader reader, String delimiter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void export(String filename, char delimiter)
	{
		String output = this.getBoardOutputString();
		
		try
		{
			File file = new File(filename);
 
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			
			try (BufferedWriter bw = new BufferedWriter(fw))
			{
				bw.write(output);
			}
 
			System.out.println("Done creating file: " + filename);
			
		}
		catch (IOException exception)
		{
			System.out.println(exception);
			System.exit(1);
		}
	}
	
	@Override
	public BoardPiece2[][] initializeBoard(BoardPiece2[][] boardArray)
	{
		int columnNumber = 0;

		for (BoardPiece2<Character>[] row : boardArray)
		{
			for (int rowNumber = 0; rowNumber < row.length; rowNumber++) 
			{
				String stringValue = this.getBoardInitializer()
					.getValueAt(rowNumber, columnNumber);
				
				row[rowNumber] = new BoardPieceImpl(rowNumber, 
					columnNumber, 
					this.convertFromString(stringValue));
			}
			columnNumber++;
		}
		
		return boardArray;
	}
	
	protected abstract T convertFromString(String string);
	
	private String getBoardOutputString()
	{
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < this.boardInitializer.getHorizontalSize(); i++)
		{
			for (int j = 0; j < this.boardInitializer.getVerticalSize(); j++)
			{
				builder.append(this.boardInitializer.getPieceAt(i, j).toString()).append(" ");
			}
			builder.append("\n");
		}
		return builder.toString().trim();
	}
}
