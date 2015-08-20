package rhsu.board3.implementations;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import rhsu.board3.Board3;

public class ArrayBoard3Test
{	
	//<editor-fold desc="Member Variables and Constants" defaultstate="collapsed">
	
	private static final int EXPECTED_HORIZONTAL_SIZE = 50;
	private static final int EXPECTED_VERTICAL_SIZE = 25;
		
	private Board3<Integer> board;
	
	//</editor-fold>
	
	//<editor-fold desc="SetUp" defaultstate="collapsed">
	
	@Before
	public void setUp()
	{
		board = new ArrayBoard3<>(EXPECTED_HORIZONTAL_SIZE, EXPECTED_VERTICAL_SIZE);
	}
	
	//</editor-fold>
	
	@Test
	public void testGetHorizontalSize()
	{
		assertEquals(board.getHorizontalSize(), EXPECTED_HORIZONTAL_SIZE);
	}
	
	@Test
	public void testGetVerticalSize()
	{
		assertEquals(board.getVerticalSize(), EXPECTED_VERTICAL_SIZE);
	}
	
	@Test
	public void testGetSize()
	{
		assertEquals(board.getSize(), EXPECTED_HORIZONTAL_SIZE * EXPECTED_VERTICAL_SIZE);
	}
	
	/**
	 * Tests setting and getting.
	 * This test will test setting a value at location 10, 10 by checking
	 * that the location of the piece is the correct value
	 */	
	@Test
	public void testSetAndGet()
	{
		Integer value = -96578;
		board.setValueAt(10, 10, value);
		Integer retrievedValue = board.getValueAt(10, 10);
		
		assertEquals(retrievedValue, value);
	}
	
	/**
	 * Tests setting and getting 
	 * when the horizontal and vertical coordinates are not the same.	 
	 */
	@Test
	public void testSetAndGet2()
	{
		Integer value = -96578;
		board.setValueAt(10, 1, value);
		Integer retrievedValue = board.getValueAt(10, 1);
		
		assertEquals(retrievedValue, value);
	}
	
	// TODO: TestSetAndGet for negatives
	
	// TODO: TestSetAndGet for out of range
}
