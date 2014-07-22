package rhsu.board2.random.implementations;

import rhsu.board2.random.RandomGenerator;
import rhsu.compositeBoard.BoardBuilder;
import rhsu.compositeBoard.CompositeBoard;
import rhsu.compositeBoard.randomGenerators.CharacterRandomGenerator;

public class CharacterRandomBoard 
{
	public static CompositeBoard<Character> createBigDecimalRandomBoard(int horizontalSize,
		int verticalSize)
	{		
		return new BoardBuilder()
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setRandomBoard((RandomGenerator<Character>) new CharacterRandomGenerator())
			.createBoard();
	}
}
