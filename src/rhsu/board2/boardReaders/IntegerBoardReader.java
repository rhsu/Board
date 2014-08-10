package rhsu.board2.boardReaders;

public class IntegerBoardReader extends AbstractBoardIO<Integer>
{
	@Override
	protected Integer convertFromString(String string)
	{
		return Integer.valueOf(string);
	}	
}
