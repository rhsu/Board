package rhsu.board2.unitTestUtilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UnitTestLibrary
{
	public static void accessorAssertion(Object boardBuilderItem, Object otherItem)
	{
		assertNotNull(boardBuilderItem);
		assertEquals(boardBuilderItem, otherItem);
	}
}
