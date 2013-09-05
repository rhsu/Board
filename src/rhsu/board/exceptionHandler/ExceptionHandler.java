package rhsu.board.exceptionHandler;

/**
 *
 * @author rhsu
 */
public class ExceptionHandler<T> 
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
