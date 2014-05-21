package rhsu.board2.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import rhsu.board2.Board2;

public class BoardFactory<B extends Board2>
{
	private final int horizontalSize;
	private final int verticalSize;
	final Class<B> boardClass;
	
	public int getHorizontalSize() { return this.horizontalSize; }
	public int getVerticalSize() { return this.verticalSize; }
	
	public BoardFactory(final Class<B> boardClass, int horizontalSize, int verticalSize)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardClass = boardClass;
	}
	
	public B createBoard(int horizontalSize, int verticalSize)
	{
		try
		{
			Object[] arguments = { horizontalSize, verticalSize };
			Constructor<B> constructor = boardClass.getConstructor(int.class, int.class);
			
			return constructor.newInstance(arguments);
		}
		catch(IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex)
		{
			System.out.println(ex);
		}
		return null;
	}
	
	public B createBoard()
	{
		return createBoard(this.horizontalSize, this.verticalSize);
	}
	
	public static <B extends Board2> BoardFactory<B> createFactory(final Class<B> boardClass,
		int horizontalSize,
		int verticalSize)
	{
		return new BoardFactory<>(boardClass, horizontalSize, verticalSize);
	}
}
