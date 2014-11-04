package rhsu.board2.arrayBoard;

import java.util.Iterator;
import java.util.List;
import rhsu.board.Direction;
import rhsu.board2.Board2;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.boardModules.boardIO.Board2IO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public abstract class AbstractArrayBoard<T> implements Board2<T>,
	BoardInitializable<T>
{
	@Override
	public int getHorizontalSize() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getVerticalSize() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int getSize() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getDefaultValue() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object getInnerBoardRepresentation() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Board2IO<T> getBoardIO() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Matrix2<T> getMatrix() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public MobilityBoard<T> getMobilityBoard() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public RandomGenerator<T> getRandomGenerator() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardModule<T> getModule(String name) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean addModule(String name, BoardModule<T> module) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean removeModule(String name) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(int horizontal, int vertical, Direction direction, int units) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> getPieceAt(BoardPiece2<T> piece, Direction direction, int units) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(int horizontal, int vertical) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(int horizontal, int vertical, Direction direction, int units) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public T getValueAt(BoardPiece2<T> piece, Direction direction, int units) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setValueAt(int horizontal, int vertical, T value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, T value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setPieceAt(int horizontal, int vertical, BoardPiece2<T> piece) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T> find(T value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public List<BoardPiece2<T>> findAll(T value) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Iterator<BoardPiece2<T>> boardIterator() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void AddColumn(Board2<T> column) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void AddRow(Board2<T> row) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void RemoveColumn(Board2<T> column) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void RemoveRow(Board2<T> row) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public BoardPiece2<T>[][] initializeBoard(BoardPiece2<T>[][] boardArray) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	protected AbstractArrayBoard(Integer horizontalSize,
		Integer verticalSize,
		Board2IO boardIO,
		Matrix2<T> matrix,
		MobilityBoard<T> mobilityBoard,
		RandomGenerator<T> randomGenerator,
		T defaultValue,
		BoardInitializable<T> boardInitializer)
	{
		
	}	
	
}
