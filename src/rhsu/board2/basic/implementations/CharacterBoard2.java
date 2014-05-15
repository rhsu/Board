package rhsu.board2.basic.implementations;

import rhsu.board2.basic.Board2Impl;

public class CharacterBoard2 extends Board2Impl<Character>
{
	private static final Character DEFAULT_VALUE = '+';
	
	public CharacterBoard2(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
		this.defaultValue = DEFAULT_VALUE;
	}
}
