package rhsu.board2.matrices;

import rhsu.board.basic.AbstractBasicMatrix.OperationType;
import rhsu.board2.AbstractBoardModule;
import rhsu.board2.CompositeBoard;

public abstract class AbstractMatrix2<T> extends AbstractBoardModule<T>
	implements Matrix2<T>
{
	protected int horizontalSize;
	protected int verticalSize;
	
	public AbstractMatrix2(CompositeBoard<T> parent)
	{
		this.parent = parent;
		this.horizontalSize = parent.getHorizontalSize();
		this.verticalSize = parent.getVerticalSize();
	}
	
	protected void CheckDimensions(OperationType type)
	{
		CheckDimensions(type, null);
	}
	
	protected void CheckDimensions(OperationType type, CompositeBoard<T> otherMatrix)
	{
		switch(type)
		{
			case ADD:
			case SUBTRACT:
				if (otherMatrix.getHorizontalSize() != this.horizontalSize
					|| otherMatrix.getVerticalSize() != this.verticalSize)
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do no match");
				}
				break;
			case MULTIPLY:
				if (this.horizontalSize != otherMatrix.getVerticalSize()
					|| this.verticalSize != otherMatrix.getHorizontalSize())
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do no match");
				}
				break;
			case SQUAREMATRIX:
				if (this.verticalSize != this.verticalSize)
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do not match");
				}
				break;
		}
	}
}
