package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardReaders.*;
import rhsu.board2.randomGenerators.*;

public class CompositeBoardClients
{
	static final BigDecimal DEFAULT_BIG_DECIMAL = BigDecimal.ZERO;
	static final BigInteger DEFAULT_BIG_INTEGER = BigInteger.ZERO;
	static final Boolean DEFAULT_BOOLEAN = false;
	static final Character DEFAULT_CHARACTER = '+';
	static final Double DEFAULT_DOUBLE = 0.0;
	static final Integer DEFAULT_INTEGER = 0;
	static final String DEFAULT_STRING = "++";
	
	public static CompositeBoardFactory<BigDecimal> GetBigDecimalBoardClient(BigDecimal defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BigDecimalRandomGenerator(), 
			new BigDecimalBoardIO());
	}
	
	public static CompositeBoardFactory<BigDecimal> GetBigDecimalBoardClient()
	{
		return new CompositeBoardFactory<>(DEFAULT_BIG_DECIMAL, 
			new BigDecimalRandomGenerator(), 
			new BigDecimalBoardIO());
	}
	
	public static CompositeBoardFactory<BigInteger> GetBigIntegerBoardClient(BigInteger defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BigIntegerRandomGenerator(), 
			new BigIntegerBoardIO());
	}
	
	public static CompositeBoardFactory<BigInteger> GetBigIntegerBoardClient()
	{		
		return new CompositeBoardFactory<>(DEFAULT_BIG_INTEGER, 
			new BigIntegerRandomGenerator(), 
			new BigIntegerBoardIO());
	}
	
	public static CompositeBoardFactory<Boolean> GetBooleanBoardClient(Boolean defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BooleanRandomGenerator(), 
			new BooleanBoardIO());
	}
	
	public static CompositeBoardFactory<Boolean> GetBooleanBoardClient()
	{		
		return new CompositeBoardFactory<>(DEFAULT_BOOLEAN, 
			new BooleanRandomGenerator(), 
			new BooleanBoardIO());
	}
	
	public static CompositeBoardFactory<Character> GetCharacterBoardClient(Character defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue, 
			new CharacterRandomGenerator(), 
			new CharacterBoardIO());
	}
	
	public static CompositeBoardFactory<Character> GetCharacterBoardClient()
	{
		return new CompositeBoardFactory<>(DEFAULT_CHARACTER, 
			new CharacterRandomGenerator(), 
			new CharacterBoardIO());
	}
	
	public static CompositeBoardFactory<Double> GetDoubleBoardClient(Double defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new DoubleRandomGenerator(), 
			new DoubleBoardIO());
	}
	
	public static CompositeBoardFactory<Double> GetDoubleBoardClient()
	{		
		return new CompositeBoardFactory<>(DEFAULT_DOUBLE, 
			new DoubleRandomGenerator(), 
			new DoubleBoardIO());
	}
	
	public static CompositeBoardFactory<Integer> GetIntegerBoardClient(Integer defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue,
			new IntegerRandomGenerator(),
			new IntegerBoardIO());
	}
	
	public static CompositeBoardFactory<Integer> GetIntegerBoardClient()
	{
		return new CompositeBoardFactory<>(DEFAULT_INTEGER,
			new IntegerRandomGenerator(),
			new IntegerBoardIO());
	}
	
	public static CompositeBoardFactory<String> GetStringBoardClient(String defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue,
			new StringRandomGenerator(),
			new StringBoardIO());
	}
	
	public static CompositeBoardFactory<String> GetStringBoardClient()
	{
		return new CompositeBoardFactory<>(DEFAULT_STRING,
			new StringRandomGenerator(),
			new StringBoardIO());
	}
}
