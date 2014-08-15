package rhsu.board2.boardIO;

public class DoubleBoardIO extends AbstractBoardIO<Double>
{
	@Override
	protected Double convertFromString(String string)
	{
		return Double.valueOf(string);
	}	
}
