package rhsu.GenericTest;

public abstract class AbstractGenericTest<T>
{
	T item;
	
	public T getItem()
	{
		return item;
	}
	
	public AbstractGenericTest(T t)
	{
		this.item = t;
	}
}
