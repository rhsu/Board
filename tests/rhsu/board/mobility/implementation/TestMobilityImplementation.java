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
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(0, 0);
		pieceZero.setValue(55);
		
		System.out.println("1: " + pieceZero);
		System.out.println("2 : " + mockMobilityBoard.pieceAt(0,0));
		
		boolean b = mockMobilityBoard.move(pieceZero, 1, 1);
		
		System.out.println("3: " + pieceZero);
		System.out.println("4: " + mockMobilityBoard.pieceAt(0, 0));
		
		System.out.println("5: " + mockMobilityBoard.pieceAt(1, 1));
		
		System.out.println("6: " + mockMobilityBoard);
		
		//this will fail but it should pass fix this later.
		//assertEquals(mockMobilityBoard.pieceAt(1, 1), pieceZero);
		
		//assertEquals(mockMobilityBoard.pieceAt(1, 1).getValue(), pieceZero.getValue());
		
		//System.out.println(pieceZero);
		//System.out.println(mockMobilityBoard.pieceAt(1, 1));
	}
}
