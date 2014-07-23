package rhsu.compositeBoard.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;

public class CharacterBoard2Composite
{
	static final Character DEFAULT_VALUE = '+';
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, 
		int verticalSize,
		Character defaultValue)
	{
		return new BoardBuilder()
			.setDefaulValue(defaultValue)
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.createBoard();
	}
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, int verticalSize)
	{		
		return createCharacterBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
}
