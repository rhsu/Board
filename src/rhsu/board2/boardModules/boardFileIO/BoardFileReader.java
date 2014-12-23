package rhsu.board2.boardModules.boardFileIO;

public interface BoardFileReader<T> extends BoardFileIO<T>
{	
	public void populateFromFile(String filename, String delimiter);
	
	/*

	@Override
	protected T convertFromString(String string) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	} */
}