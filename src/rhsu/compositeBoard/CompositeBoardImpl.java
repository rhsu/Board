package rhsu.compositeBoard;

import rhsu.board.Direction;
import rhsu.board.io.BoardIO;
import rhsu.board2.BoardPiece2;
import rhsu.board2.random.RandomBoard;

public class CompositeBoardImpl<T> implements CompositeBoard<T>
{
	private final BoardIO boardIO;
	private final Matrix<T>matrix;
	private final MobilityBoard<T> mobilityBoard;
	private final RandomBoard<T> randomBoard;
	private final int horizontalSize;
	private final int verticalSize;
	
	@Override
	public BoardIO getBoardIO() { return this.boardIO; }

	@Override
	public Matrix<T> getMatrix() { return this.matrix; }

	@Override
	public MobilityBoard<T> getMobilityBoard()	{ return this.mobilityBoard; }

	@Override
	public RandomBoard<T> getRandomBoard() { return this.randomBoard; }
		
	public CompositeBoardImpl(
		Integer horizontalSize,
		Integer verticalSize,
		BoardIO boardIO,
		Matrix<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomBoard<T> randomBoard)
	{
		this.horizontalSize = horizontalSize;
		this.verticalSize = verticalSize;
		this.boardIO = boardIO;
		this.matrix = matrix;
		this.mobilityBoard = mobilityBoard;
		this.randomBoard = randomBoard;
	}

	@Override
	public int getHorizontalSize()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
	}

	@Override
	public int getVerticalSize()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public int getSize()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public T getDefaultValue()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public BoardPiece2<T>[][] getBoardArray()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical, Direction direction, int units)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public BoardPiece2<T> getPieceAt(BoardPiece2<T> piece, Direction direction, int units)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public T getValueAt(int horizontal, int vertical)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public T getValueAt(BoardPiece2<T> piece, Direction direction, int units)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public void setValueAt(int horizontal, int vertical, T value)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, T value)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, BoardPiece2<T> piece)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Template
	}
}
