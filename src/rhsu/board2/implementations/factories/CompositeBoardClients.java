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
	static final Integer DEFALUT_INTEGER = 0;
	static final String DEFAULT_STRING = "++";
	
	public static CompositeBoardFactory<BigDecimal> GetBigDecimalBoardClient(BigDecimal defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BigDecimalRandomGenerator(), 
			new BigDecimalBoardIO());
	}
	
	public static CompositeBoardFactory<BigInteger> GetBigIntegerBoardClient(BigInteger defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BigIntegerRandomGenerator(), 
			new BigIntegerBoardIO());
	}
	
	public static CompositeBoardFactory<Boolean> GetBooleanBoardClient(Boolean defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new BooleanRandomGenerator(), 
			new BooleanBoardIO());
	}
	
	public static CompositeBoardFactory<Character> GetCharacterBoardClient(Character defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue, 
			new CharacterRandomGenerator(), 
			new CharacterBoardIO());
	}
	
	public static CompositeBoardFactory<Double> GetDoubleBoardClient(Double defaultValue)
	{		
		return new CompositeBoardFactory<>(defaultValue, 
			new DoubleRandomGenerator(), 
			new DoubleBoardIO());
	}
	
	public static CompositeBoardFactory<Integer> GetIntegerBoardClient(Integer defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue,
			new IntegerRandomGenerator(),
			new IntegerBoardIO());
	}
	
	public static CompositeBoardFactory<String> GetStringBoardClient(String defaultValue)
	{
		return new CompositeBoardFactory<>(defaultValue,
			new StringRandomGenerator(),
			new StringBoardIO());
	}
}
