package rhsu.board.implementations.math;

import java.math.BigInteger;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.exceptionHandler.ExceptionHandler;
import rhsu.board.implementations.StringBoard;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractMatrix<BigInteger>
{
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, BigInteger.ZERO);
			}
		}
	}
	
	@SuppressWarnings({"unchecked"})
	public BigIntegerBoard(String filename)
	{
		super(filename);
		
		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				try
				{
					board[i][j] = new BoardPiece(i, j, 
							new BigInteger(baseBoard.getValueAt(i, j)));
				}
				catch(Exception exception)
				{
					ExceptionHandler.Handle(exception);
				}
			}
		}
	}

	@Override
	public BigIntegerBoard Add(Matrix<BigInteger> m) 
	{
		CheckAddDimensions(m);
				
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
	public BigIntegerBoard Subtract(Matrix<BigInteger> m) 
	{
		CheckAddDimensions(m);
				
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
	public BigIntegerBoard Multiply(Matrix<BigInteger> m) 
	{
		CheckMultiplyDimensions(m);
		
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
	public BigIntegerBoard Multiply(BigInteger scalar) 
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
	public BigIntegerBoard Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public BigInteger Determinant() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		/*Board<BigIntegerPiece> result = new BigIntegerBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					//int i = Integer.parseInt(baseBoard.pieceAt(h,v).getType());
					result.pieceAt(h, v).setType(
							new BigInteger(baseBoard.pieceAt(h,v).getType()));
				}
			}
			//return result;
		}
		catch(NumberFormatException e)
		{
			//return null;
		}*/
	}
}
