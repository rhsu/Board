package rhsu.board2.boardReaders;

import java.io.BufferedReader;
import rhsu.board2.CompositeBoard;

public interface Board2IO<T>
{
	public CompositeBoard<String> getBoardInitializer();
	public void populateFromFile(String filename, String delimiter);
	public void populateFromResource(BufferedReader reader, String delimiter);
	public void export(String filename, char delimiter);
}
