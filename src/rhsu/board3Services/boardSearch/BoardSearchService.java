package rhsu.board3Services.boardSearch;

import java.util.ArrayList;
import java.util.List;
import rhsu.board3.Board3;

public final class BoardSearchService
{	
	public static <T> boolean containsValue(T value, Board3<T> board)
	{
		if (value == null)
		{
			// TODO: throw exception
		}

		// TODO: Java8 can I make this into a lambda?
		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if(board.getValueAt(i, j).equals(value))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static <T> boolean containsInstance(T instance, Board3<T> board)
	{
		if (instance == null)
		{
			// TODO: throw exception
		}
		
		// TODO: Java8 can I make this into a lambda?
		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if (board.getValueAt(i, j) == instance)
				{
					return true;
				}
			}
		}

		return false;
	}
	
	public static <T> BoardSearchResult<T> getInstance(T instance, Board3<T> board)
	{
		if (instance == null)
		{
			// TODO: throw exception.
		}

		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if(board.getValueAt(i, j) == instance)
				{
					BoardSearchResult<T> result = new BoardSearchResult(i, j, instance);
					return result;
				}
			}
		}
		
		return null;
	}
	
	public static <T> BoardSearchResult<T> getValue(T value, Board3<T> board)
	{
		if (value == null)
		{
			// TODO: throw exception.
		}

		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if(board.getValueAt(i, j).equals(value))
				{
					BoardSearchResult<T> result = new BoardSearchResult(i, j, value);
					return result;
				}
			}
		}
		
		return null;
	}
	
	public static <T> List<BoardSearchResult<T>> getAllInstances(T instance, Board3<T> board)
	{
		if (instance == null)
		{
			// TODO: throw exception.
		}
		
		List<BoardSearchResult<T>> results = new ArrayList<>();
		
		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if(board.getValueAt(i, j) == instance)
				{
					BoardSearchResult<T> result = new BoardSearchResult(i, j, instance);
					results.add(result);
				}
			}
		}
		
		return results;
	}
	
	public static <T> List<BoardSearchResult<T>> getAllValues(T value, Board3<T> board)
	{
		if (value == null)
		{
			// TODO: throw exception.
		}
		
		List<BoardSearchResult<T>> results = new ArrayList<>();
		
		for (int i = 0; i < board.getVerticalSize(); i++)
		{
			for (int j = 0; j < board.getHorizontalSize(); j++)
			{
				if(board.getValueAt(i, j).equals(value))
				{
					BoardSearchResult<T> result = new BoardSearchResult(i, j, value);
					results.add(result);
				}
			}
		}
		
		return results;
	}
}