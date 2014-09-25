package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.CompositeBoard;

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
		CompositeBoard<BigDecimal> result
			= factoryClient.GetBigDecimalBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testBigIntegerBoard()
	{
		CompositeBoard<BigInteger> result
			= factoryClient.GetBigIntegerBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testBooleanBoard()
	{
		CompositeBoard<Boolean> result 
			= factoryClient.GetBooleanBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testCharacterBoard()
	{
		CompositeBoard<Character> result 
			= factoryClient.GetCharacterBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testDoubleBoard()
	{
		CompositeBoard<Double> result
			= factoryClient.GetDoubleBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
	
	@Test
	public void testIntegerBoard()
	{
		CompositeBoard<Integer> result
			= factoryClient.GetIntegerBoardFactory().createBoard(horizontalSize, verticalSize);
		assertNotNull(result);
	}
}
