package rhsu.board2;

import rhsu.board2.boardIO.Board2IO;
import rhsu.board2.matrices.Matrix2;
import rhsu.board2.mobility.MobilityBoard;
import rhsu.board2.randomGenerators.RandomGenerator;

public interface BoardBuilder<T>
{
	public BoardBuilder<T> setBoardIO(Board2IO<T> boardIO);
	public BoardBuilder<T> setMatrix(Matrix2<T> matrix);
	public BoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator);
	public BoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard);
	public BoardBuilder<T> setHorizontalSize(int horizontalSize);	
	public BoardBuilder<T> setVerticalSize(int verticalSize);
	public BoardBuilder<T> setDefaulValue(T defaultValue);
	public BoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer);
	public Board2<T> createBoard();
}
