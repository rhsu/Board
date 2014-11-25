package rhsu.board2.implementations.factories;

import rhsu.board2.boardModules.randomGenerators.AbstractRandomGeneratorFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import rhsu.board2.boardModules.boardIO.AbstractBoardIOFactory;

public class BoardFactoryClient
{
	//<editor-fold desc="Default Value Map" defaultstate="collapsed">
	
	private static class DefaultValueMap extends HashMap<String, Object>
	{
		BigDecimal getDefaultBigDecimal() { return (BigDecimal) this.get("BigDecimal"); }
		BigInteger getDefaultBigInteger() { return (BigInteger) this.get("BigInteger"); }
		Boolean getDefaultBoolean() { return (Boolean) this.get("Boolean"); }
		Character getDefaultCharacter() { return (Character) this.get("Character"); }
		Double getDefaultDouble() { return (Double) this.get("Double"); }
		Integer getDefaultInteger() { return (Integer) this.get("Integer"); }
		String getDefaultString() { return (String) this.get("String"); }

		void setDefaultBigInteger(BigInteger value) { this.put("BigInteger", value); };
		void setDefaultBigDecimal(BigDecimal value) { this.put("BigDecimal", value); };
		void setDefaultBoolean(Boolean value) { this.put("Boolean", value); };
		void setDefaultCharacter(Character value) { this.put("Character", value); };
		void setDefaultDouble(Double value) { this.put("Double", value); };
		void setDefaultInteger(Integer value) { this.put("Integer", value); };
		void setDefaultString(String value) { this.put("String", value); };
	
		DefaultValueMap()
		{
			this.put("BigDecimal", BigDecimal.ZERO);
			this.put("BigInteger", BigInteger.ZERO);
			this.put("Boolean", false);
			this.put("Integer", 0);
			this.put("String", "++");
			this.put("Character", '+');
			this.put("Double", 0.0);
		}
	}
	
	//</editor-fold>
	
	private final AbstractRandomGeneratorFactory abstractRandomGeneratorFactory;
	private final AbstractBoardIOFactory abstractBoardIOFactory;
	private final DefaultValueMap defaultValueMap;
	
	public BoardFactoryClient()
	{
		this.abstractRandomGeneratorFactory = new AbstractRandomGeneratorFactory();
		this.abstractBoardIOFactory = new AbstractBoardIOFactory();
		this.defaultValueMap = new DefaultValueMap();
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
