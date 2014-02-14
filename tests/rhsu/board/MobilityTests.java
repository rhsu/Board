package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;
import rhsu.board.resources.ResourceRetriever;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class MobilityTests 
{
	private static Board<Integer> mockBoard;
	private static BoardPiece<Integer> mockPieceZero;
	private static BoardPiece<Integer> mockPieceDestination;
	
	private static Board<Integer> mockOtherBoard;
	private static BoardPiece<Integer> mockOtherBoardPiece;
	
	private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";
	
	@Before
	public void setUpClass()
	{
		mockBoard = MockFactory.mockBoard();
		mockPieceZero = mockBoard.pieceAt(0, 0);
		mockPieceZero.setValue(-99);
				
		mockPieceDestination = mockBoard.pieceAt(1, 1);
		mockPieceDestination.setValue(-999);
		
		mockOtherBoard = MockFactory.mockBoard();
		
		mockOtherBoardPiece = mockOtherBoard.pieceAt(1,1);
		mockOtherBoardPiece.setValue(-999);
	}
	
	/**
	 * This test to see if the piece at (0,0) can be moved to location (1,1)
	 */
	@Test
	public void testMove()
	{
		//check if the move is possible and perform the action
		assertTrue(mockBoard.move(mockPieceZero, 1, 1));
		
		//ensures that piece zero maintains its same value
		//ensures that piece zero has the horizontal and vertical values of 1,1
		assertTrue(mockPieceZero.getValue() == -99);
		assertTrue(mockPieceZero.getHorizontal() == 1);
		assertTrue(mockPieceZero.getVertical() == 1);
		
		//ensures that the destination piece has the default value
		assertTrue(mockPieceDestination.getValue() == mockBoard.getDefaultValue());
		assertTrue(mockPieceDestination.getHorizontal() == 0);
		assertTrue(mockPieceDestination.getVertical() == 0);
	}
		
	/**
	 * Test to see if moving to another board works.
	 */
	@Test
	public void testMoveOtherBoard()
	{
		//check if the move is possible and perform the action
		assertTrue(mockBoard.move(mockPieceZero, 1, 1, mockOtherBoard));
		
		//ensures that piece zero maintains its same value
		//ensures that piece zero has the horizontal and vertical values of 1,1
		assertTrue(mockPieceZero.getValue() == -99);
		assertTrue(mockPieceZero.getHorizontal() == 1);
		assertTrue(mockPieceZero.getVertical() == 1);
		
		//ensures that the destination piece has the default value
		assertTrue(mockOtherBoardPiece.getValue() == mockOtherBoard.getDefaultValue());
		assertTrue(mockOtherBoardPiece.getHorizontal() == 0);
		assertTrue(mockOtherBoardPiece.getVertical() == 0);
	}
	
	/**
	 * Test to see if a move will fail because the destination is occupied
	 */
	@Test
	public void testMoveFail_Occupied()
	{
		mockBoard.pieceAt(1,1).setStatus(MobilityStatus.Occupied);
		assertFalse(mockBoard.move(mockBoard.pieceAt(0, 0), 1, 1));
	}
	
	/**
	 * This tests to see if issue 112 works. Tests getting the piece from all directions
	 */
	@Test
	public void testMobility112()
	{
		Board<Integer> test112Board = new IntegerBoard(
				ResourceRetriever.GetResource("testMobilityBoard", TEST_RESOURCE));
	
		//create a reference to pieceZero
		BoardPiece<Integer> pieceZero = test112Board.pieceAt(0, 0);
		
		assertTrue(test112Board.move(test112Board.pieceAt(0,0), 2, 2));
		
		assertTrue(test112Board.getUpValue(pieceZero) == 2);
		assertTrue(test112Board.getDownValue(pieceZero) == 8);
		assertTrue(test112Board.getLeftValue(pieceZero) == 4);
		assertTrue(test112Board.getRightValue(pieceZero) == 6);
	}
	
	
	
	
	
	@Ignore
	public void testMove_Direction()
	{
		//System.out.println(mockBoard);
	}
	
	@Ignore
	public void testMove_Fail_Not_From_Same_Board()
	{
		
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
}
