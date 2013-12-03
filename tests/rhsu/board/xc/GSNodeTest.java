/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rhsu.board.xc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class GSNodeTest {

    public GSNodeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

	/**
	 * Test of getItem method, of class GSNode.
	 */
	@Test
	public void testGetItem() {
		System.out.println("getItem");
		GSNode instance = null;
		BoardPiece expResult = null;
		BoardPiece result = instance.getItem();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getValue method, of class GSNode.
	 */
	@Test
	public void testGetValue() {
		System.out.println("getValue");
		GSNode instance = null;
		Object expResult = null;
		Object result = instance.getValue();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}