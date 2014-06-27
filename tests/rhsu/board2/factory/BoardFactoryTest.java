package rhsu.board2.factory;

import org.junit.*;
import rhsu.board2.BoardImpl;

public class BoardFactoryTest
{
	private BoardFactory boardFactory;
	private final int horizontalSize = 100;
	private final int verticalSize = 200;
	
	@Before
	public void setupBoardFactory()
	{
		boardFactory = BoardFactory.createFactory(BoardImpl.class, horizontalSize, verticalSize);
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
}
