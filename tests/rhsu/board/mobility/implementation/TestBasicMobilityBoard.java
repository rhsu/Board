package rhsu.board.mobility.implementation;

import rhsu.board.mobility.*;
import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class TestBasicMobilityBoard 
{
	/**
	 * The main board that will be tested throughout this unit test
	 */
	
	private static MobilityBoard<Integer> mockMobilityBoard;
	
	/**
	 * the piece at location (0,0) of mockMobilityBoard
	 * has value of -99
	 */
	private static MobilityPiece<Integer> mockMobilityPieceZero;
	
	/**
	 * the piece at location (1,1) of mockMobilityBoard.
	 * has value of -999
	 */
	private static MobilityPiece<Integer> mockMobilityPieceDestination;
	
	/**
	 * the other board to test on
	 */
	private static MobilityBoard<Integer> mockOtherBoard;
	
	/**
	 * the piece at location (1,1) of mockOtherBoard
	 */
	private static MobilityPiece<Integer> mockOtherMobilityPiece;
	
	@Before
    public void setUpClass() 
	{
		mockMobilityBoard = MockFactory.mockMobilityBoard();
		
		mockMobilityPieceZero = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(0,0);
		mockMobilityPieceZero.setValue(-99);
		
		mockMobilityPieceDestination = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(1,1);
		mockMobilityPieceDestination.setValue(-999);
		
		mockOtherBoard = MockFactory.mockMobilityBoard();
		
		mockOtherMobilityPiece = (MobilityPiece<Integer>) mockOtherBoard.pieceAt(1,1);
		mockOtherMobilityPiece.setValue(-999);
	}

	/**
	 * This tests to see if a the piece at (0,0) can be moved to location (1,1)
	 */
	@Test
	public void testMove()
	{	
		//check if the move is possible and perform the action
		assertTrue(mockMobilityBoard.move(mockMobilityPieceZero, 1, 1));
		
		//ensures that piece zero maintains its same value
		//ensures that piece zero has the horizontal and vertical values of 1,1
		assertTrue(mockMobilityPieceZero.getValue() == -99);
		assertTrue(mockMobilityPieceZero.getHorizontal() == 1);
		assertTrue(mockMobilityPieceZero.getVertical() == 1);
		
		//ensures that the destination piece maintains its value
		//This will be modified: currently a swap is performed and everything works properly.
		//However with issue 111, this functionality will change
		assertTrue(mockMobilityPieceDestination.getValue() == -999);
		assertTrue(mockMobilityPieceDestination.getHorizontal() == 0);
		assertTrue(mockMobilityPieceDestination.getVertical() == 0);
	}
	
	@Test
	public void testMoveFail_Occupied()
	{		
		mockMobilityPieceDestination.setStatus(MobilityStatus.Occupied);	
		assertFalse(mockMobilityBoard.move(mockMobilityPieceZero, 1,1));
	}
	
	@Test
	public void testMoveOtherBoard()
	{
		assertTrue(mockMobilityBoard.move(mockMobilityPieceZero, 1, 1, mockOtherBoard));
		
		assertTrue(mockMobilityPieceZero.getValue() == -99);
		assertTrue(mockMobilityPieceZero.getHorizontal() == 1);
		assertTrue(mockMobilityPieceZero.getVertical() == 1);
		
		assertTrue(mockOtherMobilityPiece.getValue() == -999);
		assertTrue(mockOtherMobilityPiece.getHorizontal() == 0);
		assertTrue(mockOtherMobilityPiece.getVertical() == 0);
	}
}
