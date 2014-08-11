package rhsu.board2.boardReaders;

public class DoubleBoardIO extends AbstractBoardIO<Double>
{
	@Override
	protected Double convertFromString(String string)
	{
		return Double.valueOf(string);
	}	
}
