package rhsu.board.utilities;

public final class PrintUtilityDebugger 
{
	private int counter;
	private boolean noCount;
	
	public PrintUtilityDebugger()
	{
		this.noCount = false;
		this.counter = 0;
	}
	
	public PrintUtilityDebugger(boolean noCount)
	{
		this.noCount = noCount;
		this.counter = 0;
	}
	
	public void print(Object obj)
	{
		String output = noCount ? String.format("%s", obj.toString())
				: String.format("%d: %s", ++counter, obj.toString());
		System.out.println(output);
	}
}
