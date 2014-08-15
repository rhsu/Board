package rhsu.board2.boardIO;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AbstracBoardIOFactory
{
	public AbstractBoardIO<BigDecimal> getBigDecimalBoardIO()
	{		
		return new AbstractBoardIO<BigDecimal>()
		{
			BigDecimal value;
			
			@Override
			protected BigDecimal convertFromString(String string)
			{
				try
				{
					value = new BigDecimal(string);
				}
				catch (Exception exception)
				{
					value = BigDecimal.ZERO;
				}

				return value;
			}
		};
	}
	
	public AbstractBoardIO<BigInteger> getBigIntegerBoardIO()
	{
		return new AbstractBoardIO<BigInteger>()
		{
			@Override
			protected BigInteger convertFromString(String string)
			{
				BigInteger value;

				try
				{
					value = new BigInteger(string);
				}
				catch(Exception exception)
				{
					value = BigInteger.ZERO;
				}

				return value;
			}
		};
	}
	
	public AbstractBoardIO<Boolean> getBooleanBoardIO()
	{
		
	}
	
	public AbstractBoardIO<Character> getCharacterBoardIO()
	{
		
	}
	
	public AbstractBoardIO<Double> getDoubleBoardIO()
	{
		
	}
	
	public AbstractBoardIO<Integer> getIntegerBoardIO()
	{
		
	}
	
	public AbstractBoardIO<String> getStringBoardIO()
	{
		
	}
}
