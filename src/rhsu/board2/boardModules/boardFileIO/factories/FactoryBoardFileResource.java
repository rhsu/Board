package rhsu.board2.boardModules.boardFileIO.factories;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardModules.boardFileIO.AbstractBoardFileResource;
import rhsu.board2.boardModules.boardFileIO.BoardFileIO;

public class FactoryBoardFileResource implements FactoryBoardFileIOProduct
{
	private BufferedReader reader;
	private String delimiter;

	public void setBufferedReader(BufferedReader reader) { this.reader = reader; }
	public void setDelimiter(String delimiter) { this.delimiter = delimiter; }

	public FactoryBoardFileResource(BufferedReader reader, String delimiter)
	{
		this.reader = reader;
		this.delimiter = delimiter;
	}

	public FactoryBoardFileResource()
	{
		this.reader = null;
		this.delimiter = null;
	}
	
	@Override
	public BoardFileIO<BigDecimal> getBigDecimalImplementation() 
	{
		return new AbstractBoardFileResource<BigDecimal>(this.reader, this.delimiter)
		{
			@Override
			protected BigDecimal convertFromString(String string) 
			{
				BigDecimal value;
				
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
		};
	}

	@Override
	public BoardFileIO<BigInteger> getBigIntegerImplementation() 
	{
		return new AbstractBoardFileResource<BigInteger>(this.reader, this.delimiter)
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
		};
	}

	@Override
	public BoardFileIO<Boolean> getBooleanImplementation() 
	{
		return new AbstractBoardFileResource<Boolean>(this.reader, this.delimiter)
		{
			@Override
			protected Boolean convertFromString(String string) 
			{
				return Boolean.valueOf(string);
			}
		};
	}

	@Override
	public BoardFileIO<Character> getCharacterImplentation() 
	{
		return new AbstractBoardFileResource<Character>(this.reader, this.delimiter)
		{
			@Override
			protected Character convertFromString(String string)
			{
				return string.charAt(0);
			}
		};
	}

	@Override
	public BoardFileIO<Double> getDoubleImplementation() 
	{
		return new AbstractBoardFileResource<Double>(this.reader, this.delimiter)
		{
			@Override
			protected Double convertFromString(String string) 
			{
				return Double.valueOf(string);
			}
		};
	}

	@Override
	public BoardFileIO<Integer> getIntegerImplementation() 
	{
		return new AbstractBoardFileResource<Integer>(this.reader, this.delimiter)
		{
			@Override
			protected Integer convertFromString(String string) 
			{
				return Integer.valueOf(string);
			}
		};
	}

	@Override
	public BoardFileIO<String> getStringImpelementation() 
	{
		return new AbstractBoardFileResource<String>(this.reader, this.delimiter)
		{
			@Override
			protected String convertFromString(String string) 
			{
				return string;
			}
		};
	}
}
