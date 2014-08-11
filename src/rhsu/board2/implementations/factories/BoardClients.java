package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardReaders.*;
import rhsu.board2.randomGenerators.*;

public class BoardClients
{
	static final BigDecimal DEFAULT_BIG_DECIMAL = BigDecimal.ZERO;
	static final BigInteger DEFAULT_BIG_INTEGER = BigInteger.ZERO;
	static final Boolean DEFAULT_BOOLEAN = false;
	static final Character DEFAULT_CHARACTER = '+';
	static final Double DEFAULT_DOUBLE = 0.0;
	static final Integer DEFAULT_INTEGER = 0;
	static final String DEFAULT_STRING = "++";
	
	public static BoardFactory<BigDecimal> GetBigDecimalBoardFactory(BigDecimal defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			new BigDecimalRandomGenerator(), 
			new BigDecimalBoardIO());
	}
	
	public static BoardFactory<BigDecimal> GetBigDecimalBoardFactory()
	{
		return new BoardFactory<>(DEFAULT_BIG_DECIMAL, 
			new BigDecimalRandomGenerator(), 
			new BigDecimalBoardIO());
	}
	
	public static BoardFactory<BigInteger> GetBigIntegerBoardFactory(BigInteger defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			new BigIntegerRandomGenerator(), 
			new BigIntegerBoardIO());
	}
	
	public static BoardFactory<BigInteger> GetBigIntegerBoardFactory()
	{		
		return new BoardFactory<>(DEFAULT_BIG_INTEGER, 
			new BigIntegerRandomGenerator(), 
			new BigIntegerBoardIO());
	}
	
	public static BoardFactory<Boolean> GetBooleanBoardFactory(Boolean defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			new BooleanRandomGenerator(), 
			new BooleanBoardIO());
	}
	
	public static BoardFactory<Boolean> GetBooleanBoardFactory()
	{		
		return new BoardFactory<>(DEFAULT_BOOLEAN, 
			new BooleanRandomGenerator(), 
			new BooleanBoardIO());
	}
	
	public static BoardFactory<Character> GetCharacterBoardFactory(Character defaultValue)
	{
		return new BoardFactory<>(defaultValue, 
			new CharacterRandomGenerator(), 
			new CharacterBoardIO());
	}
	
	public static BoardFactory<Character> GetCharacterBoardFactory()
	{
		return new BoardFactory<>(DEFAULT_CHARACTER, 
			new CharacterRandomGenerator(), 
			new CharacterBoardIO());
	}
	
	public static BoardFactory<Double> GetDoubleBoardFactory(Double defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			new DoubleRandomGenerator(), 
			new DoubleBoardIO());
	}
	
	public static BoardFactory<Double> GetDoubleBoardFactory()
	{		
		return new BoardFactory<>(DEFAULT_DOUBLE, 
			new DoubleRandomGenerator(), 
			new DoubleBoardIO());
	}
	
	public static BoardFactory<Integer> GetIntegerBoardFactory(Integer defaultValue)
	{
		return new BoardFactory<>(defaultValue,
			new IntegerRandomGenerator(),
			new IntegerBoardIO());
	}
	
	public static BoardFactory<Integer> GetIntegerBoardFactory()
	{
		return new BoardFactory<>(DEFAULT_INTEGER,
			new IntegerRandomGenerator(),
			new IntegerBoardIO());
	}
	
	public static BoardFactory<String> GetStringBoardFactory(String defaultValue)
	{
		return new BoardFactory<>(defaultValue,
			new StringRandomGenerator(),
			new StringBoardIO());
	}
	
	public static BoardFactory<String> GetStringBoardFactory()
	{
		return new BoardFactory<>(DEFAULT_STRING,
			new StringRandomGenerator(),
			new StringBoardIO());
	}
}
