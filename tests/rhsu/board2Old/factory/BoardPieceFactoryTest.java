package rhsu.board2Old.factory;

import org.junit.*;
import static org.junit.Assert.*;

public class BoardPieceFactoryTest
{
	private BoardPieceFactory factory;
	private final int horizontalSize = 100;
	private final int verticalSize = 200;
	private final Object value = new Integer(5);
	
	@Before
	public void setupBoardPieceFactory()
	{
		factory = new BoardPieceFactory(horizontalSize, verticalSize, value);
	}
	
	@Test
	public void testCreateBoardPieceImpl()
	{
		assertNotNull(factory.createBoardPieceImpl());
	}
}
