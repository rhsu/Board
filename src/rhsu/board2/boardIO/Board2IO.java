package rhsu.board2.boardIO;

import java.io.BufferedReader;
import rhsu.board2.BoardModule;
import rhsu.board2.CompositeBoard;

public interface Board2IO<T> extends BoardModule<T>
{
	public CompositeBoard<String> getBoardInitializer();
	public void populateFromFile(String filename, String delimiter);
	public void populateFromResource(BufferedReader reader, String delimiter);
	public void export(String filename, char delimiter);
}
