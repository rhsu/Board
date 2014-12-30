package rhsu.board2.boardModules.boardFileIO;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AbstractBoardIOFactory_OLD
{
	public AbstractBoardFileIO<BigDecimal> getBigDecimalBoardIO()
	{		
		return new AbstractBoardFileIO<BigDecimal>()
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
					value = this.getParent().getDefaultValue();
				}

				return value;
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<BigInteger> getBigIntegerBoardIO()
	{
		return new AbstractBoardFileIO<BigInteger>()
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
					value = this.getParent().getDefaultValue();
				}

				return value;
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<Boolean> getBooleanBoardIO()
	{
		return new AbstractBoardFileIO<Boolean>()
		{
			@Override
			protected Boolean convertFromString(String string)
			{
				return Boolean.valueOf(string);
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<Character> getCharacterBoardIO()
	{
		return new AbstractBoardFileIO<Character>()
		{
			@Override
			protected Character convertFromString(String string)
			{
				return string.charAt(0);
			}	

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<Double> getDoubleBoardIO()
	{
		return new AbstractBoardFileIO<Double>()
		{
			@Override
			protected Double convertFromString(String string)
			{
				return Double.valueOf(string);
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<Integer> getIntegerBoardIO()
	{
		return new AbstractBoardFileIO<Integer>()
		{
			@Override
			protected Integer convertFromString(String string)
			{
				return Integer.valueOf(string);
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
	
	public AbstractBoardFileIO<String> getStringBoardIO()
	{
		return new AbstractBoardFileIO<String>()
		{
			@Override
			protected String convertFromString(String string)
			{
				return string;
			}

			@Override
			public void populate() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};
	}
}
