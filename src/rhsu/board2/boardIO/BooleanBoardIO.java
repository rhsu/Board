package rhsu.board2.boardIO;

public class BooleanBoardIO extends AbstractBoardIO<Boolean>
{
	@Override
	protected Boolean convertFromString(String string)
	{
		return Boolean.valueOf(string);
	}
}
