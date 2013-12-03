package rhsu.board;

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
	static BoardPiece<Integer> mockBoardPiece;
	
	@BeforeClass
    public static void setUpClass() 
	{
		mockBoardPiece = (BoardPiece<Integer>) MockFactory.mock(new BoardPiece());
    }
	
	/**
	 * Test of getHorizontal method, of class BoardPiece.
	 */
	@Test
	public void testGetHorizontal() 
	{
		System.out.println("getHorizontal");
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
		System.out.println("getVertical");
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
		System.out.println("getValue");
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
		System.out.println("setValue");
		mockBoardPiece.setValue(5);
		assertNotNull(mockBoardPiece.getValue());
	}

	/**
	 * Test of toString method, of class BoardPiece.
	 */
	@Test
	public void testToString() 
	{
		System.out.println("toString");
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
		System.out.println("equals");
		BoardPiece<Integer> other = new BoardPiece<>(-1, -1, 5);
		assertEquals(mockBoardPiece, other);
	}

	/**
	 * Test of getMockObject method, of class BoardPiece.
	 */
	@Test
	public void testGetMockObject() 
	{
		System.out.println("getMockObject");
		BoardPiece<Integer> result = (BoardPiece<Integer>) mockBoardPiece.getMockObject();
		assertEquals(mockBoardPiece, result);
	}
}