package rhsu.board2;

import rhsu.board2.arrayBoard.basicBoard.BasicBoardBuilder;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.implementations.factories.BoardFactoryClient;

@Ignore
public abstract class Board2Test<T>
{
	protected int horizontalSize = 3;
	protected int verticalSize = 5;
	protected Board2<T> board;
	protected Board2<T> sameBoard;

	@Before
	public abstract void createBoard();
	
	@Test
	public void testBoardNotNull()
	{
		assertNotNull(board);
	}
	
	@Test
	public void testGetHorizontalSize() 
	{ 
		assert(board.getHorizontalSize() == horizontalSize);
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assert(board.getVerticalSize() == verticalSize);
	}
	
	@Test
	public void testGetSize()
	{
		int size = horizontalSize * verticalSize;
				
		assert(board.getSize() == size);
	}
	
	@Test
	public abstract void testGetDefaultValue();
	
	@Test
	public abstract void testSetPieceAt();
			
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
	public  void testEqualsSimilarBoard()
	{		
		assertEquals(sameBoard, board);
	}
	
	@Test
	public void testSimliarBoardSameHashCode()
	{
		assertEquals(board.hashCode(), sameBoard.hashCode());
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardSameTypeDifferentDimension()
	{
		Board2<T> differentBoard = new BasicBoardBuilder()
			.setHorizontalSize(100)
			.setVerticalSize(200)
			.createBoard();
		
		assertFalse(board.equals(differentBoard));
	}
	
	@Test
	public void testDoesNotEqualDifferentBoardDifferentType()
	 {
		Board2<String> stringBoard = new BoardFactoryClient()
			.GetStringBoardFactory()
			.createBoard(board.getHorizontalSize(), board.getVerticalSize());
		
		assertFalse(board.equals(stringBoard));
	}
}
