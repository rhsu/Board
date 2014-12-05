package rhsu.board2.boardModules.boardIO;

import java.io.BufferedReader;
import rhsu.board2.boardModules.BoardModule;
import rhsu.board2.Board2;

public interface Board2IO<T> extends BoardModule<T>
{
	public Board2<String> getBoardInitializer();
	// public void populateFromFile(String filename, String delimiter);
	// public void populateFromResource(BufferedReader reader, String delimiter);
	// public void populate();
	public void export(String filename, String delimiter);
}
