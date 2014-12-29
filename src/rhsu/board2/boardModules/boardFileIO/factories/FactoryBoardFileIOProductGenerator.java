package rhsu.board2.boardModules.boardFileIO.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardModules.boardFileIO.BoardFileIOProductType;

public class FactoryBoardFileIOProductGenerator 
{
	private BoardFileIOProductType type;
	
	public void setType(BoardFileIOProductType type) { this.type = type; }
	
	public FactoryBoardFileIOProductGenerator() { }
	
	public FactoryBoardFileIOProductGenerator(BoardFileIOProductType type) { this.type = type; }
	
	public FactoryBoardFileIOProduct<Integer> getIntegerProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
	
	public FactoryBoardFileIOProduct<Double> getDoubleProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
	
	public FactoryBoardFileIOProduct<String> getStringProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
	
	public FactoryBoardFileIOProduct<BigDecimal> getBigDecimalProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
	
	public FactoryBoardFileIOProduct<BigInteger> getBigIntegerProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
	
	public FactoryBoardFileIOProduct<Character> getCharacterProduct()
	{
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader<>();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource<>();
		}
	}
}
