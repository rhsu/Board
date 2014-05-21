package rhsu.board2.factory;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.basic.Board2Impl;

public class BoardFactoryTest
{
	private BoardFactory<Board2Impl> boardFactory;
	private final int horizontalSize = 100;
	private final int verticalSize = 200;
	
	@Before
	public void setupBoardFactory()
	{
		boardFactory = BoardFactory.createFactory(Board2Impl.class, horizontalSize, verticalSize);
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
		assertNotNull(boardFactory.createBoard());
	}
}
