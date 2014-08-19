package rhsu.board2Old.random.implementations;

import org.junit.Before;
import org.junit.Ignore;
import rhsu.board2Old.factory.BoardFactory;
import rhsu.board2Old.random.RandomBoardTest;

@Ignore
public class CharacterRandomBoardTest extends RandomBoardTest
{
    @Before
	@Override
    public void createBoard() 
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(CharacterRandomBoard.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
    }
}