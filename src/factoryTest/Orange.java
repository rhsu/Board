package factoryTest;

public class Orange implements Fruit
{

	@Override
	public String getColor()
	{
		return "Orange";
	}

	@Override
	public void doSomething()
	{
		System.out.println("I am orange");
	}
	
}
