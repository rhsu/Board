package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardIO.AbstractBoardIOFactory;
import rhsu.board2.randomGenerators.*;

public class BoardFactoryClient
{
	static final BigDecimal DEFAULT_BIG_DECIMAL = BigDecimal.ZERO;
	static final BigInteger DEFAULT_BIG_INTEGER = BigInteger.ZERO;
	static final Boolean DEFAULT_BOOLEAN = false;
	static final Character DEFAULT_CHARACTER = '+';
	static final Double DEFAULT_DOUBLE = 0.0;
	static final Integer DEFAULT_INTEGER = 0;
	static final String DEFAULT_STRING = "++";
	
	private final AbstractRandomGeneratorFactory abstractRandomGeneratorFactory;
	private final AbstractBoardIOFactory abstractBoardIOFactory;
	
	public BoardFactoryClient()
	{
		abstractRandomGeneratorFactory = new AbstractRandomGeneratorFactory();
		abstractBoardIOFactory = new AbstractBoardIOFactory();
	}

	public BoardFactory<BigDecimal> GetBigDecimalBoardFactory(BigDecimal defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			abstractRandomGeneratorFactory.getBigDecimalRandomGenerator(), 
			abstractBoardIOFactory.getBigDecimalBoardIO());
	}
	
	public BoardFactory<BigDecimal> GetBigDecimalBoardFactory()
	{
		return GetBigDecimalBoardFactory(DEFAULT_BIG_DECIMAL);
	}
	
	public BoardFactory<BigInteger> GetBigIntegerBoardFactory(BigInteger defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			abstractRandomGeneratorFactory.getBigIntegerRandomGenerator(),
			abstractBoardIOFactory.getBigIntegerBoardIO());
	}
	
	public BoardFactory<BigInteger> GetBigIntegerBoardFactory()
	{		
		return GetBigIntegerBoardFactory(DEFAULT_BIG_INTEGER);
	}
	
	public BoardFactory<Boolean> GetBooleanBoardFactory(Boolean defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			abstractRandomGeneratorFactory.getBooleanRandomGenerator(), 
			abstractBoardIOFactory.getBooleanBoardIO());
	}
	
	public BoardFactory<Boolean> GetBooleanBoardFactory()
	{		
		return GetBooleanBoardFactory(DEFAULT_BOOLEAN);
	}
	
	public BoardFactory<Character> GetCharacterBoardFactory(Character defaultValue)
	{
		return new BoardFactory<>(defaultValue, 
			abstractRandomGeneratorFactory.getCharacterRandomGenerator(),
			abstractBoardIOFactory.getCharacterBoardIO());
	}
	
	public BoardFactory<Character> GetCharacterBoardFactory()
	{
		return GetCharacterBoardFactory(DEFAULT_CHARACTER);
	}
	
	public BoardFactory<Double> GetDoubleBoardFactory(Double defaultValue)
	{		
		return new BoardFactory<>(defaultValue, 
			abstractRandomGeneratorFactory.getDoubleRandomGenerator(),
			abstractBoardIOFactory.getDoubleBoardIO());
	}
	
	public BoardFactory<Double> GetDoubleBoardFactory()
	{		
		return GetDoubleBoardFactory(DEFAULT_DOUBLE);
	}
	
	public BoardFactory<Integer> GetIntegerBoardFactory(Integer defaultValue)
	{
		return new BoardFactory<>(defaultValue,
			abstractRandomGeneratorFactory.getIntegerRandomGenerator(),
			abstractBoardIOFactory.getIntegerBoardIO());
	}
	
	public BoardFactory<Integer> GetIntegerBoardFactory()
	{
		return GetIntegerBoardFactory(DEFAULT_INTEGER);
	}
	
	public BoardFactory<String> GetStringBoardFactory(String defaultValue)
	{
		return new BoardFactory<>(defaultValue,
			abstractRandomGeneratorFactory.getStringRandomGenerator(),
			abstractBoardIOFactory.getStringBoardIO());
	}
	
	public BoardFactory<String> GetStringBoardFactory()
	{
		return GetStringBoardFactory(DEFAULT_STRING);
	}
}
