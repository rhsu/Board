package rhsu.board2.implementations;

import rhsu.board2.BoardImpl;
import rhsu.board2.BoardPieceImpl;

public class DoubleBoard2 extends BoardImpl<Double>
{
	static final double DEFAULT_VALUE = 0.0;
	
	public DoubleBoard2(int horizontalSize, int verticalSize, Double defaultValue)
	{
		super(horizontalSize, verticalSize, defaultValue);
	}
	
	public DoubleBoard2(int horizontalSize, int verticalSize)
	{
		this(horizontalSize, verticalSize, DEFAULT_VALUE);
	}
	
	@Override
	public boolean equals(Object aInstance)
	{
		if (this == aInstance) return true;
		if ( !(aInstance instanceof BoardImpl ) ) return false; 
		
		BoardImpl instance = (BoardImpl) aInstance;
		
		Object test = instance.getBoardArray()[0][0].getValue();
		
		if (!(test instanceof Double)) return false;
		
		return
			instance.getHorizontalSize() == this.getHorizontalSize() &&
			instance.getVerticalSize() == this.getVerticalSize() &&
			EqualHelper((BoardPieceImpl<Double>[][]) instance.getBoardArray());
	}
	
	private boolean EqualHelper(BoardPieceImpl<Double>[][] otherBoardArray)
	{	
		for (int i = 0; i < this.getVerticalSize(); i++)
		{
			for (int j = 0; j < this.getHorizontalSize(); j++)
			{	
				Double otherValue = otherBoardArray[i][j].getValue();
				Double thisValue = this.getBoardArray()[i][j].getValue();
				
				if (otherValue.compareTo(thisValue) != 0)
				{
					return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
