/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rhsu.board.xc;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class GSNodeTest 
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
		BoardPiece<Integer> expResult = new BoardPiece<>(-1, -1, 5);
		BoardPiece<Integer> result = mockGSNode.getItem();
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
}