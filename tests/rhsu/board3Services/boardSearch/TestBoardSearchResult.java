package rhsu.board3Services.boardSearch;

import rhsu.board3.Board3TestCase;

public class TestBoardSearchResult extends Board3TestCase
{
	protected final int expected_horizontal_index;
	protected final int expected_vertical_index;
	protected final String expected_value;
	
	private BoardSearchResult<String> testSearchResult;
	
	public TestBoardSearchResult(String method) 
	{
		super(method);
		
		this.expected_horizontal_index = 98;
		this.expected_vertical_index = 89;
		this.expected_value = "value";
	}
	
	@Override
	public void setUp()
	{
		testSearchResult = new BoardSearchResult<>(expected_horizontal_index, 
			expected_vertical_index,
			expected_value);
	}
	
	public void testGetHorizontalIndex()
	{
		assertEquals(testSearchResult.getHorizontalIndex(), expected_horizontal_index);
	}
	
	public void testGetVerticalIndex()
	{
		assertEquals(testSearchResult.getVerticalIndex(), expected_vertical_index);
	}
	
	public void testGetValue()
	{
		assertEquals(testSearchResult.getValue(), expected_value);
	}
}
