package rhsu.board2.boardModules.boardFileIO;

public class FactoryBoardFileResource<T> implements FactoryBoardFileIOProduct<T>
{
	@Override
	public AbstractBoardFileResource<T> getImplementation() 
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
