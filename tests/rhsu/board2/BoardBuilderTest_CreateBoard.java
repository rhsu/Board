package rhsu.board2;

import rhsu.board2.basicBoard.BasicBoardBuilder;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board2.unitTestUtilities.UnitTestLibrary;
import rhsu.board2.unitTestUtilities.UnitTestStubFactory;

public class BoardBuilderTest_CreateBoard
{
	private BoardBuilder<Object> builder;
	private final UnitTestStubFactory<Object> stubFactory = new UnitTestStubFactory<>();
	private Board2<Object> board;
	private final int HORIZONTAL_SIZE = 5;
	private final int VERTICAL_SIZE = 7;
	
	@Before
	public void setup()
	{
		builder = new BasicBoardBuilder<>()
			.setHorizontalSize(HORIZONTAL_SIZE)
			.setVerticalSize(VERTICAL_SIZE)
			.setBoardIO(stubFactory.getBoard2IOStub())
			.setMatrix(stubFactory.getMatrix2Stub())
			.setMobilityBoard(stubFactory.getMobilityBoardStub())
			.setRandomGenerator(stubFactory.getRandomGeneratorStub());
		
		board = builder.createBoard();
	}
	
	@Test
	public void testCreateBoardNotNull()
	{
		assertNotNull(board);
	}
	
	@Test
	public void testCreateBoard_HorizontalSet()
	{
		UnitTestLibrary.accessorAssertion(board.getHorizontalSize(), HORIZONTAL_SIZE);
	}
	
	@Test
	public void testCreateBoard_VerticalSet()
	{
		UnitTestLibrary.accessorAssertion(board.getVerticalSize(), VERTICAL_SIZE);
	}
	
	@Test
	public void testCreateBoard_BoardIOSet()
	{
		//UnitTestLibrary.accessorAssertion(builder.randomGenerator, board.getRandomGenerator());
	}
	
	@Test
	public void testCreateBoard_MatrixSet()
	{
		//UnitTestLibrary.accessorAssertion(builder.matrix, board.getMatrix());
	}
	
	@Test
	public void testCreateBoard_RandomGeneratorSet()
	{
		//UnitTestLibrary.accessorAssertion(builder.randomGenerator, board.getRandomGenerator());
	}
	
	@Test
	public void testCreateBoard_MobilitySet()
	{
		//UnitTestLibrary.accessorAssertion(builder.mobilityBoard, board.getMobilityBoard());
	}
}
