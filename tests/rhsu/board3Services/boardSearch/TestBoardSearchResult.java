package rhsu.board3Services.boardSearch;

import rhsu.board3.Board3TestCase;

public class TestBoardSearchResult extends Board3TestCase
{
	private final int HORIZONTAL_INDEX = 89;
	private final int VERTICAL_INDEX = 98;
	private final String VALUE = "RESULT";
	
	private BoardSearchResult<String> testSearchResult;
	
	public TestBoardSearchResult(String method) 
	{
		super(method);
	}
	
	@Override
	public void setUp()
	{
		testSearchResult = new BoardSearchResult<>(HORIZONTAL_INDEX, 
			VERTICAL_INDEX,
			VALUE);
	}
	
	public void testGetHorizontalIndex()
	{
		assertEquals(testSearchResult.getHorizontalIndex(), HORIZONTAL_INDEX);
	}
	
	public void testGetVerticalIndex()
	{
		assertEquals(testSearchResult.getVerticalIndex(), VERTICAL_INDEX);
	}
	
	public void testGetValue()
	{
		assertEquals(testSearchResult.getValue(), VALUE);
	}
	
	public void testGetNullResult()
	{
		// TODO: Inheiritance testing? Don't want to repeat the same asserts again
		BoardSearchResult<String> nullResult = BoardSearchResult.GetNullResult();
		assertEquals(nullResult.getHorizontalIndex(), -1);
		assertEquals(nullResult.getVerticalIndex(), -1);
		assertEquals(nullResult.getValue(), null);
	}
}
