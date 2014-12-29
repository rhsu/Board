package rhsu.board2.boardModules.boardFileIO.factories;

public class FactoryBoardFileIOProductGenerator
{
	private BoardFileIOProductType type;
	
	public void setType(BoardFileIOProductType type) { this.type = type; }
	
	public FactoryBoardFileIOProductGenerator() { }
	
	public FactoryBoardFileIOProductGenerator(BoardFileIOProductType type) { this.type = type; }
	
	public FactoryBoardFileIOProduct getFactory()
	{
		if (this.type == null) throw new NullPointerException("Cannot build factory because type is null");
		
		switch(type)
		{
			case FILE:
				return new FactoryBoardFileReader();
			case RESOURCE:
			default:
				return new FactoryBoardFileResource();
		}
	}
}
