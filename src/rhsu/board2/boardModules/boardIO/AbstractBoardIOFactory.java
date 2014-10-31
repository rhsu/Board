package rhsu.board2.boardModules.boardIO;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AbstractBoardIOFactory
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
		return new AbstractBoardIO<Boolean>()
		{
			@Override
			protected Boolean convertFromString(String string)
			{
				return Boolean.valueOf(string);
			}
		};
	}
	
	public AbstractBoardIO<Character> getCharacterBoardIO()
	{
		return new AbstractBoardIO<Character>()
		{
			@Override
			protected Character convertFromString(String string)
			{
				return string.charAt(0);
			}	
		};
	}
	
	public AbstractBoardIO<Double> getDoubleBoardIO()
	{
		return new AbstractBoardIO<Double>()
		{
			@Override
			protected Double convertFromString(String string)
			{
				return Double.valueOf(string);
			}
		};
	}
	
	public AbstractBoardIO<Integer> getIntegerBoardIO()
	{
		return new AbstractBoardIO<Integer>()
		{
			@Override
			protected Integer convertFromString(String string)
			{
				return Integer.valueOf(string);
			}
		};
	}
	
	public AbstractBoardIO<String> getStringBoardIO()
	{
		return new AbstractBoardIO<String>()
		{
			@Override
			protected String convertFromString(String string)
			{
				return string;
			}
		};
	}
}
