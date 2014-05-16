package rhsu.board2;;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.factory.BoardPieceFactory;

@Ignore
public class BoardPiece2Test
{
	protected static final Object VALUE_TO_SET = "VALUE";
	protected static final int INDEX_TO_SET = 1500;
	
	protected BoardPiece2 boardPiece;
	protected BoardPieceFactory factory;
	
	@Before
	public void setupBoardPiece()
	{
		
	}
	
	@Test
	public void testSetValue()
	{
		boardPiece.setValue(VALUE_TO_SET);
		assertEquals(VALUE_TO_SET, boardPiece.getValue());
	}
	
	@Test
	public void testGetValue()
	{
		assertEquals(factory.getBoardPieceValue(), boardPiece.getValue());
	}
	
	@Test
	public void testSetHorizontalIndex()
	{
		//TODO: Negative index should throw exception
		boardPiece.setHorizontalIndex(INDEX_TO_SET);
		assertEquals(INDEX_TO_SET, boardPiece.getHorizontalIndex());
	}
	
	@Test
	public void testGetHorizontalIndex()
	{
		assertEquals(factory.getHorizontalIndex(), boardPiece.getHorizontalIndex());
	}
	
	@Test
	public void testSetVerticalIndex()
	{
		boardPiece.setVerticalIndex(INDEX_TO_SET);
		assertEquals(INDEX_TO_SET, boardPiece.getVerticalIndex());
	}
	
	@Test
	public void testGetVerticalIndex()
	{
		assertEquals(factory.getHorizontalIndex(), boardPiece.getHorizontalIndex());
	}
	
	/*TODO: these will be implemented once mobility is done
	@Test
	public void testGetMobilityStatus()
	{
		
	}
	
	@Test
	public void testSetMobilityStatus()
	{
		
	}
	
	@Test
	public void testGetUUID()
	{
		
	}
	
	@Test
	public void testsetUUID()
	{
		
	}*/
}
