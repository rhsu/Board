package rhsu.board.implementations.math;

import java.math.BigDecimal;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.HandleType;

/**
 *A big decimal implementation
 */
public class BigDecimalBoard extends AbstractMatrix<BigDecimal>
{	
	/**
	 * Constructor to create a BigDecimalBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BigDecimalBoard(int h, int v)
	{
		this(h, v, BigDecimal.ZERO);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(int h, int v, BigDecimal defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	 * Constructor to create a BigDecimalBoard based off of a file 
	 * @param filename the name of the file to create a BigDecimalBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, null);
	}
	
	public BigDecimalBoard(String filename, BigDecimal defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigDecimalBoard(String filename, HandleType handletype, BigDecimal defaultValue)
	{
		super(filename);
		
		BigDecimal value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					value = new BigDecimal(baseBoard.getValueAt(i, j));
				}
				catch(Exception exception)
				{					
					value = handler.AssignDefault(exception, handletype, defaultValue);
				}
				finally
				{
					board[i][j] = new BoardPiece(i, j, value);
				}
			}
		}
	}
	
	@Override
	public BigDecimalBoard add(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getValueAt(i, j);
				BigDecimal b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard subtract(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.SUBTRACT, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigDecimalBoard result =  new BigDecimalBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal a = this.getValueAt(i, j);
				BigDecimal b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard multiply(Matrix<BigDecimal> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		BigDecimalBoard result = new BigDecimalBoard(h, v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigDecimal sum = BigDecimal.ZERO;
				
				for(int k = 0; k < this.getVertical_size(); k++)
				{
					BigDecimal tempValue = this.getValueAt(i, k).multiply(m.getValueAt(k, j));
					sum = sum.add(result.getValueAt(i, j))
							.add(tempValue);
				}
				
				result.setValueAt(i, j, sum);
			}
		}
		
		return result;
	}

	@Override
	public BigDecimalBoard multiply(BigDecimal scalar) 
	{
		BigDecimalBoard result = new BigDecimalBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigDecimal m = this.getValueAt(h, v);
				this.setValueAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigDecimalBoard inverse() 
	{
		CheckDimensions(AbstractMatrix.OperationType.SQUAREMATRIX);
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigDecimal determinant() 
	{
		CheckDimensions(AbstractMatrix.OperationType.SQUAREMATRIX);
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public BigDecimalBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		BigDecimalBoard result = new BigDecimalBoard(v, h);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				result.setValueAt(j, i, this.getValueAt(i, j));
			}
		}
		return result;
	}
}
