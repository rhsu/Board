package rhsu.board2.boardReaders;

public class BooleanBoardReader extends AbstractBoardReader<Boolean>
{
	@Override
	protected Boolean convertFromString(String string)
	{
		return Boolean.valueOf(string);
	}
}
