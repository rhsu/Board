package rhsu.GenericTest;

public class GenericTest<T>
{
	T item;
	
	public GenericTest(T t)
	{
		this.item = t;
	}
	
	public T getItem()
	{
		return item;
	}
	
	public static void main(String[] args)
	{
		GenericTest<Integer> gt = new GenericTest<>(1);
		
		int i = gt.getItem();
	}
}
