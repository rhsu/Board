package rhsu.board.arithmetic;

import rhsu.board.AbstractBoard;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *
 * @author rhsu
 */
public abstract class AbstractMatrix<T> extends AbstractBoard<T> implements Matrix<T>
{
	protected enum OperationType
	{
		ADD,
		SUBTRACT,
		MULTIPLY,
		DETERMINANT,
		INVERSE
	}
	
	protected ExceptionHandler<T> handler;
		
	public AbstractMatrix(int h, int v, T defaultValue)
	{
		super(h, v, defaultValue);
	}
			
	public AbstractMatrix(String filename)
	{
		super(filename);
		handler = new ExceptionHandler<>();
	}
	
	protected void CheckDimensions(OperationType type)
	{
		CheckDimensions(type, null);
	}
	
	protected void CheckDimensions(OperationType type, Matrix<T> otherMatrix)
	{
		switch(type)
		{
			case ADD:
			case SUBTRACT:
				if(otherMatrix.getHorizontal_size() != this.getHorizontal_size()
					|| otherMatrix.getVertical_size() != this.getVertical_size())
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do no match");
				}
				break;
			case MULTIPLY:
				if(this.getHorizontal_size() != otherMatrix.getVertical_size()
					|| this.getVertical_size() != otherMatrix.getHorizontal_size())
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do no match");
				}
				break;
			case DETERMINANT:
			case INVERSE:
				if(this.getVertical_size() != this.getHorizontal_size())
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do not match");
				}
				break;
		}
	}
}
