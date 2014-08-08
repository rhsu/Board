package rhsu.board2.boardReaders;

public class IntegerBoardReader extends AbstractBoardReader<Integer>
{
	@Override
	protected Integer convertFromString(String string)
	{
		return Integer.valueOf(string);
	}	
}
