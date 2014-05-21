package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import rhsu.board2.basic.Board2ImplIntIntTest;
import rhsu.board2.factory.BoardFactory;

public class BigDecimalBoard2IntIntTest extends Board2ImplIntIntTest
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
		assertEquals(BigDecimal.ZERO, board.getDefaultValue());
	}
}