package rhsu.board.implementations.arithmetic;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import rhsu.board.resources.ResourceRetriever;

public class TestBigDecimalBoard 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static final BigDecimalBoard ARITHMETIC_OP1 = new BigDecimalBoard(
			ResourceRetriever.GetResource("arithmeticOp1", TEST_RESOURCE));
	private static final BigDecimalBoard ARITHMETIC_OP2 = new BigDecimalBoard(
			ResourceRetriever.GetResource("arithmeticOp2", TEST_RESOURCE));
	private static final BigDecimalBoard EXPECTED_SUM = new BigDecimalBoard(
			ResourceRetriever.GetResource("expectedSum", TEST_RESOURCE));
	private static final BigDecimalBoard EXPECTED_DIFFERENCE = new BigDecimalBoard(
			ResourceRetriever.GetResource("expectedDifference", TEST_RESOURCE));
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		BigDecimalBoard testBoard = new BigDecimalBoard(
			ResourceRetriever.GetResource("testZeroBoard", TEST_RESOURCE));
		assertEquals(testBoard.toString(), new BigDecimalBoard(2,2).toString());
	}
	
	@Test
	public void testAdd()
	{
		BigDecimalBoard sum = ARITHMETIC_OP1.add(ARITHMETIC_OP2);
		assertEquals(sum, EXPECTED_SUM);
	}
	
	/*
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testAddException()
	{
		exception.expect(ArrayIndexOutOfBoundsException.class);
	}
			
	@Test
	public void testSubtract()
	{
		
	}
	
	@Test
	public void testSubtractException()
	{
		exception.expect(ArrayIndexOutOfBoundsException.class);
	}
	
	@Test
	public void testMultiply()
	{
		
	}
	
	@Test
	public void testMultiplyScalar()
	{
		
	}*/
}
