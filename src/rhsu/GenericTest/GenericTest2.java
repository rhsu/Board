package rhsu.GenericTest;

public class GenericTest2 extends AbstractGenericTest<Integer>
{
	public GenericTest2(Integer i)
	{
		super(i);
	}
	
	public static void main(String[] args)
	{
		GenericTest2 test = new GenericTest2(5);
		int i = test.getItem();
	}
}
