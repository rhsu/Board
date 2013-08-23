package rhsu.board.test;

/**
 *
 * @author rhsu
 */
public class ExceptionHandlerDemo 
{
	public static void Handle(Exception ex)
	{
		int i = 0;
		switch(i)
		{
			case 0:
				break;
			case 1:
				throw new RuntimeException(ex);
		}
	}
}
