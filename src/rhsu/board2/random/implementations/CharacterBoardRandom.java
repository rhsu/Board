package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.implementations.CharacterBoard2;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class CharacterBoardRandom 
	extends CharacterBoard2
	implements RandomBoard<Character>
{
	public CharacterBoardRandom(int horizontalSize, int verticalSize, Character defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public CharacterBoardRandom(int horizontalSize, int verticalSize)
	{
		super(horizontalSize, verticalSize);
	}
	
	@Override
	public RandomGenerator<Character> randomGenerator() 
	{
		RandomGenerator<Character> generator = new RandomGenerator()
		{
			final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
			final int N = ALPHABET.length();
			
			Random random = new Random();
			
			@Override
			public Character getRandom() 
			{
				return ALPHABET.charAt(random.nextInt(N));
			}
		};
		return generator;
	}
}
