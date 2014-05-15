package rhsu.board2.basic.implementations.arithmetic;

import org.junit.*;
import rhsu.board2.basic.Board2IntIntImplTest;
import rhsu.board2.boardFactory.BoardFactory;

public class IntegerBoard2IntIntTest extends Board2IntIntImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(horizontalSize, verticalSize);		
		board = boardFactory.createIntegerBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		System.out.println(board.getDefaultValue());
		assert(board.getDefaultValue() == (Integer)0);
	}
}
