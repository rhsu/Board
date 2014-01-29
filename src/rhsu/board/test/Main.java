package rhsu.board.test;

import java.io.BufferedReader;
import rhsu.board.Board;
import rhsu.board.implementations.basic.*;
import rhsu.board.resources.ResourceRetriever;

public class Main
{	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static void main(String[] args)
	{	
		BufferedReader reader = ResourceRetriever.GetResource("ExampleBooleanBoard");
		
		Board test = new BooleanBoard(reader);
		
		print(test);
	}
}
