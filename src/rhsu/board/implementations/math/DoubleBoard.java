package rhsu.board.implementations.math;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rhsu.board.AbstractBoard;
import rhsu.board.BoardPiece;
import rhsu.board.IO.BoardReader;
import rhsu.board.arithmetic.Matrix;
import rhsu.board.arithmetic.MatrixPiece;
import rhsu.board.implementations.StringBoard;

/**
 *A double implementation
 */
public class DoubleBoard extends AbstractBoard<Double> implements Matrix<Double>
{
	@SuppressWarnings({"unchecked"})
	public DoubleBoard(int h, int v)
	{
		super(h, v);
		board = new BoardPiece[h][v];
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < v; j++)
			{
				board[i][j] = new BoardPiece(i, j, 0.0);
			}
		}
	}

	public DoubleBoard(String filename)
	{
		super(filename);
		
		/*try
		{
			this.doConvertFromStringBoard(BoardReader.getBoardFromFile(filename));
		}
		catch(IOException e)
		{
			this.horizontal_size = 0;
			this.vertical_size = 0;
			this.board = new BoardPiece[horizontal_size][vertical_size];
			
			for(int i = 0; i < horizontal_size; i++)
			{
				for(int j = 0; j < vertical_size; j++)
				{
					board[i][j] = new BoardPiece(i, j, 0.0);
				}
			}
		}*/
	}
	
	/*public DoubleBoard(StringBoard copy)
	{
		super(copy);
		convertFromStringBoard(copy);
	}*/
	
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
				//Double a = (Double) this.getTypeAt(i, j);
				//Double b = (Double) m.getTypeAt(i, j);
				//result.setTypeAt(i,j, a+b);				
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
	public Double Determinant() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix Multiply(MatrixPiece piece) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	private void doConvertFromStringBoard(StringBoard baseBoard)
	{
		convertFromStringBoard(baseBoard);
	}
	
	public void convertFromStringBoard(StringBoard baseBoard) 
	{
		/*this.horizontal_size = baseBoard.getHorizontal_size();
		this.vertical_size = baseBoard.getVertical_size();
		this.board = new BoardPiece[horizontal_size][vertical_size];
		
		try
		{
			for(int i = 0; i < baseBoard.getHorizontal_size(); i++)
			{
				for(int j = 0; j < baseBoard.getVertical_size(); j++)
				{
					board[i][j] = new BoardPiece(i,j,
							Double.parseDouble(baseBoard.getTypeAt(i, j)));
				}
			}
		}
		catch(NumberFormatException e)
		{
			board = null;
		}*/
	}
}
