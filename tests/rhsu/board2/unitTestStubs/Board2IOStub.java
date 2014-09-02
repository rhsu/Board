package rhsu.board2.unitTestStubs;

import java.io.BufferedReader;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardIO.Board2IO;

public class Board2IOStub implements Board2IO<Object>
{
	public Board2IOStub()
	{
		
	}

	@Override
	public CompositeBoard<String> getBoardInitializer()
	{
		throw new UnsupportedOperationException("Stub Class");
	}

	@Override
	public void populateFromFile(String filename, String delimiter)
	{
		throw new UnsupportedOperationException("Stub Class");
	}

	@Override
	public void populateFromResource(BufferedReader reader, String delimiter)
	{
		throw new UnsupportedOperationException("Stub Class");
	}

	@Override
	public void export(String filename, char delimiter)
	{
		throw new UnsupportedOperationException("Stub Class");
	}
	
}
