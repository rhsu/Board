package rhsu.board2;

import java.io.BufferedReader;

public interface Board2IO
{
	public void populateFromFile(String filename);
	public void populateFromResource(BufferedReader reader);
	public void export(String filename, char delimiter);
	public void export(String filename);
}
