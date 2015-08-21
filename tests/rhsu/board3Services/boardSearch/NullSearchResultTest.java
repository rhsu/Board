package rhsu.board3Services.boardSearch;

import org.junit.Test;

public class NullSearchResultTest extends BoardSearchResultTest
{
	@Override 
	@Test public void setUp()
	{
		expected_horizontal_index = -1;
		expected_vertical_index = -1;
		expected_value = null;
		
		testSearchResult = BoardSearchResult.GetNullSearchResult();
	}
}