package rhsu.board2.boardReaders;

public class DoubleBoardIO extends AbstractBoardIO<Double>
{
	public DoubleBoardIO(String filename)
	{
		super(filename);
	}
	
	@Override
	protected Double convertFromString(String string)
	{
		return Double.valueOf(string);
	}	
}
