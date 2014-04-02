package rhsu.board;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.basic.implementations.arithmetic.IntegerBoard;

public class MobilityTest 
{	
	private static final Board<Integer> source = new IntegerBoard(3,3,1);
	private static final Board<Integer> destination = new IntegerBoard(3,3,0);
	
	@Test
	public void test()
	{
		//test that the move is successful
		assertTrue(source.move(source.getPieceAt(0,0), 0, 0, destination));
		
		//assert that the move is successful
		assertEquals((int)source.getValueAt(0,0), 0);
		assertEquals((int)destination.getValueAt(0, 0), 1);
		
		//assert that the UUIDs were swapped correctly.
		assertEquals(source.getPieceAt(0, 0).getGUID(), source.getGUID());
		assertEquals(destination.getPieceAt(0, 0).getGUID(), destination.getGUID());
	}
}
