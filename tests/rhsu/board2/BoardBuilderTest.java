package rhsu.board2;

import org.junit.*;
import rhsu.board2.unitTestUtilities.UnitTestLibrary;
import rhsu.board2.unitTestUtilities.UnitTestStubFactory;

public class BoardBuilderTest
{
	BoardBuilder<Object> boardBuilder;
	private UnitTestStubFactory<Object> stubFactory;
	
	@Before
	public void setup()
	{
		boardBuilder = new BoardBuilder<>();
		stubFactory = new UnitTestStubFactory();
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
	
	@Test
	public void testSetMobilityBoard()
	{
		boardBuilder.setMobilityBoard(stubFactory.getMobilityBoardStub());
		UnitTestLibrary.accessorAssertion(boardBuilder.mobilityBoard, stubFactory.getMobilityBoardStub());
	}
	
	@Test
	public void testSetHorizontalSize()
	{
		boardBuilder.setHorizontalSize(10);
		UnitTestLibrary.accessorAssertion(boardBuilder.horizontalSize, 10);
	}
	
	@Test
	public void testSetVerticalSize()
	{
		boardBuilder.setVerticalSize(10);
		UnitTestLibrary.accessorAssertion(boardBuilder.verticalSize, 10);
	}
	
	@Test
	public void testSetDefaulValue()
	{
		Object something = new Object();
		boardBuilder.setDefaulValue(something);
		UnitTestLibrary.accessorAssertion(boardBuilder.defaultValue, something);
	}
	
	@Test
	public void setBoardInitializable()
	{
		boardBuilder.setBoardInitializable(stubFactory.getBoardInitializable());
		UnitTestLibrary.accessorAssertion(boardBuilder.boardInitializer, stubFactory.getBoardInitializable());
	}
	
	@Test
	public void testCreateBoard()
	{
		
	}
}