package rhsu.board.basic.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

public class BigIntegerBoardTest 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static final BigIntegerBoard TEST_BOARD = new BigIntegerBoard(
			ResourceRetriever.GetResource("testZeroBoard", TEST_RESOURCE));
	
	private static final BigIntegerBoard ARITHMETIC_OP1 = new BigIntegerBoard(
			ResourceRetriever.GetResource("arithmeticOp1", TEST_RESOURCE));
	
	private static final BigIntegerBoard ARITHMETIC_OP2 = new BigIntegerBoard(
			ResourceRetriever.GetResource("arithmeticOp2", TEST_RESOURCE));
	
	private static final BigIntegerBoard EXPECTED_SUM = new BigIntegerBoard(
			ResourceRetriever.GetResource("expectedSum", TEST_RESOURCE));
	
	private static final BigIntegerBoard EXPECTED_DIFFERENCE = new BigIntegerBoard(
			ResourceRetriever.GetResource("expectedDifference", TEST_RESOURCE));
	
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new BigIntegerBoard(2,2));
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
		assertEquals(TEST_BOARD, new BigIntegerBoard(2,2));
	}
	
	@Test
	public void testNotEquals()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				  new BigIntegerBoard(ResourceRetriever.GetResource("ExampleIntegerBoard")))
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
