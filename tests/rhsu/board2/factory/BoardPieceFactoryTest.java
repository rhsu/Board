package rhsu.board2.factory;

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
		factory = new BoardPieceFactory(100, 200, 5);
	}
	
	@Test
	public void testCreateBoardPieceImpl()
	{
		assertNotNull(factory.createBoardPieceImpl());
	}
}
