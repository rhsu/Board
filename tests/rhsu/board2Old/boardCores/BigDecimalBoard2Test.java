package rhsu.board2Old.boardCores;

import rhsu.board2.boardCores.BigDecimalBoard2;
import java.math.BigDecimal;
import org.junit.*;
import rhsu.board2.boardCores.BigDecimalBoard2;
import static org.junit.Assert.assertEquals;
import rhsu.board2Old.Board2ImplTest;
import rhsu.board2Old.factory.BoardFactory;

public class BigDecimalBoard2Test extends Board2ImplTest
{
	@Before
	@Override
	public void createBoard()
	{
		int horizontalSize = 20;
		int verticalSize = 30;
		
		boardFactory = BoardFactory.createFactory(BigDecimalBoard2.class, horizontalSize, verticalSize);
		board = boardFactory.createBoard();
	}
	
	@Test
	@Override
	public void testGetDefaultValue()
	{
		assertEquals(BigDecimalBoard2.DEFAULT_VALUE, board.getDefaultValue());
	}
	
	@Test
	@Override
	public void testSetPieceAt()
	{
		BigDecimal setValue = BigDecimal.TEN;
		board.setPieceAt(2, 3, setValue);
		
		assertEquals(board.getPieceAt(2,3).getValue(), setValue);
	}
}
