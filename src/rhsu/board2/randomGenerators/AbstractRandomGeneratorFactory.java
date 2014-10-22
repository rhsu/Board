package rhsu.board2.randomGenerators;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

public class AbstractRandomGeneratorFactory
{
	private final Random random;
	
	public AbstractRandomGeneratorFactory()
	{
		random = new Random();
	}
	
	public AbstractRandomGenerator<BigDecimal> getBigDecimalRandomGenerator()
	{
		return new AbstractRandomGenerator<BigDecimal>() 
		{
			@Override
			public BigDecimal getRandom()
			{
				return new BigDecimal(random.nextDouble());
			}
		};	
	}
	
	public AbstractRandomGenerator<BigInteger> getBigIntegerRandomGenerator()
	{
		return new AbstractRandomGenerator<BigInteger>()
		{
			@Override
			public BigInteger getRandom()
			{
				return new BigInteger(Integer.toString(random.nextInt()));
			}
		};
	}
	
	public AbstractRandomGenerator<Boolean> getBooleanRandomGenerator()
	{
		return new AbstractRandomGenerator<Boolean>()
		{
			@Override
			public Boolean getRandom()
			{
				return random.nextBoolean();
			}
		};
	}
	
	public AbstractRandomGenerator<Character> getCharacterRandomGenerator()
	{
		return new AbstractRandomGenerator<Character>()
		{
			final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
			final int N = ALPHABET.length();
			
			@Override
			public Character getRandom()
			{
				return ALPHABET.charAt(random.nextInt(N));
			}	
		};
	}
	
	public AbstractRandomGenerator<Double> getDoubleRandomGenerator()
	{
		return new AbstractRandomGenerator<Double>()
		{
			@Override
			public Double getRandom()
			{
				return random.nextDouble();
			}
		};
	}
	
	public AbstractRandomGenerator<Integer> getIntegerRandomGenerator()
	{
		return new AbstractRandomGenerator<Integer>()
		{
			@Override
			public Integer getRandom()
			{
				return random.nextInt();
			}
		};
	}
	
	public AbstractRandomGenerator<String> getStringRandomGenerator()
	{
		return new AbstractRandomGenerator<String>()
		{
			@Override
			public String getRandom()
			{
				return UUID.randomUUID().toString();
			}
		};
	}
}
