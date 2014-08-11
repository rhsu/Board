package rhsu.board2.boardReaders;

public class IntegerBoardIO extends AbstractBoardIO<Integer>
{
	public IntegerBoardIO(String filename)
	{
		super(filename);
	}
	
	@Override
	protected Integer convertFromString(String string)
	{
		return Integer.valueOf(string);
	}	
}
