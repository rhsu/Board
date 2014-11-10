package rhsu.board2.arrayBoard.expandableBoard;

import rhsu.board2.Board2;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPieceImpl;
import rhsu.board2.arrayBoard.AbstractArrayBoard;
import rhsu.board2.boardModules.boardIO.Board2IO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public class ExpandableBoard<T> extends AbstractArrayBoard<T>
{
	//<editor-fold desc="Add And Remove Column Row Methods" defaultstate="collapsed">
	
	@Override
	public void AddColumn(Board2<T> column) 
	{
		
		
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void AddRow(Board2<T> row) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void RemoveColumn(Board2<T> column) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void RemoveRow(Board2<T> row) 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	//</editor-fold>
	
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
		
		this.expandBoard();
		this.boardArray = new BoardPieceImpl[this.verticalSize][this.horizontalSize];
	}
	
	private void expandBoard()
	{
		expandBoard(10);
	}
	
	public void expandBoard(int expansionSize)
	{
		this.horizontalSize += expansionSize;
		this.verticalSize += expansionSize;
	}
}
