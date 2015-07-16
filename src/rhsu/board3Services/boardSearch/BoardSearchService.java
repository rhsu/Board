package rhsu.board3Services.boardSearch;

import java.util.List;
import rhsu.board3.Board3;

public final class BoardSearchService
{	
	public static <T> boolean containsValue(T value, Board3<T> board)
	{
		return false;
	}
	
	public static <T> boolean containsInstance(T instance, Board3<T> board)
	{
		return false;
	}
	
	public static <T> BoardSearchResult<T> getInstance(T instance, Board3<T> board)
	{
		return null;
	}
	
	public static <T> BoardSearchResult<T> getValue(T instance, Board3<T> board)
	{
		return null;
	}
	
	public static <T> List<BoardSearchResult<T>> getAllInstances(T instance, Board3<T> board)
	{
		return null;
	}
	
	public static <T> List<BoardSearchResult<T>> getAllValues(T value, Board3<T> board)
	{
		return null;
	}
}