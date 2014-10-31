package rhsu.board2.expandableBoard;

import java.util.Iterator;
import java.util.List;
import rhsu.board.Direction;
import rhsu.board2.AbstractBoard;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardModule;
import rhsu.board2.BoardPiece2;
import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;

public class ExpandableBoard<T> extends AbstractBoard<T>
{
	@Override
	public BoardPiece2<T>[][] getInnerBoardRepresentation() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical, Direction direction, int units) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(BoardPiece2<T> piece, Direction direction, int units) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(int horizontal, int vertical) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(BoardPiece2<T> piece, Direction direction, int units) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setValueAt(int horizontal, int vertical, T value) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, T value) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, BoardPiece2<T> piece) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> find(T value) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<BoardPiece2<T>> findAll(T value) 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Iterator<BoardPiece2<T>> boardIterator() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	ExpandableBoard(Integer horizontalSize,
		Integer verticalSize,
		Board2IO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomGenerator,
		T defaultValue,
		BoardInitializable<T> boardInitializer)
	{
		super(horizontalSize,
			verticalSize,
			boardIO,
			matrix,
			mobilityBoard,
			randomGenerator,
			defaultValue,
			boardInitializer);
	}	

	@Override
	public List<BoardModule<T>> getBoardModules() 
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
