package rhsu.board2.basic;

import org.junit.*;
import rhsu.board2.Board2Test;
import rhsu.board2.factory.BoardFactory;

public class Board2ImplIntIntTest extends Board2Test
{	
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(Board2Impl.class, horizontalSize, verticalSize);		
		board = boardFactory.createBoard();
	}
}