package rhsu.board.basic.implementations.arithmetic;

import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import rhsu.board.resources.ResourceRetriever;

public class BigDecimalBoardTest 
{
	//<editor-fold desc="Private Variables" defaultstate="collapsed">
	
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static final BigDecimalBoard TEST_BOARD = new BigDecimalBoard(
			ResourceRetriever.GetResource("testZeroBoard", TEST_RESOURCE));
	
	private static final BigDecimalBoard ARITHMETIC_OP1 = new BigDecimalBoard(
			ResourceRetriever.GetResource("arithmeticOp1", TEST_RESOURCE));
	
	private static final BigDecimalBoard ARITHMETIC_OP2 = new BigDecimalBoard(
			ResourceRetriever.GetResource("arithmeticOp2", TEST_RESOURCE));
	
	private static final BigDecimalBoard EXPECTED_SUM = new BigDecimalBoard(
			ResourceRetriever.GetResource("expectedSum", TEST_RESOURCE));
	
	private static final BigDecimalBoard EXPECTED_DIFFERENCE = new BigDecimalBoard(
			ResourceRetriever.GetResource("expectedDifference", TEST_RESOURCE));
	
	private static final BigDecimalBoard EXPECTED_MULTIPLY_SCALAR = new BigDecimalBoard(
			ResourceRetriever.GetResource("expectedMultiplyScalar", TEST_RESOURCE));
	
	//</editor-fold>
	
	@Test
	public void testResourceRetriever()
	{
		assertEquals(TEST_BOARD, new BigDecimalBoard(2,2));
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
		assertEquals(TEST_BOARD, new BigDecimalBoard(2,2));
	}
	
	@Test
	public void testNotEquals()
	{
		assertFalse
		(
			TEST_BOARD.equals(
				  new BigDecimalBoard(ResourceRetriever.GetResource("ExampleIntegerBoard")))
		);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="Unit Tests for Arithmetic" defaultstate="collapsed">
	
	@Test
	public void testAdd()
	{
		BigDecimalBoard sum = ARITHMETIC_OP1.add(ARITHMETIC_OP2);
		assertEquals(sum, EXPECTED_SUM);
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testAddException()
	{
		exception.expect(ArrayIndexOutOfBoundsException.class);
		TEST_BOARD.add(new BigDecimalBoard(6,6));
	}
	
	@Test
	public void testSubtract()
	{
		BigDecimalBoard difference = ARITHMETIC_OP1.subtract(ARITHMETIC_OP2);
		assertEquals(difference, EXPECTED_DIFFERENCE);
	}
	
	@Test
	public void testSubtractException()
	{
		exception.expect(ArrayIndexOutOfBoundsException.class);
		TEST_BOARD.subtract(new BigDecimalBoard(6,6));
	}
	
	@Test
	public void testMultiply()
	{
		
	}
	
	@Test
	public void testMultiplyScalar()
	{
		BigDecimalBoard result = ARITHMETIC_OP1.multiply(new BigDecimal(2));
	
		System.out.println(ARITHMETIC_OP1);
		System.out.println(result);
		
		//	assertEquals(result, EXPECTED_MULTIPLY_SCALAR);
	}
	
	//</editor-fold>
}
