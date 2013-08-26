package rhsu.board.implementations.math;

import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractBoard<Integer> implements Matrix<Integer>
{
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, 0);
			}
		}
	}
	
	@SuppressWarnings({"unchecked"})
	public IntegerBoard(String filename)
	{		
		super(filename);

		for(int i = 0; i < horizontal_size; i++)
		{
			for(int j = 0; j < vertical_size; j++)
			{
				if(baseBoard.pieceAt(i,j).getType().equalsIgnoreCase("true"))
				{
					board[i][j] = new BoardPiece(i, j, 1);
				}
				else if(baseBoard.pieceAt(i, j).getType().equalsIgnoreCase("false"))
				{
					board[i][j] = new BoardPiece(i, j, 0);
				}
				else
				{
					try
					{
					board[i][j] = new BoardPiece(i, j, 
							Integer.parseInt(baseBoard.getValueAt(i, j)));
					}
					catch(NumberFormatException e)
					{
						board[i][j] = new BoardPiece(i, j,
								"ERROR");
					}
				}
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
				//Integer a = (Integer) this.getTypeAt(i, j);
				//Integer b = (Integer) m.getTypeAt(i, j);
				//result.setTypeAt(i,j, a+b);				
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
	public Integer Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}