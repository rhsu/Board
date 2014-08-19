package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.implementations.factories.BoardFactoryClient;

@Ignore
public abstract class Board2Test<T>
{
	protected CompositeBoard<T> board;
	protected BoardBuilder<T> boardBuilder;
	
	@Before
	public abstract void createBoard();
	
	@Test
	public abstract void testBoardNotNull();
	
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
		CompositeBoard<T> sameBoard = boardBuilder.createBoard();
		
		assertEquals(sameBoard, board);
	}
	
	@Test
	public void testSimliarBoardSameHashCode()
	{
		CompositeBoard<T> sameBoard = boardBuilder.createBoard();
		assertEquals(board.hashCode(), sameBoard.hashCode());
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardSameTypeDifferentDimension()
	{
		CompositeBoard<T> differentBoard = boardBuilder
			.setHorizontalSize(100)
			.setVerticalSize(200)
			.createBoard();
		
		assertFalse(board.equals(differentBoard));
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardDifferentType()
	 {
		CompositeBoard<String> stringBoard = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoard(board.getHorizontalSize(), board.getVerticalSize());
		
		assertFalse(board.equals(stringBoard));
	}
}
