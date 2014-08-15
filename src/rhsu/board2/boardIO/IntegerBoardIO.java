package rhsu.board2.boardIO;

public class IntegerBoardIO extends AbstractBoardIO<Integer>
{
	@Override
	protected Integer convertFromString(String string)
	{
		return Integer.valueOf(string);
	}
}