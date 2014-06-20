package rhsu.board2.random.implementations;

import rhsu.board2.implementations.CharacterBoard2;

public class CharacterBoardRandom extends CharacterBoard2
{
	public CharacterBoardRandom(int horizontalSize, int verticalSize, Character defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public CharacterBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
}
