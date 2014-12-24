package rhsu.board2.boardModules.boardFileIO;

public interface FactoryBoardFileIOProduct<T>
{
	AbstractBoardFileIO<T> getImplementation();
}
