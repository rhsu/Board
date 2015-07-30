package rhsu.board3.implementations;

import rhsu.board3.Board3;
import rhsu.board3.Board3TestCase;

public class TestArrayBoard3 extends Board3TestCase
{	
	private static final int EXPECTED_HORIZONTAL_SIZE = 50;
	private static final int EXPECTED_VERTICAL_SIZE = 25;
	
	private Board3<Integer> board;
	
	//<editor-fold desc="Constructors" defaultstate="collapsed">
	
	public TestArrayBoard3(String method) 
	{
		super(method);
	}
	
	//</editor-fold>
	
	//<editor-fold desc="SetUp" defaultstate="collapsed">
	
	@Override
	public void setUp()
	{
		board = new ArrayBoard3<>(EXPECTED_HORIZONTAL_SIZE, EXPECTED_VERTICAL_SIZE);
	}
	
	//</editor-fold>
	
	public void testGetHorizontalSize()
	{
		assertEquals(board.getHorizontalSize(), EXPECTED_HORIZONTAL_SIZE);
	}
	
	public void testGetVerticalSize()
	{
		assertEquals(board.getVerticalSize(), EXPECTED_VERTICAL_SIZE);
	}
	
	public void testGetSize()
	{
		assertEquals(board.getSize(), EXPECTED_HORIZONTAL_SIZE * EXPECTED_VERTICAL_SIZE);
	}
	
	/**
	 * Tests setting and getting.
	 * This test will test setting a value at location 10, 10 by checking
	 * that the location of the piece is the correct value
	 */
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
