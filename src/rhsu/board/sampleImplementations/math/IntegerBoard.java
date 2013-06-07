package rhsu.board.sampleImplementations.math;

import rhsu.board.AbstractBoard;
import rhsu.board.arithmetic.Matrix;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractBoard<IntegerPiece> implements Matrix<IntegerPiece>
{
	public IntegerBoard(int h, int v)
	{
		super(h, v);
		board = new IntegerPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new IntegerPiece(i, j, 0);
			}
		}
	}

	@Override
	public Matrix Add(Matrix m) 
	{
		IntegerBoard other = (IntegerBoard)m;
		//1 check dimensions
		
		//2 create a new Matrix of IntegerPieces.
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		IntegerBoard result =  new IntegerBoard(h,v);
		
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				//int a = other.pieceAt(i, j).getType();
				Integer a = (Integer) other.getTypeAt(i, j);
				//int b = this.pieceAt(i, j).getType();
				Integer b = (Integer) other.getTypeAt(i, j);
				//result.pieceAt(i, j).setType(a + b);
				result.setTypeAt(i,j, a+b);				
			}
		}
		
		return result;
	}

	@Override
	public Matrix Subtract(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Matrix Multiply(Matrix m) 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public Matrix Inverse() 
	{
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public IntegerPiece Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}