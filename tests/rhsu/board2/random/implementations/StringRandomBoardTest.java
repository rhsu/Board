package rhsu.board2.random.implementations;

import org.junit.Before;
import rhsu.board2.Board2Test;
import rhsu.board2.factory.BoardFactory;

public class StringRandomBoardTest extends Board2Test
{
	@Before
	@Override
    public void createBoard() 
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(StringRandomBoard.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
    }
}