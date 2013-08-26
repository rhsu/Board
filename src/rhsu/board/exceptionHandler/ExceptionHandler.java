package rhsu.board.exceptionHandler;

/**
 *
 * @author rhsu
 */
public class ExceptionHandler 
{
	public static void Handle(Exception exception)
	{
		Handle(exception, HandleType.RuntimeError);
	}
	
	public static void Handle(Exception exception, HandleType type)
	{
		switch(type)
		{
			case Ignore:
				break;
			case RuntimeError:
				throw new RuntimeException(exception);
		}
	}
}
