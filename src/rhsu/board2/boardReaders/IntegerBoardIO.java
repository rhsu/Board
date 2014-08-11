package rhsu.board2.boardReaders;

public class IntegerBoardIO extends AbstractBoardIO<Integer>
{
	@Override
	protected Integer convertFromString(String string)
	{
		return Integer.valueOf(string);
	}	
}
