package rhsu.board2.basic.implementations;

import rhsu.board2.basic.BoardImpl;

public class CharacterBoard2 extends BoardImpl<Character>
{
	private static final Character DEFAULT_VALUE = '+';
	
	public CharacterBoard2(int horizontalSize, int verticalSize, Character defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public CharacterBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
