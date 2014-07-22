package rhsu.compositeBoard.randomGenerators;

import java.util.Random;
import rhsu.board2.random.RandomGenerator;

public class RandomCharacterGenerator implements RandomGenerator<Character>
{
	final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	final int N = ALPHABET.length();
	
	@Override
	public Character getRandom()
	{
		Random random = new Random();
		return ALPHABET.charAt(random.nextInt(N));
	}
}
