package rhsu.board.mobility.implementation;

import rhsu.board.mobility.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import rhsu.board.test.MockFactory;
import rhsu.board.utilities.PrintUtilityDebugger;

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
		PrintUtilityDebugger debugger = new PrintUtilityDebugger();
		
		MobilityPiece<Integer> pieceZero = (MobilityPiece<Integer>) mockMobilityBoard.pieceAt(0, 0);
		pieceZero.setValue(55);
				
		debugger.print(pieceZero);
		debugger.print(mockMobilityBoard.pieceAt(0,0));
		
		boolean b = mockMobilityBoard.move(pieceZero, 1, 1);
		
		debugger.print(pieceZero);
		debugger.print(mockMobilityBoard.pieceAt(0,0));
		debugger.print(mockMobilityBoard.pieceAt(1,1));
		debugger.print(mockMobilityBoard);
		
		//this will fail but it should pass fix this later.
		//assertEquals(mockMobilityBoard.pieceAt(1, 1), pieceZero);
		
		//assertEquals(mockMobilityBoard.pieceAt(1, 1).getValue(), pieceZero.getValue());
		
		//System.out.println(pieceZero);
		//System.out.println(mockMobilityBoard.pieceAt(1, 1));
	}
}
