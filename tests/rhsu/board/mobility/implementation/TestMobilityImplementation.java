package rhsu.board.mobility.implementation;

import rhsu.board.mobility.*;
import static org.junit.Assert.*;
import org.junit.*;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class TestMobilityImplementation 
{
	private static MobilityBoard<Integer> mockMobilityBoard;
	private static MobilityPiece<Integer> mockMobilityPieceZero;
	private static MobilityPiece<Integer> mockMobilityPieceDestination;
	
	@Before
    public void setUpClass() 
	{
		mockMobilityBoard = MockFactory.mockMobilityBoard();
		mockMobilityPieceZero = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(0,0);
		mockMobilityPieceZero.setValue(-99);
		mockMobilityPieceDestination = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(1,1);
		mockMobilityPieceDestination.setValue(-999);
	}

	@Test
	public void testMove()
	{	
		assertTrue(mockMobilityBoard.move(mockMobilityPieceZero, 1, 1));
		
		assertTrue(mockMobilityPieceZero.getValue() == -99);
		assertTrue(mockMobilityPieceZero.getHorizontal() == 1);
		assertTrue(mockMobilityPieceZero.getVertical() == 1);
		
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
}
