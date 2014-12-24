package rhsu.board2.boardModules.boardFileIO;

import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FactoryBoardFileResource<T> implements FactoryBoardFileIOProduct<T>
{
	private BufferedReader reader;
	private String delimiter;

	public void setBufferedReader(BufferedReader reader) { this.reader = reader; }
	public void setDelimiter(String delimiter) { this.delimiter = delimiter; }

	public FactoryBoardFileResource(BufferedReader reader, String delimiter)
	{
		this.reader = reader;
		this.delimiter = delimiter;
	}

	public FactoryBoardFileResource()
	{
		this.reader = null;
		this.delimiter = null;
	}
	
	private void checkParameter(Object s)
	{
		if (s == null) 
		{
			try 
			{
				throw new NullPointerException("Filename is null");
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
		this.checkParameter(this.reader);
		this.checkParameter((this.delimiter));
		
		return new AbstractBoardFileResource<T>(this.reader, this.delimiter) 
		{
			@Override
			protected T convertFromString(String string) 
			{
				throw new UnsupportedOperationException("Not supported yet."); 
			}
		};
	}
}
