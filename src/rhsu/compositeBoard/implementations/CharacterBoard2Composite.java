package rhsu.compositeBoard.implementations;

import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;

public class CharacterBoard2Composite
{
	static final Character DEFAULT_VALUE = '+';

	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, 
		int verticalSize,
		Character defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.createBoard();
	}
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, int verticalSize)
	{		
		return createCharacterBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
