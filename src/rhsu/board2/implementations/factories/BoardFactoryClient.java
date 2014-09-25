package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardIO.AbstractBoardIOFactory;
import rhsu.board2.randomGenerators.*;

public class BoardFactoryClient
{
	private final AbstractRandomGeneratorFactory abstractRandomGeneratorFactory;
	private final AbstractBoardIOFactory abstractBoardIOFactory;
	private final DefaultValueMap defaultValueMap;
	
	public BoardFactoryClient(DefaultValueMap defaultValueMap)
	{
		this.abstractRandomGeneratorFactory = new AbstractRandomGeneratorFactory();
		this.abstractBoardIOFactory = new AbstractBoardIOFactory();
		this.defaultValueMap = defaultValueMap;
	}
	
	public BoardFactoryClient()
	{
		this(new DefaultValueMap());
	}

	public BoardFactory<BigDecimal> GetBigDecimalBoardFactory()
	{
		return new BoardFactory<>(defaultValueMap.getDefaultBigDecimal(), 
			abstractRandomGeneratorFactory.getBigDecimalRandomGenerator(), 
			abstractBoardIOFactory.getBigDecimalBoardIO());
	}
	
	public BoardFactory<BigInteger> GetBigIntegerBoardFactory()
	{		
		return new BoardFactory<>(defaultValueMap.getDefaultBigInteger(), 
			abstractRandomGeneratorFactory.getBigIntegerRandomGenerator(),
			abstractBoardIOFactory.getBigIntegerBoardIO());
	}
	
	public BoardFactory<Boolean> GetBooleanBoardFactory()
	{		
		return new BoardFactory<>(defaultValueMap.getDefaultBoolean(), 
			abstractRandomGeneratorFactory.getBooleanRandomGenerator(), 
			abstractBoardIOFactory.getBooleanBoardIO());
	}
	
	public BoardFactory<Character> GetCharacterBoardFactory()
	{
		return new BoardFactory<>(defaultValueMap.getDefaultCharacter(), 
			abstractRandomGeneratorFactory.getCharacterRandomGenerator(),
			abstractBoardIOFactory.getCharacterBoardIO());
	}
	
	public BoardFactory<Double> GetDoubleBoardFactory()
	{		
		return new BoardFactory<>(defaultValueMap.getDefaultDouble(), 
			abstractRandomGeneratorFactory.getDoubleRandomGenerator(),
			abstractBoardIOFactory.getDoubleBoardIO());
	}
	
	public BoardFactory<Integer> GetIntegerBoardFactory()
	{
		return new BoardFactory<>(defaultValueMap.getDefaultInteger(),
			abstractRandomGeneratorFactory.getIntegerRandomGenerator(),
			abstractBoardIOFactory.getIntegerBoardIO());
	}
	
	public BoardFactory<String> GetStringBoardFactory()
	{
		return new BoardFactory<>(defaultValueMap.getDefaultString(),
			abstractRandomGeneratorFactory.getStringRandomGenerator(),
			abstractBoardIOFactory.getStringBoardIO());
	}
}
