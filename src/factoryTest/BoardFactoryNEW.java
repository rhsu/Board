package factoryTest;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board2.Board2;
import rhsu.board2.basic.implementations.arithmetic.IntegerBoard2;

public class BoardFactoryNEW<B extends Board2>
{
	private final int horizontalSize;
	private final int verticalSize;
	final Class<B> boardClass;
	
	public BoardFactoryNEW(int horizontalSize, int verticalSize, final Class<B> boardClass)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardClass = boardClass;
	}
	
	public B createBoard() throws Exception
	{
		Object[] arguments = { horizontalSize, verticalSize };
		Constructor<B> constructor = boardClass.getConstructor(int.class, int.class);

		return constructor.newInstance(arguments);
	}
	
	public static void main(String[] args)
	{
		BoardFactoryNEW<IntegerBoard2> test = new BoardFactoryNEW<>(5, 5, IntegerBoard2.class);
		try
		{
			IntegerBoard2 b = test.createBoard();
		} catch (Exception ex)
		{
			Logger.getLogger(BoardFactoryNEW.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
