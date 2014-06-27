package rhsu.board2.random.implementations;

import org.junit.Before;
import rhsu.board2.factory.BoardFactory;
import rhsu.board2.random.RandomBoardTest;

public class CharacterRandomBoardTest extends RandomBoardTest
{
    @Before
	@Override
    public void createBoard() 
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(CharacterRandomBoard.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
    }
}