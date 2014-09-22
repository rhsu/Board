package rhsu.board2.unitTestUtilities;

import java.io.BufferedReader;
import java.util.UUID;
import rhsu.board.Direction;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.CompositeBoard;
import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;

public class UnitTestStubFactory<T>
{
	private Board2IO<T> boardIO = null;
	private Matrix2<T> matrix = null;
	private RandomGenerator<T> randomGenerator = null;
	private MobilityBoard<T> mobilityBoard = null;
	private BoardInitializable<T> boardInitializable = null;
	
	public Board2IO<T> getBoard2IOStub()
	{
		if (boardIO == null)
		{
			boardIO = new Board2IO<T>() 
			{
				@Override
				public CompositeBoard<String> getBoardInitializer()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public void populateFromFile(String filename, String delimiter)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public void populateFromResource(BufferedReader reader, String delimiter)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public void export(String filename, char delimiter)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}
			};
		}
		return boardIO;
	}
	
	public Matrix2<T> getMatrix2Stub()
	{
		if (matrix == null)
		{
			matrix = new Matrix2<T>()
			{
				@Override
				public CompositeBoard<T> add(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> subtract(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> multiply(CompositeBoard<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> multiply(T piece)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> inverse()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public T determinant()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> transpose()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> createSubMatrix(int excluding_row, int excluding_column)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public CompositeBoard<T> cofactor()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}
			};
		}
		return matrix;
	}
	
	public RandomGenerator<T> getRandomGeneratorStub()
	{
		if (randomGenerator == null)
		{
			randomGenerator = new RandomGenerator<T>()
			{

				@Override
				public T getRandom()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}
			};
		}
		return randomGenerator;
	}
	
	public MobilityBoard<T> getMobilityBoardStub()
	{
		if (mobilityBoard == null)
		{
			mobilityBoard = new MobilityBoard<T>()
			{
				@Override
				public boolean move(BoardPiece2<T> piece, int horizontal, int vertical)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public boolean move(BoardPiece2<T> piece, int horizontal, int vertical, CompositeBoard<T> otherBoard)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public boolean move(BoardPiece2<T> piece, int units, Direction direction)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public boolean move(BoardPiece2<T> piece, int units, Direction direction, CompositeBoard<T> otherBoard)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented"); 
				}

				@Override
				public UUID getUUID()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented"); 
				}
			};
		}
		return mobilityBoard;
	}
	
	public BoardInitializable<T> getBoardInitializable()
	{
		if (boardInitializable == null)
		{
			boardInitializable = new BoardInitializable<T>()
			{
				@Override
				public BoardPiece2<T>[][] initializeBoard(BoardPiece2<T>[][] boardArray)
				{
					throw new UnsupportedOperationException("Stub Method. Not Implemented.");
				}

				@Override
				public int getHorizontalSize()
				{
					throw new UnsupportedOperationException("Stub Method. Not Implemented."); 
				}

				@Override
				public int getVerticalSize()
				{
					throw new UnsupportedOperationException("Stub Method. Not Implemented."); 
				}
			};
		}
		return boardInitializable;
	}
}
