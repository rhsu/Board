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
	public void works()
	{
		assertNotNull(mockMobilityBoard);
		assertEquals(mockMobilityBoard.getHorizontal_size(), 5);
		assertEquals(mockMobilityBoard.getVertical_size(), 5);
	}
	
	@Test
	public void testMove()
	{
		MobilityBoard<Integer> testBoard = new BasicMobilityBoard<>(2,2,0);
		
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) testBoard.pieceAt(0, 0);
		MobilityPiece<Integer> destinationPiece = (MobilityPiece<Integer>) testBoard.pieceAt(1,1);
		
		pieceZero.setValue(-99);
		destinationPiece.setValue(-999);
		
		testBoard.move(pieceZero, 1, 1);
		
		assertTrue(pieceZero.getValue() == -99);
		assertTrue(pieceZero.getHorizontal() == 1);
		assertTrue(pieceZero.getVertical() == 1);
		
		assertTrue(destinationPiece.getValue() == -999);
		assertTrue(destinationPiece.getHorizontal() == 0);
		assertTrue(destinationPiece.getVertical() == 0);
	}
	
	@Test
	public void testMove2()
	{
		MobilityBoard<Integer> testBoard = new BasicMobilityBoard<>(5,5,0);
		
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) testBoard.pieceAt(0, 0);
		MobilityPiece<Integer> destinationPiece = (MobilityPiece<Integer>) testBoard.pieceAt(2,3);
		
		pieceZero.setValue(-99);
		destinationPiece.setValue(-999);
		
		testBoard.move(pieceZero, 2, 3);
		
		assertTrue(pieceZero.getValue() == -99);
		assertTrue(pieceZero.getHorizontal() == 2);
		assertTrue(pieceZero.getVertical() == 3);
		
		assertTrue(destinationPiece.getValue() == -999);
		assertTrue(destinationPiece.getHorizontal() == 0);
		assertTrue(destinationPiece.getVertical() == 0);
	}
}
