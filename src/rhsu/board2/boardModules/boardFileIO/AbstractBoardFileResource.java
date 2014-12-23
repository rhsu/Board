package rhsu.board2.boardModules.boardFileIO;

import java.io.BufferedReader;

public abstract class AbstractBoardFileResource<T> extends AbstractBoardFileIO<T>
	implements BoardFileResource<T>
{
	private final BufferedReader reader;
	private final String delimiter;
	
	public AbstractBoardFileResource(BufferedReader reader, String delimiter)
	{
		this.reader = reader;
		this.delimiter = delimiter;
	}

	@Override
	public void populate() 
	{
		this.populateFromResource(reader, delimiter);
	}

	@Override
	public void populateFromResource(BufferedReader reader, String delimiter) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	

}
