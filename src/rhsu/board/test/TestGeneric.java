package rhsu.board.test;

import java.lang.reflect.Array;
import java.math.BigInteger;
import rhsu.board.implementations.math.IntegerBoard;

public class TestGeneric<T> 
{
	public T[] testArray;
	public T[][] testArray2;
	
	/*public TestGeneric()
	{
		testArray = (T[]) new Object[5];
	}*/
	
	public TestGeneric(Class<T[]> c, int length)
	{
		testArray = c.cast(Array.
				newInstance(c.getComponentType(), length));
	}
	
	public void test(T thing)
	{
		for(int i = 0; i < testArray.length; i++)
		{
			testArray[i] = thing;
		}
		
		for(int i = 0; i < testArray.length; i++)
		{
			System.out.println(testArray[i]);
		}
	}
	
	public static void main(String[] args)
	{
		//TestGeneric<String> myTest = new TestGeneric<>();
		TestGeneric<BigInteger> foo = new TestGeneric<>(BigInteger[].class, 5);
		//foo.test(5);
		//String[] bar = foo.testArray;
		//foo.testArray[0] = "xyz";
		//String baz = foo.testArray[0];
		
		//IntegerBoard b = new IntegerBoard(5,5);
		
	}
}
