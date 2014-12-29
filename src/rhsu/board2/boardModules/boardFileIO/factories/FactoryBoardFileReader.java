package rhsu.board2.boardModules.boardFileIO.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardModules.boardFileIO.AbstractBoardFileReader;
import rhsu.board2.boardModules.boardFileIO.BoardFileIO;

public class FactoryBoardFileReader implements FactoryBoardFileIOProduct
{
	private String filename;
	private String delimiter;
	
	public void setFilename(String filename) { this.filename = filename; }
	public void setDelimiter(String delimiter) { this.delimiter = delimiter; }
	
	public FactoryBoardFileReader(String filename, String delimiter)
	{
		this.filename = filename;
		this.delimiter = delimiter;
	}
	
	public FactoryBoardFileReader() 
	{
		this.filename = null;
		this.delimiter = null;
	}
	
	@Override
	public BoardFileIO<BigDecimal> getBigDecimalImplementation() 
	{
		return new AbstractBoardFileReader<BigDecimal>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<BigInteger>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<Boolean>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<Character>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<Double>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<Integer>(this.filename, this.delimiter)
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
		return new AbstractBoardFileReader<String>(this.filename, this.delimiter)
		{
			@Override
			protected String convertFromString(String string) 
			{
				return string;
			}
		};
	}
}
