package rhsu.board.implementations.math;

import rhsu.board.BoardPiece;
import rhsu.board.arithmetic.AbstractMatrix;
import rhsu.board.arithmetic.Matrix;

/**
 * An integer implementation
 */
public class IntegerBoard extends AbstractMatrix<Integer>
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
							Integer.parseInt(baseBoard.getTypeAt(i, j)));
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
	public Matrix Add(Matrix<Integer> m) 
	{	
		CheckDimensions(m);
				
		int h = m.getHorizontal_size();
		int v = m.getVertical_size();
		IntegerBoard result =  new IntegerBoard(h,v);
		
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				Integer a = this.getTypeAt(i, j);
				Integer b = m.getTypeAt(i, j);		
				result.setTypeAt(i, j, a+b);
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
	public Matrix Multiply(Integer piece) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}