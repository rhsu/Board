package rhsu.board2;

import rhsu.board2.boardModules.boardFileIO.BoardFileIO;
import rhsu.board2.boardModules.matrices.Matrix2;
import rhsu.board2.boardModules.mobility.MobilityBoard;
import rhsu.board2.boardModules.randomGenerators.RandomGenerator;

public interface BoardBuilder<T>
{
	public BoardBuilder<T> setBoardIO(BoardFileIO<T> boardIO);
	public BoardBuilder<T> setMatrix(Matrix2<T> matrix);
	public BoardBuilder<T> setRandomGenerator(RandomGenerator<T> randomGenerator);
	public BoardBuilder<T> setMobilityBoard(MobilityBoard<T> mobilityBoard);
	public BoardBuilder<T> setHorizontalSize(int horizontalSize);	
	public BoardBuilder<T> setVerticalSize(int verticalSize);
	public BoardBuilder<T> setDefaulValue(T defaultValue);
	public BoardBuilder<T> setBoardInitializable(BoardInitializable<T> boardInitializer);
	public Board2<T> createBoard();
}
