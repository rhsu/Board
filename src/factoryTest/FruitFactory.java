package factoryTest;

public class FruitFactory<F extends Fruit>
{
	final Class<F> fruitClass;
	
	public FruitFactory(final Class<F> fruitClass)
	{
		this.fruitClass = fruitClass;
	}
	
	public F create()
	{
		try
		{
			return fruitClass.newInstance();
		} 
		catch (InstantiationException | IllegalAccessException ex)
		{
			System.out.println(ex);
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		FruitFactory f = new FruitFactory(Apple.class);
		Fruit apple = f.create();
		
		apple.doSomething();
	}
}
