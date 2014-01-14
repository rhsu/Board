package rhsu.board.mobility.implementation;

import rhsu.board.mobility.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class TestMobilityImplementation 
{
	static MobilityBoard<Integer> mockMobilityBoard;
	
	@BeforeClass
    public static void setUpClass() 
	{
		mockMobilityBoard = MockFactory.mockMobilityBoard();
    }

	@Test
	public void testMove()
	{
		MobilityBoard<Integer> testBoard = new BasicMobilityBoard<>(5,5,0);
		
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) testBoard.pieceAt(0, 0);
		MobilityPiece<Integer> destinationPiece = (MobilityPiece<Integer>) testBoard.pieceAt(2,3);
		
		pieceZero.setValue(-99);
		destinationPiece.setValue(-999);
		
		assertTrue(testBoard.move(pieceZero, 2, 3));
		
		assertTrue(pieceZero.getValue() == -99);
		assertTrue(pieceZero.getHorizontal() == 2);
		assertTrue(pieceZero.getVertical() == 3);
		
		assertTrue(destinationPiece.getValue() == -999);
		assertTrue(destinationPiece.getHorizontal() == 0);
		assertTrue(destinationPiece.getVertical() == 0);
	}
	
	@Test
	public void testMoveFail_Occupied()
	{
		MobilityBoard<Integer> testBoard = new BasicMobilityBoard<>(5,5,0);
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) testBoard.pieceAt(0, 0);
		MobilityPiece<Integer> destination = (MobilityPiece<Integer>) testBoard.pieceAt(1,1);
		
		destination.setStatus(MobilityStatus.Occupied);
		
		assertFalse(testBoard.move(pieceZero, 1,1));
	}
}
