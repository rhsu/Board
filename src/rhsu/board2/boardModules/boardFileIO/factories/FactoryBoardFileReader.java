package rhsu.board2.boardModules.boardFileIO.factories;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board2.boardModules.boardFileIO.AbstractBoardFileReader;
import rhsu.board2.boardModules.boardFileIO.BoardFileIO;

public class FactoryBoardFileReader<T> implements FactoryBoardFileIOProduct<T>
{
	private String filename;
	private String delimiter;
	
	public void setFilename(String filename) { this.filename = filename; }
	public void setDelimiter(String delimiter) { this.delimiter = delimiter; }
	
	public FactoryBoardFileReader(String filename, String delimiter)
	{
		this.filename = filename;
		this.delimiter = delimiter;
	}
	
	public FactoryBoardFileReader() 
	{
		this.filename = null;
		this.delimiter = null;
	}
	
	private void checkParameter(Object s)
	{
		if (s == null) 
		{
			try 
			{
				throw new NullPointerException("parameter is null");
			} 
			catch (Exception ex) 
			{
				Logger.getLogger(FactoryBoardFileReader.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
	
	@Override
	public BoardFileIO<T> getImplementation() 
	{	
		checkParameter(this.delimiter);
		checkParameter(this.filename);
		
		return new AbstractBoardFileReader<T>(this.filename, this.delimiter)
		{
			@Override
			protected T convertFromString(String string) 
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}	
		};
	}
}
