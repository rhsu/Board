package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class TestMoveFunctions 
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
		
		//ensures that the destination piece maintains its value
		//This will be modified: currently a swap is performed and everything works properly.
		//However with issue 111, this functionality will change
		assertTrue(mockPieceDestination.getValue() == -999);
		assertTrue(mockPieceDestination.getHorizontal() == 0);
		assertTrue(mockPieceDestination.getVertical() == 0);
	}
	
	/**
	 * Test to see if a move will fail because the destination is occupied
	 */
	@Test
	public void testMoveFail_Occupied()
	{
		mockPieceDestination.setStatus(MobilityStatus.Occupied);	
		assertFalse(mockBoard.move(mockPieceZero, 1,1));
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
		
		//ensures that the destination piece maintains its value
		//This will be modified: currently a swap is performed and everything works properly.
		//However with issue 111, this functionality will change
		assertTrue(mockOtherBoardPiece.getValue() == -999);
		assertTrue(mockOtherBoardPiece.getHorizontal() == 0);
		assertTrue(mockOtherBoardPiece.getVertical() == 0);
	}
}
