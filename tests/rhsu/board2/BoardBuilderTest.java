package rhsu.board2;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;
import rhsu.board2.unitTestStubs.Board2IOStub;
import rhsu.board2.unitTestStubs.Matrix2Stub;

public class BoardBuilderTest
{
	BoardBuilder<Object> boardBuilder;
	
	@Before
	public void setup()
	{
		boardBuilder = new BoardBuilder();
	}
	
	@Test
	public void testSetBoardIO()
	{	
		Board2IO<Object> item = new Board2IOStub();
		boardBuilder.setBoardIO(item);
		accessorAssertion(boardBuilder.boardIO, item);
	}
	
	@Test
	public void testSetMatrix()
	{
		Matrix2<Object> item = new Matrix2Stub();
		boardBuilder.setMatrix(item);
		accessorAssertion(boardBuilder.matrix, item);
	}
	
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