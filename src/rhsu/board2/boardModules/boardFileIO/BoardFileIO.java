package rhsu.board2.boardModules.boardFileIO;

import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.Board2;

public interface BoardFileIO<T> extends BoardModule<T>
{
	public Board2<String> getBoardInitializer();
	// public void populateFromFile(String filename, String delimiter);
	// public void populateFromResource(BufferedReader reader, String delimiter);
	public void export(String filename, String delimiter);
	public void populate();
}