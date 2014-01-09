package rhsu.board.utilities;

public final class PrintUtilityDebugger 
{
	private int counter;
	
	public PrintUtilityDebugger()
	{
		counter = 0;
	}
	
	public void print(Object obj)
	{
		String output = String.format("%d: %s", ++counter, obj.toString());
		System.out.println(output);
	}
}
