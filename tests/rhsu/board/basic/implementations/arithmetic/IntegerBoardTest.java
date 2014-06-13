package rhsu.board.basic.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

@Ignore
public class IntegerBoardTest 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static final IntegerBoard TEST_BOARD = new IntegerBoard(
		ResourceRetriever.GetResource("testZeroBoard", TEST_RESOURCE));
	
	private static final IntegerBoard ARITHMETIC_OP1 = new IntegerBoard(
			ResourceRetriever.GetResource("arithmeticOp1", TEST_RESOURCE));
	
	private static final IntegerBoard ARITHMETIC_OP2 = new IntegerBoard(
			ResourceRetriever.GetResource("arithmeticOp2", TEST_RESOURCE));
	
	private static final IntegerBoard EXPECTED_SUM = new IntegerBoard(
			ResourceRetriever.GetResource("expectedSum", TEST_RESOURCE));
	
	private static final IntegerBoard EXPECTED_DIFFERENCE = new IntegerBoard(
			ResourceRetriever.GetResource("expectedDifference", TEST_RESOURCE));
	
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new IntegerBoard(2,2));
	}
	
	//<editor-fold desc="Unit Tests for Equals" defaultstate="collapsed">
	
	@Test
	public void testEqualsSelf()
	{
		assertEquals(TEST_BOARD, TEST_BOARD);
	}
	
	@Test
	public void testNotEqualsNull()
	{
		assertFalse(TEST_BOARD.equals(null));
	}
	
	@Test
	public void testEquals()
	{
		assertEquals(TEST_BOARD, new IntegerBoard(2,2));
	}
	
	@Test
	public void testNotEquals()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				  new IntegerBoard(ResourceRetriever.GetResource("ExampleIntegerBoard")))
		);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Unit Tests for Arithmetic" defaultstate="collapsed">
	
	@Test
	public void testAdd()
	{
		
	}
		
	@Test
	public void testSubtract()
	{
		
	}
	
	@Test
	public void testMultiply()
	{
		
	}
	
	@Test
	public void testMultiplyScalar()
	{
		
	}
	
	//</editor-fold>
}
