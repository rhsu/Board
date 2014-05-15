package rhsu.board2.basic.implementations.arithmetic;

import org.junit.*;
import rhsu.board2.Board2;
import rhsu.board2.basic.Board2IntIntImplTest;

public class IntegerBoard2IntIntTest extends Board2IntIntImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		board = (Board2) new IntegerBoard2(20,30);
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assert(board.getDefaultValue() == (Integer)0);
	}
}
