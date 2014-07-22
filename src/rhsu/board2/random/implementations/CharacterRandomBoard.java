package rhsu.board2.random.implementations;

import rhsu.board2.BoardBuilder;
import rhsu.board2.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.CharacterRandomGenerator;

public class CharacterRandomBoard 
{
	public static CompositeBoard<Character> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomGenerator(new CharacterRandomGenerator())
			.createBoard();
	}
}
