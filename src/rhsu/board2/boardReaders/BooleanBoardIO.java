package rhsu.board2.boardReaders;

public class BooleanBoardIO extends AbstractBoardIO<Boolean>
{
	public BooleanBoardIO(String filename)
	{
		super(filename);
	}
	
	@Override
	protected Boolean convertFromString(String string)
	{
		return Boolean.valueOf(string);
	}
}
