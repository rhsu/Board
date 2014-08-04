package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.mocks.MockFactory;

/**
 *
 * @author rhsu
 */
public class BoardBuilderTest
{	
	private final MockFactory factory;
	private final Object defaultValue;
	private final CompositeBoard<Object> testCompositeBoard;
	private final int horizontalSize;
	private final int verticalSize;
	
	public BoardBuilderTest()
	{
		horizontalSize = 20;
		verticalSize = 30;
		factory = new MockFactory();
		defaultValue = new Object();
		
		testCompositeBoard = new BoardBuilder<>()
			.setBoardIO(factory.getMockBoardIO())
			.setMobilityBoard(factory.getMockMobilityBoard())
			.setRandomGenerator(factory.getMockRandomGenerator())
			.setHorizontalSize(horizontalSize)
			.setVerticalSize(verticalSize)
			.setDefaulValue(defaultValue)
			.setBoardInitializable(factory.getMockBoardInitializable())
			.createBoard();
	}
	
	@Test
	public void testMockBoardIOIsDefined()
	{
		assertEquals(testCompositeBoard.getBoardIO(), factory.getMockBoardIO());
	}
	
	@Test
	public void testMobilityBoardIsDefined()
	{
		assertEquals(testCompositeBoard.getMobilityBoard(), factory.getMockMobilityBoard());
	}
	
	@Test
	public void testRandomGeneratorIsDefined()
	{
		assertEquals(testCompositeBoard.getRandomGenerator(), factory.getMockRandomGenerator());
	}
	
	@Test
	public void testHorizontalSizeIsDefined()
	{
		assertEquals(testCompositeBoard.getHorizontalSize(), horizontalSize);
	}
	
	@Test
	public void testVerticalSizeIsDefined()
	{
		assertEquals(testCompositeBoard.getVerticalSize(), verticalSize);
	}
	
	@Test
	public void testDefaultvalueIsDefined()
	{
		assertEquals(testCompositeBoard.getDefaultValue(), defaultValue);
	}
}
