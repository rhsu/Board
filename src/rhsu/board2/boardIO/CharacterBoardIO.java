package rhsu.board2.boardIO;

public class CharacterBoardIO extends AbstractBoardIO<Character>
{
	@Override
	protected Character convertFromString(String string)
	{
		return string.charAt(0);
	}
}
