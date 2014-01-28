package rhsu.board.test;

/**
 *
 * @author rhsu
 */
public abstract class TestAbstract 
{
	public TestAbstract()
	{
		doFunction();
	}
	
	private void doFunction()
	{
		function();
	}
	
	public void function()
	{
		System.out.println("Super!!!");
	}
}
