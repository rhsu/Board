package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigDecimal;
import org.junit.*;
import rhsu.board2.basic.Board2IntIntImplTest;
import rhsu.board2.boardFactory.BoardFactory;

public class BigDecimalBoard2IntIntTest extends Board2IntIntImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(horizontalSize, verticalSize);
		board = boardFactory.createBigDecimalBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == BigDecimal.ZERO);
	}
}
