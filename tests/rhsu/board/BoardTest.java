package rhsu.board;

import rhsu.board2.mobility.MobilityStatus;
import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
@Ignore
public class BoardTest 
{
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	private static Board<Integer> mockMoveBoard;
	private static BoardPiece<Integer> mockMovePiece;
	private static BoardPiece<Integer> mockMovePieceDestination;
	
	private static Board<Integer> mockMoveOtherBoard;
	private static BoardPiece<Integer> mockMoveOtherPiece;
	
	private static Board<Integer> testMoveDirectionBoard;
	
	@Before
	public void setUpClass()
	{
		mockMoveBoard = MockFactory.mockBoard();
		mockMovePiece = mockMoveBoard.getPieceAt(0, 0);
		mockMovePiece.setValue(-99);
				
		mockMovePieceDestination = mockMoveBoard.getPieceAt(1, 1);
		mockMovePieceDestination.setValue(-999);
		
		mockMoveOtherBoard = MockFactory.mockBoard();
		
		mockMoveOtherPiece = mockMoveOtherBoard.getPieceAt(1,1);
		mockMoveOtherPiece.setValue(-999);
		
		testMoveDirectionBoard = new IntegerBoard(
			ResourceRetriever.GetResource("testMoveDirectionBoard", TEST_RESOURCE));
	}
	
	/**
	 * This test to see if the piece at (0,0) can be moved to location (1,1)
	 */
	@Test
	public void testMove()
	{
		//check if the move is possible and perform the action
		assertTrue(mockMoveBoard.move(mockMovePiece, 1, 1));
		
		//ensures that piece zero maintains its same value
		//ensures that piece zero has the horizontal and vertical values of 1,1
		assertTrue(mockMovePiece.getValue() == -99);
		assertTrue(mockMovePiece.getHorizontal() == 1);
		assertTrue(mockMovePiece.getVertical() == 1);
		
		//ensures that the destination piece has the default value
		assertTrue(mockMovePieceDestination.getValue() == mockMoveBoard.getDefaultValue());
		assertTrue(mockMovePieceDestination.getHorizontal() == 0);
		assertTrue(mockMovePieceDestination.getVertical() == 0);
	}
		
	/**
	 * Test to see if moving to another board works.
	 */
	@Test
	public void testMoveOtherBoard()
	{
		//check if the move is possible and perform the action
		assertTrue(mockMoveBoard.move(mockMovePiece, 1, 1, mockMoveOtherBoard));
		
		//ensures that piece zero maintains its same value
		//ensures that piece zero has the horizontal and vertical values of 1,1
		assertTrue(mockMovePiece.getValue() == -99);
		assertTrue(mockMovePiece.getHorizontal() == 1);
		assertTrue(mockMovePiece.getVertical() == 1);
		
		//ensures that the destination piece has the default value
		assertTrue(mockMoveOtherPiece.getValue() == mockMoveOtherBoard.getDefaultValue());
		assertTrue(mockMoveOtherPiece.getHorizontal() == 0);
		assertTrue(mockMoveOtherPiece.getVertical() == 0);
	}
	
	/**
	 * Test to see if a move will fail because the destination is occupied
	 */
	@Test
	public void testMoveFail_Occupied()
	{
		mockMoveBoard.getPieceAt(1,1).setStatus(MobilityStatus.Occupied);
		assertFalse(mockMoveBoard.move(mockMoveBoard.getPieceAt(0, 0), 1, 1));
	}
	
	/**
	 * This tests to see if issue 112 works. Tests getting the piece from all directions
	 */
	@Test
	public void testMovePreservesIndices()
	{
		Board<Integer> test112Board = new IntegerBoard(
				ResourceRetriever.GetResource("testMobilityBoard", TEST_RESOURCE));
	
		//create a reference to pieceZero			
		BoardPiece<Integer> pieceZero = test112Board.getPieceAt(0, 0);		
		assertTrue(test112Board.move(test112Board.getPieceAt(0,0), 2, 2));
		
		assertTrue(test112Board.getValueAt(pieceZero, Direction.UP, 1) == 2);
		assertTrue(test112Board.getValueAt(pieceZero, Direction.DOWN, 1) == 8);
		assertTrue(test112Board.getValueAt(pieceZero, Direction.LEFT, 1) == 4);
		assertTrue(test112Board.getValueAt(pieceZero, Direction.RIGHT, 1) == 6);
	}
	
	@Ignore
	public void testMove_Fail_Not_From_Same_Board()
	{
		
	}
	
	@Ignore
	public void testMove_Direction()
	{
		//System.out.println(mockBoard);
	}
	
	
	@Ignore
	public void testMove_Down_pass()
	{
		
	}
	
	@Ignore
	public void testMove_Up_pass()
	{
	}
	
	@Ignore
	public void testMove_Left_pass()
	{
	}
	
	@Ignore
	public void testMove_Right_pass()
	{
		
	}
	
	@Test
	public void test_GetValueAt_Up()
	{
		//UP
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.UP, 1), 1);
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.UP, 2), -1);
	}	
	
	@Test
	public void test_GetValueAt_Down()
	{
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.DOWN, 1), 4);
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.DOWN, 2), -4);
	}
			
	@Test
	public void test_GetValueAt_Left()
	{
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.LEFT, 1), 2);
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.LEFT, 2), -2);
	}
			
	@Test
	public void test_GetValueAt_Right()
	{
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.RIGHT, 1), 3);
		assertEquals((int)testMoveDirectionBoard.getValueAt(2, 2, Direction.RIGHT, 2), -3);
	}
}
