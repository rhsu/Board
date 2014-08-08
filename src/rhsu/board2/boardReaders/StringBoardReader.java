package rhsu.board2.boardReaders;

public class StringBoardReader extends AbstractBoardReader<String>
{
	@Override
	protected String convertFromString(String string)
	{
		return string;
	}
}
