package rhsu.board.xc;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.BasicBoardPiece;

/**
 *
 * @author rhsu
 */
@Ignore
public class GSNodeTest2 
{
	static GSNode<Integer> mockGSNode;
	
    @BeforeClass
    public static void setUpClass() 
	{
		mockGSNode = new GSNode<>(-1, -1, 5);
    }

	/**
	 * Test of getItem method, of class GSNode.
	 */
	@Test
	public void testGetItem() 
	{
		System.out.println("getItem");
		BasicBoardPiece<Integer> expResult = new BasicBoardPiece<>(-1, -1, 5);
		BasicBoardPiece<Integer> result = mockGSNode.getItem();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getValue method, of class GSNode.
	 */
	@Test
	public void testGetValue() 
	{
		System.out.println("getValue");
		Integer expResult = 5;
		Integer result = mockGSNode.getValue();
		assertEquals(expResult, result);
	}
	
	@Test
	public void testEquals()
	{
		System.out.println("equals");
		GSNode<Integer> other = new GSNode<>(-1, -1, 5);
		assertEquals(mockGSNode, other);
	}
	
	@Test
	public void testGetNextNull()
	{
		System.out.println("getNextNull");
		assertNull(mockGSNode.getNext());
	}
	
	@Test
	public void testGetNextNotNull()
	{
		System.out.println("getNextNotNull");
		mockGSNode.setNext(mockGSNode);
		assertNotNull(mockGSNode.getNext());
	}
}