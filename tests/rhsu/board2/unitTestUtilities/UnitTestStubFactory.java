package rhsu.board2.unitTestUtilities;

import java.io.BufferedReader;
import java.util.UUID;
import rhsu.board.Direction;
import rhsu.board2.BoardInitializable;
import rhsu.board2.BoardPiece2;
import rhsu.board2.Board2;
import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.boardModules.boardIO.Board2IO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public class UnitTestStubFactory<T>
{
	private final Board2IO<T> boardIO;
	private final Matrix2<T> matrix;
	private final RandomGenerator<T> randomGenerator;
	private final MobilityBoard<T> mobilityBoard;
	private final BoardInitializable<T> boardInitializable;
	private final BoardModule<T> boardModule;
	
	public UnitTestStubFactory()
	{
		this.boardIO = initializeBoard2IO();
		this.matrix = initializeMatrix();
		this.randomGenerator = initializeRandomGenerator();
		this.mobilityBoard = initializeMobilityBoard();
		this.boardInitializable = initializeBoardInitializable();
		this.boardModule = initializeBoardModule();
	}
	
	private Board2IO<T> initializeBoard2IO()
	{
		return new Board2IO<T>() 
		{
			@Override
			public Board2<String> getBoardInitializer()
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
			public void export(String filename, String delimiter)
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public Board2<T> getParent() {
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public void setParent(Board2<T> parent) {
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}
		};
	}
	
	private Matrix2<T> initializeMatrix()
	{
		return new Matrix2<T>()
		{
				@Override
				public Board2<T> add(Board2<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> subtract(Board2<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> multiply(Board2<T> matrix)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> multiply(T piece)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> inverse()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public T determinant()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> transpose()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> createSubMatrix(int excluding_row, int excluding_column)
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> cofactor()
				{
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public Board2<T> getParent() {
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}

				@Override
				public void setParent(Board2<T> parent) {
					throw new UnsupportedOperationException("Stub Method: Not Implemented");
				}
			};
	}
	
	private RandomGenerator<T> initializeRandomGenerator()
	{
		return new RandomGenerator<T>()
		{

			@Override
			public T getRandom()
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public Board2<T> getParent() {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public void setParent(Board2<T> parent) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}


		};
	}
	
	private MobilityBoard<T> initializeMobilityBoard()
	{
		return new MobilityBoard<T>()
		{
			@Override
			public boolean move(BoardPiece2<T> piece, int horizontal, int vertical)
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public boolean move(BoardPiece2<T> piece, int horizontal, int vertical, Board2<T> otherBoard)
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public boolean move(BoardPiece2<T> piece, int units, Direction direction)
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public boolean move(BoardPiece2<T> piece, int units, Direction direction, Board2<T> otherBoard)
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented"); 
			}

			@Override
			public UUID getUUID()
			{
				throw new UnsupportedOperationException("Stub Method: Not Implemented"); 
			}

			@Override
			public Board2<T> getParent() {
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}

			@Override
			public void setParent(Board2<T> parent) {
				throw new UnsupportedOperationException("Stub Method: Not Implemented");
			}
		};
	}
	
	private BoardInitializable<T> initializeBoardInitializable()
	{
		return new BoardInitializable<T>()
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
	
	private BoardModule<T> initializeBoardModule()
	{
		return new BoardModule<T>()
		{
			private Board2<T> parent;
			
			@Override
			public Board2<T> getParent() 
			{
				return this.parent;
			}

			@Override
			public void setParent(Board2<T> parent) 
			{
				this.parent = parent;
			}
		};
	}
	
	public Board2IO<T> getBoard2IOStub()
	{
		return boardIO;
	}
	
	public Matrix2<T> getMatrix2Stub()
	{
		return matrix;
	}
	
	public RandomGenerator<T> getRandomGeneratorStub()
	{
		return randomGenerator;
	}
	
	public MobilityBoard<T> getMobilityBoardStub()
	{
		return mobilityBoard;
	}
	
	public BoardInitializable<T> getBoardInitializable()
	{
		return boardInitializable;
	}
		
	public BoardModule<T> getBoardModuleStub()
	{
		return boardModule;
	}
}
