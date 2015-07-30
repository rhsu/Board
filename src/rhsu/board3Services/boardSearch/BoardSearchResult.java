package rhsu.board3Services.boardSearch;

public class BoardSearchResult<T>
{	
	private final int horizontalIndex;
	private final int verticalIndex;
	private final T value;
	
	public T getValue() { return this.value; }
	
	public int getHorizontalIndex() { return this.horizontalIndex; }
	
	public int getVerticalIndex() { return this.verticalIndex; }
	
	public BoardSearchResult(int horizontalIndex, int verticalIndex, T value)
	{
		this.horizontalIndex = horizontalIndex;
		this.verticalIndex = verticalIndex;
		this.value = value;
	}
	
	private final static BoardSearchResult NullSearchResult = new BoardSearchResult(-1, -1, null);
	
	public static BoardSearchResult GetNullSearchResult() { return NullSearchResult; }
}
