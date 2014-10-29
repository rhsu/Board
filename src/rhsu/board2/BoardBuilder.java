package rhsu.board2;

import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;

public interface BoardBuilder<T>
{
	public BasicBoardBuilder<T> setBoardIO(Board2IO<T> boardIO);
	public BasicBoardBuilder<T> setMatrix(Matrix2<T> matrix);
	public BasicBoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator);
	public BasicBoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard);
	public BasicBoardBuilder<T> setHorizontalSize(int horizontalSize);	
	public BasicBoardBuilder<T> setVerticalSize(int verticalSize);
	public BasicBoardBuilder<T> setDefaulValue(T defaultValue);
	public BasicBoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer);
	public Board2<T> createBoard();
}
