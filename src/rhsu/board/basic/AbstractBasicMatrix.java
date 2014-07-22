package rhsu.board.basic;

import java.io.BufferedReader;
import rhsu.board.Matrix;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.exceptionHandler.HandleType;

/**
 *
 * @author rhsu
 */
public abstract class AbstractBasicMatrix<T> 
	extends AbstractBasicBoard<T> implements Matrix<T>
{

	public enum OperationType
	{
		ADD,
		SUBTRACT,
		MULTIPLY,
		SQUAREMATRIX
	}
	
	//<editor-fold desc="Properties" defaultstate="collapsed">

	protected ExceptionHandler<T> handler;
	protected HandleType handleType;
	protected T defaultValue;
	
	//</editor-fold>
	
	public AbstractBasicMatrix(int horizontal, int vertical, T defaultValue)
	{
		super(horizontal, vertical, defaultValue);
	}
			
	public AbstractBasicMatrix(String filename)
	{
		super(filename);
		handler = new ExceptionHandler<>();
	}
	
	public AbstractBasicMatrix(BufferedReader bufferedReader)
	{
		super(bufferedReader);		
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
			case SQUAREMATRIX:
				if(this.getVertical_size() != this.getHorizontal_size())
				{
					throw new ArrayIndexOutOfBoundsException("The dimensions do not match");
				}
				break;
		}
	}
}
