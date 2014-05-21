package factoryTest;


public class Grape implements Fruit
{

	@Override
	public String getColor()
	{
		return "Purple";
	}

	@Override
	public void doSomething()
	{
		System.out.println("I am grape");
	}
	
}
