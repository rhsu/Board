package rhsu.board2.boardModules.boardFileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import rhsu.board2.AbstractBoardModule;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.Board2;

public abstract class AbstractBoardFileIO<T> extends AbstractBoardModule<T>
	implements BoardFileIO<T>, BoardInitializable<T>
{
	protected Board2<String> boardInitializer;
	
	public AbstractBoardFileIO() { }
	
	public AbstractBoardFileIO(String s1, String s2) { }
	
	public AbstractBoardFileIO(BufferedReader br, String s2) { }
	
	@Override
	public int getHorizontalSize()
	{
		return this.boardInitializer.getHorizontalSize();
	}
	
	@Override
	public int getVerticalSize()
	{
		return this.boardInitializer.getVerticalSize();
	}
	
	@Override
	public Board2<String> getBoardInitializer() { return this.boardInitializer; }
	
	@Override
	public void export(String filename, String delimiter)
	{		
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
				Board2<T> parentBoard = this.getParent();
				for(int i = 0; i < parentBoard.getHorizontalSize(); i++)
				{
					for(int j = 0; j < parentBoard.getVerticalSize(); j++)
					{
						bw.write(parentBoard.getValueAt(i, j).toString().trim());
						
						if (j != parentBoard.getVerticalSize() - 1)
						{
							bw.write(String.format(" %s ", delimiter));
						}
					}
					if (i != parentBoard.getHorizontalSize() - 1)
					{
						bw.write("\n");
					}
				}
				
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
}