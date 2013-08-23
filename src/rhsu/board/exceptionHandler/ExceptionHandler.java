package rhsu.board.exceptionHandler;

/**
 *
 * @author rhsu
 */
public class ExceptionHandler 
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
