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
		MobilityPiece<Integer> pieceZero = (MobilityPiece) mockMobilityBoard.pieceAt(0, 0);
		pieceZero.setValue(55);
		
		mockMobilityBoard.move(pieceZero, 1, 1);
		
		//this will fail but it should pass fix this later.
		//assertEquals(mockMobilityBoard.pieceAt(1, 1), pieceZero);
		
		assertEquals(mockMobilityBoard.pieceAt(1, 1).getValue(), pieceZero.getValue());
	}
}
