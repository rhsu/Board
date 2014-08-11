package rhsu.board2.boardReaders;

public class StringBoardIO extends AbstractBoardIO<String>
{
	public StringBoardIO(String filename)
	{
		super(filename);
	}
	
	@Override
	protected String convertFromString(String string)
	{
		return string;
	}
}
