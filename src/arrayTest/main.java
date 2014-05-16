package arrayTest;

public class main
{
	public static void main(String[] args)
	{
		//verticalSize is 5
		//horizontalSize is 6
		int[][] test = new int[5][6];
		
		int ctr = 1;
		
		for (int[] test1 : test)
		{
			for (int j = 0; j < test1.length; j++)
			{
				test1[j] = ctr++;
			}
		}
		
		for (int[] test1 : test)
		{
			for (int j = 0; j < test1.length; j++)
			{
				System.out.print(test1[j] + " ");
			}
			System.out.println();
		}
	}
}
