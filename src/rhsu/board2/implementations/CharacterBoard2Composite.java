package rhsu.board2.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.board2.randomGenerators.AbstractRandomGenerator;
import rhsu.board2.randomGenerators.CharacterRandomGenerator;

public class CharacterBoard2Composite
{
	static final Character DEFAULT_VALUE = '+';
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, 
		int verticalSize,
		Character defaultValue)
	{
		return new BoardBuilder<Character>()
			.setDefaulValue(defaultValue)
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.createBoard();
	}
	
	public static CompositeBoard<Character> createCharacterBoard(int horizontalSize, int verticalSize)
	{		
		return createCharacterBoard(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	public static CompositeBoard<Character> createCharacterRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		AbstractRandomGenerator<Character> randomGenerator = new CharacterRandomGenerator();
		
		return new BoardBuilder<Character>()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new CharacterRandomGenerator())
			.setBoardInitializable(randomGenerator)
			.createBoard();
	}
}
