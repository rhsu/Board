package rhsu.board.implementations.math;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;

/**
 *A double implementation
 */
public class DoubleBoard extends AbstractBoard<DoublePiece> implements Matrix<DoublePiece>
{
	public DoubleBoard(int h, int v)
	{
		super(h, v);
		board = new DoublePiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new DoublePiece(i, j, 0.0);
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
				Double a = (Double) this.getTypeAt(i, j);
				Double b = (Double) m.getTypeAt(i, j);
				result.setTypeAt(i,j, a+b);				
			}
		}
		
		return result;
	}

	@Override
	public Matrix Subtract(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(Matrix m) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Inverse() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public DoublePiece Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
