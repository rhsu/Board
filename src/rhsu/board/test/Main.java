package rhsu.board.test;

import rhsu.board3Services.boardSearch.BoardSearchResult;

public class Main
{	
    private static final String TEST_RESOURCE = "/rhsu/board/resources/test/";

    public static void print(Object o)
    {
		System.out.println(o);
    }
	
	public static void main(String[] args)
	{	
		BoardSearchResult<Integer> a = BoardSearchResult.GetNullResult();
		BoardSearchResult<Integer> b = BoardSearchResult.GetNullResult();
		
		print(a == b);
	}
}