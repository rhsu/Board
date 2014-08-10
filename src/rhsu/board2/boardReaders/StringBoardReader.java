package rhsu.board2.boardReaders;

public class StringBoardReader extends AbstractBoardIO<String>
{
	@Override
	protected String convertFromString(String string)
	{
		return string;
	}
}
