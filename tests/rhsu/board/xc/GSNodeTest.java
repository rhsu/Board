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
public class GSNodeTest {

    public GSNodeTest() 
	{
    }

    @BeforeClass
    public static void setUpClass() 
	{
    }

    @AfterClass
    public static void tearDownClass() 
	{
    }

    @Before
    public void setUp() 
	{
    }

    @After
    public void tearDown() 
	{
    }

	/**
	 * Test of getItem method, of class GSNode.
	 */
	@Test
	public void testGetItem() 
	{
		System.out.println("getItem");
		GSNode<Integer> mockInstance = new GSNode<>(-1, -1, 5);
		BoardPiece<Integer> expResult = new BoardPiece<>(-1, -1, 5);
		BoardPiece<Integer> result = mockInstance.getItem();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getValue method, of class GSNode.
	 */
	@Test
	public void testGetValue() 
	{
		System.out.println("getValue");
		GSNode<Integer> mockInstance = new GSNode<>(-1, -1, 5);
		Integer expResult = 5;
		Integer result = mockInstance.getValue();
		assertEquals(expResult, result);
	}

}