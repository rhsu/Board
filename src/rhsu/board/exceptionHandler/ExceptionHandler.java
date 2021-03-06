package rhsu.board.exceptionHandler;

/**
 * A class for handling exceptions that are thrown throughout the application
 */
public class ExceptionHandler<T> 
{
	/**
	 * Static function for handling exceptions
	 * @param exception the exception to handle
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
	
	public T AssignDefault(Exception exception)
	{
		return AssignDefault(exception, HandleType.RuntimeError, null);
	}
	
	public T AssignDefault(Exception exception, HandleType type, T defaultValue)
	{
		switch(type)
		{
			case Ignore:
				return defaultValue;
			case RuntimeError:
				throw new RuntimeException(exception);
		}
		return null;
	}
}
