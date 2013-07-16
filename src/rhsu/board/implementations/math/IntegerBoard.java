package rhsu.board.implementations.math;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.implementations.StringBoard;

/**
 * An integer implementation
 */
public final class IntegerBoard extends AbstractBoard<IntegerPiece> implements Matrix<IntegerPiece>
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

	public IntegerBoard(StringBoard copy)
	{
		super(copy);
		convertFromStringBoard(copy);
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
				Integer a = (Integer) this.getTypeAt(i, j);
				Integer b = (Integer) m.getTypeAt(i, j);
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

	@Override
	public Matrix Multiply(MatrixPiece piece) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void convertFromStringBoard(StringBoard baseBoard)
	{
		int h = baseBoard.getHorizontal_size();
		int v = baseBoard.getVertical_size();
		board = new IntegerPiece[h][v];
				
		try
		{
			for(int i = 0; i < h; i++)
			{
				for(int j = 0; j < v; j++)
				{
					if(baseBoard.pieceAt(i,j).getType().equalsIgnoreCase("true"))
					{
						board[i][j] = new IntegerPiece(i, j, 1);
					}
					else if(baseBoard.pieceAt(i, j).getType().equalsIgnoreCase("false"))
					{
						board[i][j] = new IntegerPiece(i, j, 0);
					}
					else
					{
						board[i][j] = new IntegerPiece(i, j, 
								Integer.parseInt(baseBoard.pieceAt(i, j).getType()));
					}
				}
			}
		}
		catch(NumberFormatException e)
		{
			board = null;
		}
	}
}