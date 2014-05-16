package rhsu.board2.factory;

import org.junit.*;
import static org.junit.Assert.*;

public class BoardFactoryTest
{
	private BoardFactory boardFactory;
	private final int horizontalSize = 100;
	private final int verticalSize = 200;
	
	@Before
	public void setupBoardFactory()
	{
		boardFactory = new BoardFactory(horizontalSize, verticalSize);
	}
	
	@Test
	public void testGetHorizontalSize()
	{
		assert(boardFactory.getHorizontalSize() == horizontalSize);
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assert(boardFactory.getVerticalSize() == verticalSize);
	}
	
	@Test
	public void testCreateBoard2ImplReturnsNotNull()
	{
		assertNotNull(boardFactory.createBoardImpl());
	}
	
	@Test
	public void testCreateIntegerBoardReturnsNotNull()
	{
		assertNotNull(boardFactory.createIntegerBoard());
	}
}
