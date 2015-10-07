package rhsu.board3.implementations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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
	
	@Before public void setUp()
	{
		board = new ArrayBoard3<>(EXPECTED_HORIZONTAL_SIZE, EXPECTED_VERTICAL_SIZE);
	}
	
	//</editor-fold>
	
	@Test public void getHorizontalSize()
	{
		assertEquals(board.getHorizontalSize(), EXPECTED_HORIZONTAL_SIZE);
	}
	
	@Test public void getVerticalSize()
	{
		assertEquals(board.getVerticalSize(), EXPECTED_VERTICAL_SIZE);
	}
	
	@Test public void getSize()
	{
		assertEquals(board.getSize(), EXPECTED_HORIZONTAL_SIZE * EXPECTED_VERTICAL_SIZE);
	}
	
	/**
	 * Tests setting and getting.
	 * This test will test setting a value at location 10, 10 by checking
	 * that the location of the piece is the correct value
	 */	
	@Test public void setAndGetValue()
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
	@Test public void setAndGetValue2()
	{
		Integer value = -96578;
		board.setValueAt(10, 1, value);
		Integer retrievedValue = board.getValueAt(10, 1);
		
		assertEquals(retrievedValue, value);
	}
	
	/**
	 * Tests retrieving the value of an index that is equal to the horizontal 
	 * size
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void setAndGet3()
	{
		Integer retrievedValue = board.getValueAt(board.getHorizontalSize(), 0);
		assertNull(retrievedValue);
	}
	
	/**
	 * Tests retrieving the value of a negative horizontal
	 * index
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void setAndGet4()
	{
		Integer retrievedValue = board.getValueAt(-1, 0);
	}
	
	/**
	 * Tests retrieving the value of a negative vertical 
	 * index
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void setAndGet5()
	{
		Integer retrievedValue = board.getValueAt(0, -1);
		assertNull(retrievedValue);
	}
	
	/**
	 * Tests retrieving the value of an index that is equal to the vertical
	 * size
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void setAndGetWhenEqualToVerticalSize()
	{
		Integer retrievedValue = board.getValueAt(0, board.getVerticalSize());
		assertNull(retrievedValue);
	}
}
