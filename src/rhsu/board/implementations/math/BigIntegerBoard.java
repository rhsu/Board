package rhsu.board.implementations.math;

import java.math.BigInteger;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.HandleType;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractMatrix<BigInteger>
{
	/**
	 * Constructor to create a BigIntegerBoard with the given parameters
	 * @param h the horizontal size 
	 * @param v the vertical size
	 */
	public BigIntegerBoard(int h, int v)
	{
		this(h, v, BigInteger.ZERO);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(int h, int v, BigInteger defaultValue)
	{
		super(h, v, defaultValue);
	}
	
	/**
	 * Constructor to create a BigIntegerBoard based off of a file 
	 * @param filename the name of the file to create a BigIntegerBoard from
	 */
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(String filename)
	{
		this(filename, HandleType.RuntimeError, null);
	}
		
	public BigIntegerBoard(String filename, BigInteger defaultValue)
	{
		this(filename, HandleType.Ignore, defaultValue);
	}
	
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(String filename, HandleType handleType, BigInteger defaultValue)
	{
		super(filename);
		
		BigInteger value = null;
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					value = new BigInteger(baseBoard.getValueAt(i,j));
				}
				catch(Exception exception)
				{
					value = handler.AssignDefault(exception, handleType, defaultValue);
				}
				finally
				{
					board[i][j] = new BoardPiece(i, j, value);
				}
			}
		}
	}
	
	@Override
	public BigIntegerBoard add(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.ADD, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getValueAt(i, j);
				BigInteger b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.add(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard subtract(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.SUBTRACT, m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		BigIntegerBoard result =  new BigIntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = this.getValueAt(i, j);
				BigInteger b = m.getValueAt(i, j);		
				result.setValueAt(i, j, a.subtract(b));
			}
		}
		
		return result;
	}

	@Override
	public BigIntegerBoard multiply(Matrix<BigInteger> m) 
	{
		CheckDimensions(AbstractMatrix.OperationType.MULTIPLY, m);
		
		int h = this.getHorizontal_size();
		int v = m.getVertical_size();
		
		BigIntegerBoard result = new BigIntegerBoard(h, v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger sum = BigInteger.ZERO;
				
				for(int k = 0; k < this.getVertical_size(); k++)
				{
					BigInteger tempValue = this.getValueAt(i, k).multiply(m.getValueAt(k, j));
					sum = sum.add(result.getValueAt(i, j))
							.add(tempValue);
				}
				
				result.setValueAt(i, j, sum);
			}
		}
		return result;
	}

	@Override
	public BigIntegerBoard multiply(BigInteger scalar) 
	{
		BigIntegerBoard result = new BigIntegerBoard(this.horizontal_size,
				this.vertical_size);
		
		for(int h = 0; h < this.horizontal_size; h++)
		{
			for(int v = 0; v < this.vertical_size; v++)
			{
				BigInteger m = this.getValueAt(h, v);
				result.setValueAt(h, v, m.multiply(scalar));
			}
		}
		
		return result;
	}
	
	@Override
	public BigIntegerBoard inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigInteger determinant() 
	{
		CheckDimensions(AbstractMatrix.OperationType.DETERMINANT);
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	
	@Override
	public BigIntegerBoard transpose()
	{
		int h = this.horizontal_size;
		int v = this.vertical_size;
		BigIntegerBoard result = new BigIntegerBoard(v, h);
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				result.setValueAt(j, i, this.getValueAt(i, j));
			}
		}
		return result;
	}
	
	private BigIntegerBoard createSubMatrix(BigIntegerBoard matrix, 
			int excluding_row, int excluding_column)
	{
		BigIntegerBoard mat = new BigIntegerBoard(this.horizontal_size-1,
				this.vertical_size-1);
	
		int r = -1;
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			if(i == excluding_row) continue;
			r++;
			
			int c = -1;
			
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(j == excluding_column) continue;
				
				mat.setValueAt(r, c, matrix.getValueAt(i,j));
			}
		}
		
		return mat;
	}
}
