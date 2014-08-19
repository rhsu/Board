package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;

@Ignore
public class Board2Test<T>
{
	protected CompositeBoard<T> board;
	protected BoardBuilder<T> boardBuilder;
	
	@Before
	public void createBoard()
	{
		
	}
	
	@Test
	public void testBoardNotNull()
	{
		
	}
	
	@Test
	public void testGetHorizontalSize() 
	{ 
		assert(board.getHorizontalSize() == boardBuilder.horizontalSize);
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assert(board.getVerticalSize() == boardBuilder.verticalSize);
	}
	
	@Test
	public void testGetSize()
	{
		int size = boardBuilder.horizontalSize * boardBuilder.verticalSize;
		
		assert(board.getSize() == size);
	}
	
	@Test
	public void testGetDefaultValue()
	{
		assert(false);
	}
	
	@Test
	public void testSetPieceAt()
	{
	}
			
	@Test
	public void testEqualsSelf()
	{
		assertEquals(board, board);
	}
	
	
	/**
	 * Tests that the same hash code is generated if the two boards are equals
	 */
	@Test
	public void testEqualsSelfSameHashCode()
	{
		assertEquals(board.hashCode(), board.hashCode() );
	}
	
	@Test
	public void testEqualsSimilarBoard()
	{
		CompositeBoard<T> sameBoard = boardFactory.createBoard();
		
		assertEquals(sameBoard, board);
	}
	
	@Test
	public void testSimliarBoardSameHashCode()
	{
		CompositeBoard<T> sameBoard = boardFactory.createBoard();
		assertEquals(board.hashCode(), sameBoard.hashCode());
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardSameTypeDifferentDimension()
	{
		CompositeBoard<T> differentBoard = boardFactory.createBoard(100, 200);
		assertFalse(board.equals(differentBoard));
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardDifferentType()
	{
		CompositeBoard<String> stringBoard = BoardFactory.createFactory(
			StringBoard2.class, 
			boardFactory.getHorizontalSize(),
			boardFactory.getVerticalSize())
			.createBoard();
		
		assertFalse(board.equals(stringBoard));
	}
}
