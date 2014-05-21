package factoryTest;

public class Apple implements Fruit
{
	@Override
	public String getColor()
	{
		return "Red";
	}

	@Override
	public void doSomething()
	{
		System.out.println("I am apple");
	}
	
}
