package rhsu.board2.random.implementations;

import java.util.Random;
import rhsu.board2.random.AbstractRandomBoard;
import rhsu.board2.random.RandomBoard;
import rhsu.board2.random.RandomGenerator;

public class CharacterRandomBoard 
	extends AbstractRandomBoard<Character>
	implements RandomBoard<Character>
{
	public CharacterRandomBoard(int horizontalSize, int verticalSize, Character defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public CharacterRandomBoard(int horizontalSize, int verticalSize)
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
