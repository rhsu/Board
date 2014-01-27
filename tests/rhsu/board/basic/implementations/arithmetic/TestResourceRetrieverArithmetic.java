package rhsu.board.basic.implementations.arithmetic;

import rhsu.board.implementations.basic.arithmetic.BigDecimalBoard;
import rhsu.board.implementations.basic.arithmetic.BigIntegerBoard;
import rhsu.board.implementations.basic.arithmetic.DoubleBoard;
import rhsu.board.implementations.basic.arithmetic.IntegerBoard;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

/**
 *
 * @author rhsu
 */
public class TestResourceRetrieverArithmetic 
{
	private static final String testResource = "/rhsu/board/resources/test/";
	
	@Test
	public void testDoubleBoard()
	{
	//	DoubleBoard testBoard = new DoubleBoard(
	//			ResourceRetriever.GetResource("testZeroBoard", testResource));
	//	assertEquals(testBoard.toString(), new DoubleBoard(2,2).toString());
	}
	
	@Test
	public void testBigIntegerBoard()
	{
	//	BigIntegerBoard testBoard = new BigIntegerBoard(
	//			ResourceRetriever.GetResource("testZeroBoard", testResource));
	//	assertEquals(testBoard.toString(), new BigIntegerBoard(2,2).toString());
	}
	
	@Test
	public void testBigDecimalBoard()
	{
	//	BigDecimalBoard testBoard = new BigDecimalBoard(
	//			ResourceRetriever.GetResource("testZeroBoard", testResource));
	//	assertEquals(testBoard.toString(), new BigDecimalBoard(2,2).toString());
	}
	
	@Test
	public void testIntegerBoard()
	{
	//	IntegerBoard testBoard = new IntegerBoard(
	//			ResourceRetriever.GetResource("testZeroBoard", testResource));
	//	assertEquals(testBoard.toString(), new IntegerBoard(2,2).toString());
	}
}
