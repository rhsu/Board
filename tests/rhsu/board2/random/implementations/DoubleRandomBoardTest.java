package rhsu.board2.random.implementations;

import org.junit.Before;
import org.junit.Ignore;
import rhsu.board2.factory.BoardFactory;
import rhsu.board2.random.RandomBoardTest;

@Ignore
public class DoubleRandomBoardTest extends RandomBoardTest
{
    @Before
	@Override
    public void createBoard() 
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(DoubleRandomBoard.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
    }
}