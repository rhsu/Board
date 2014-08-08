package rhsu.board2.boardReaders;

public class CharacterBoardReader extends AbstractBoardReader<Character>
{
	@Override
	protected Character convertFromString(String string)
	{
		return string.charAt(0);
	}
}
