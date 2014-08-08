package rhsu.board2.boardReaders;

import java.math.BigDecimal;

public class BigDecimalBoardReader extends AbstractBoardReader<BigDecimal>
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
			value = BigDecimal.ZERO;
		}

		return value;
	}
}