package rhsu.board.arithmetic;

import rhsu.board.AbstractBoard;

/**
 *
 * @author rhsu
 */
public abstract class AbstractMatrix<T> extends AbstractBoard<T> implements Matrix<T>
{
	public AbstractMatrix(int h, int v)
	{
		super(h, v);
	}
	
	public AbstractMatrix(String filename)
	{
		super(filename);
	}
	
	protected void CheckAddDimensions(Matrix m)
	{
		if(m.getHorizontal_size() != this.getHorizontal_size() 
			|| m.getVertical_size() != this.getVertical_size())
		{		
			throw new ArrayIndexOutOfBoundsException("The dimensions do not match");
		}
	}
	
	protected void CheckMultiplyDimensions(Matrix m)
	{
		if(this.getHorizontal_size() != m.getVertical_size()
			|| this.getVertical_size() != m.getHorizontal_size())
		{
			throw new ArrayIndexOutOfBoundsException("The dimensions do not match");
		}
	}
}
