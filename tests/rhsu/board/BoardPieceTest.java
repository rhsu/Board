package rhsu.board;

import rhsu.board.basic.BasicBoardPiece;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import rhsu.board.test.MockFactory;

/**
 *
 * @author rhsu
 */
public class BoardPieceTest 
{
	static BasicBoardPiece<Integer> mockBoardPiece;
	
	@BeforeClass
    public static void setUpClass() 
	{
		mockBoardPiece = MockFactory.mockBoardPiece();
    }
	
	/**
	 * Test of getHorizontal method, of class BoardPiece.
	 */
	@Test
	public void testGetHorizontal() 
	{
		int expResult = -1;
		int result = mockBoardPiece.getHorizontal();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getVertical method, of class BoardPiece.
	 */
	@Test
	public void testGetVertical() 
	{
		int expResult = -1;
		int result = mockBoardPiece.getVertical();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getValue method, of class BoardPiece.
	 */
	@Test
	public void testGetValue() 
	{
		Integer expResult = 5;
		Integer result = mockBoardPiece.getValue();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setValue method, of class BoardPiece.
	 */
	@Test
	public void testSetValue() 
	{
		mockBoardPiece.setValue(5);
		assertNotNull(mockBoardPiece.getValue());
	}

	/**
	 * Test of toString method, of class BoardPiece.
	 */
	@Test
	public void testToString() 
	{
		String expResult = "5";
		String result = mockBoardPiece.toString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of equals method, of class BoardPiece.
	 */
	@Test
	public void testEquals() 
	{
		assertEquals(mockBoardPiece, MockFactory.mockBoardPiece());
	}

	/**
	 * Test of getMockObject method, of class BoardPiece.
	 */
	@Test
	public void testGetMockObject() 
	{
		assertEquals(mockBoardPiece, MockFactory.mockBoardPiece());
	}
}