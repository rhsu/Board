package rhsu.board.test;

/**
 *
 * @author rhsu
 */
public class TestAbstractImpl extends TestAbstract
{
	public TestAbstractImpl()
	{
		super();
	}
	
	@Override
	public void function()
	{
		super.function();
		System.out.println("Implementation");
	}
	
	public static void main(String[] args)
	{
		TestAbstractImpl test = new TestAbstractImpl();
	}
}
