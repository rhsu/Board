package rhsu.board.exceptionHandler;

/**
 * A class for handling exceptions that are thrown throughout the application
 */
public class ExceptionHandler 
{
	/**
	 * Static function for handling exceptions
	 * @param exception the exception to handle
	 */
	/**
	 *
	 * @param exception
	 */
	public static void Handle(Exception exception)
	{
		Handle(exception, HandleType.RuntimeError);
	}
	
	/**
	 * Static function for handling exceptions
	 * @param exception the exception to handler
	 * @param type the Handling Type on how to handle the exception
	 */
	/**
	 *
	 * @param exception
	 * @param type
	 */
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
