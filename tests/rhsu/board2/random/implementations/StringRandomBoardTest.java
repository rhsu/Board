package rhsu.board2.random.implementations;

import org.junit.Before;
import org.junit.Ignore;
import rhsu.board2.Board2Test;
import rhsu.board2.factory.BoardFactory;

@Ignore
public class StringRandomBoardTest extends Board2Test
{
	@Before
	@Override
    public void createBoard() 
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(StringRandomBoard.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
    }
}