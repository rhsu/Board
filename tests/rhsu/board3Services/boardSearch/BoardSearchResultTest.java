package rhsu.board3Services.boardSearch;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BoardSearchResultTest
{
	//<editor-fold desc="Member Variables and Constants" defaultstate="Collapsed">
	
	protected final int expected_horizontal_index = 98;
	protected final int expected_vertical_index = 89;
	protected final String expected_value = "value";
	
	private BoardSearchResult<String> testSearchResult;
	
	//</editor-fold>
	
	@Before public void setUp()
	{		
		testSearchResult = new BoardSearchResult<>(expected_horizontal_index, 
			expected_vertical_index,
			expected_value);
	}
	
	@Test public void getHorizontalIndex()
	{
		assertEquals(testSearchResult.getHorizontalIndex(), expected_horizontal_index);
	}

	@Test public void getVerticalIndex()
	{
		assertEquals(testSearchResult.getVerticalIndex(), expected_vertical_index);
	}
	
	@Test public void getValue()
	{
		assertEquals(testSearchResult.getValue(), expected_value);
	}
}
