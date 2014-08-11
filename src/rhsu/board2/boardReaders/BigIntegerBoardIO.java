package rhsu.board2.boardReaders;

import java.math.BigInteger;

public class BigIntegerBoardIO extends AbstractBoardIO<BigInteger>
{

	public BigIntegerBoardIO(String filename)
	{
		super(filename);
	}

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
	
}
