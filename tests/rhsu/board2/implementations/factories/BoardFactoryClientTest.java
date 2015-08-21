package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.Board2;

@Ignore
public class BoardFactoryClientTest
{
	private final BoardFactoryClient factoryClient;
	private final int horizontalSize;
	private final int verticalSize;
	
	public BoardFactoryClientTest()
	{
		factoryClient = new BoardFactoryClient();
		horizontalSize = 3;
		verticalSize = 4;
	}
	
	@Test
	public void testBigDecimalBoard()
	{
		Board2<BigDecimal> result
			= factoryClient.GetBigDecimalBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testBigIntegerBoard()
	{
		Board2<BigInteger> result
			= factoryClient.GetBigIntegerBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testBooleanBoard()
	{
		Board2<Boolean> result 
			= factoryClient.GetBooleanBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testCharacterBoard()
	{
		Board2<Character> result 
			= factoryClient.GetCharacterBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testDoubleBoard()
	{
		Board2<Double> result
			= factoryClient.GetDoubleBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testIntegerBoard()
	{
		Board2<Integer> result
			= factoryClient.GetIntegerBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
}
