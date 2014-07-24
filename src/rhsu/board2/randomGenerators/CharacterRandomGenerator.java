package rhsu.board2.randomGenerators;

import java.util.Random;

public class CharacterRandomGenerator extends AbstractRandomGenerator<Character>
{
	final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	final int N = ALPHABET.length();
	
	@Override
	public Character getRandom()
	{
		return ALPHABET.charAt(new Random().nextInt(N));
	}
}
