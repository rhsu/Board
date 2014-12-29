package rhsu.board2.boardModules.boardFileIO.factories;

import rhsu.board2.boardModules.boardFileIO.BoardFileIO;

public interface FactoryBoardFileIOProduct<T>
{
	BoardFileIO<T> getImplementation();
}
