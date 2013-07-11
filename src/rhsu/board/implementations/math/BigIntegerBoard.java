package rhsu.board.implementations.math;

import rhsu.board.AbstractBoard;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;

/**
 *A big integer implementation
 */
public class BigIntegerBoard extends AbstractBoard<BigIntegerPiece> implements Matrix<BigIntegerPiece>
{
	public BigIntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BigIntegerPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BigIntegerPiece(i, j, BigInteger.ZERO);
			}
		}
	}

	@Override
	public Matrix Add(Matrix m) 
	{
		if(m.getHorizontal_size() != this.getHorizontal_size() 
			|| m.getVertical_size() != this.getVertical_size())
		{
			try 
			{			
				throw new Exception("Invalid Dimensions");
			} 
			catch (Exception ex) 
			{
				Logger.getLogger(IntegerBoard.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		IntegerBoard result =  new IntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				BigInteger a = (BigInteger) this.getTypeAt(i, j);
				BigInteger b = (BigInteger) m.getTypeAt(i, j);
				result.setTypeAt(i,j, a.add(b));				
			}
		}
		
		return result;
	}

	@Override
	public Matrix Subtract(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BigIntegerPiece Determinant() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
