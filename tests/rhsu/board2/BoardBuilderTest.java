package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.unitTestStubs.UnitTestStubFactory;

public class BoardBuilderTest
{
	BoardBuilder<Object> boardBuilder;
	private final static UnitTestStubFactory<Object> stubFactory = new UnitTestStubFactory<>();
	
	@Before
	public void setup()
	{
		boardBuilder = new BoardBuilder<>();
	}
	
	@Test
	public void testSetBoardIO()
	{	
		boardBuilder.setBoardIO(stubFactory.GetBoard2IOStub());
		accessorAssertion(boardBuilder.boardIO, stubFactory.GetBoard2IOStub());
	}
	
	@Test
	public void testSetMatrix()
	{
		boardBuilder.setMatrix(stubFactory.GetMatrix2Stub());
		accessorAssertion(boardBuilder.matrix, stubFactory.GetMatrix2Stub());
	}
	
	@Test
	public void testSetRandomGenerator()
	{
		
	}
	
	public void testSetMobilityBoard()
	{
		
	}
	
	public void testSetHorizontalSize()
	{

	}
	
	public void testSetVerticalSize()
	{

	}
	
	public void testSetDefaulValue()
	{

	}
	
	public void setBoardInitializable()
	{
		
	}
	
	private void accessorAssertion(Object boardBuilderItem, Object otherItem)
	{
		assertNotNull(boardBuilderItem);
		assertEquals(boardBuilderItem, otherItem);
	}
}