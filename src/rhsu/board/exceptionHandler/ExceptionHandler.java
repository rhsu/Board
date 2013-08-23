package rhsu.board.exceptionHandler;

/**
 *
 * @author rhsu
 */
public class ExceptionHandler 
{
	public static void Handle(Exception ex, HandleType type)
	{
		switch(type)
		{
			case Ignore:
				break;
			case RuntimeError:
				throw new RuntimeException(ex);
		}
	}
}
