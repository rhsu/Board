package rhsu.compositeBoard.randomGenerators;

import java.util.Random;
import rhsu.board2.RandomGenerator;

public class CharacterRandomGenerator implements RandomGenerator<Character>
{
	final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	final int N = ALPHABET.length();
	
	@Override
	public Character getRandom()
	{
		return ALPHABET.charAt(new Random().nextInt(N));
	}
}
