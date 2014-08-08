package rhsu.board2.boardReaders;

public class DoubleBoardReader extends AbstractBoardReader<Double>
{
	@Override
	protected Double convertFromString(String string)
	{
		return Double.valueOf(string);
	}	
}
