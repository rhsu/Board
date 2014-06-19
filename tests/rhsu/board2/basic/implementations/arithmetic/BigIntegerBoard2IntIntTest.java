package rhsu.board2.basic.implementations.arithmetic;

import java.math.BigInteger;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.basic.Board2ImplIntIntTest;
import rhsu.board2.factory.BoardFactory;

public class BigIntegerBoard2IntIntTest extends Board2ImplIntIntTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = new BoardFactory(BigIntegerBoard2.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(BigIntegerBoard2.DEFAULT_VALUE, board.getDefaultValue());
	}
}
