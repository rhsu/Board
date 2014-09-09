package rhsu.board2;

import org.junit.*;
import rhsu.board2.unitTestUtilities.UnitTestLibrary;
import rhsu.board2.unitTestUtilities.UnitTestStubFactory;

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
		boardBuilder.setBoardIO(stubFactory.getBoard2IOStub());
		UnitTestLibrary.accessorAssertion(boardBuilder.boardIO, stubFactory.getBoard2IOStub());
	}
	
	@Test
	public void testSetMatrix()
	{
		boardBuilder.setMatrix(stubFactory.getMatrix2Stub());
		UnitTestLibrary.accessorAssertion(boardBuilder.matrix, stubFactory.getMatrix2Stub());
	}
	
	@Test
	public void testSetRandomGenerator()
	{
		boardBuilder.setRandomGenerator(stubFactory.getRandomGeneratorStub());
		UnitTestLibrary.accessorAssertion(boardBuilder.randomGenerator, stubFactory.getRandomGeneratorStub());
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
}