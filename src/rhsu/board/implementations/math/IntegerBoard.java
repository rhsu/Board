package rhsu.board.implementations.math;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.Board;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.implementations.StringBoard;

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
	public Board<IntegerPiece> ConvertFromStringBoard(StringBoard baseBoard) 
	{
		Board<IntegerPiece> result = new IntegerBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					if(baseBoard.pieceAt(h,v).getType().equalsIgnoreCase("true"))
					{
						result.pieceAt(h, v).setType(1);
					}
					else if(baseBoard.pieceAt(h, v).getType().equalsIgnoreCase("false"))
					{
						result.pieceAt(h, v).setType(0);
					}
					else
					{
						result.pieceAt(h, v).setType(Integer.parseInt(baseBoard.pieceAt(h,v).getType()));
					}
				}
			}
			return result;
		}
		catch(NumberFormatException e)
		{
			return null;
		}
	}
	
	//public Board<IntegerPiece> ConvertFromStringBoard2(StringBoard baseBoard) 
	public void ConvertFromStringBoard2(StringBoard baseBoard)
	{
		Board<IntegerPiece> result = new IntegerBoard(baseBoard.getHorizontal_size(), baseBoard.getVertical_size());
		
		try
		{
			for(int h = 0; h < baseBoard.getHorizontal_size(); h++)
			{
				for(int v = 0; v < baseBoard.getVertical_size(); v++)
				{
					if(baseBoard.pieceAt(h,v).getType().equalsIgnoreCase("true"))
					{
						result.pieceAt(h, v).setType(1);
					}
					else if(baseBoard.pieceAt(h, v).getType().equalsIgnoreCase("false"))
					{
						result.pieceAt(h, v).setType(0);
					}
					else
					{
						result.pieceAt(h, v).setType(Integer.parseInt(baseBoard.pieceAt(h,v).getType()));
					}
				}
			}
			this = (IntegerBoard) result;
		}
		catch(NumberFormatException e)
		{
			//this = null;
		}
	}
}