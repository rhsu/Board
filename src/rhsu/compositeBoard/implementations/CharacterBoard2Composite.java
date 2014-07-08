package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardImpl;

public class CharacterBoard2Composite extends BoardImpl<Character>
{
	static final Character DEFAULT_VALUE = '+';
	
	public CharacterBoard2Composite(int horizontalSize, int verticalSize, Character defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public CharacterBoard2Composite(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
