package rhsu.board2;

import java.io.BufferedReader;

public interface Board2IO
{
	public void populateFromFile(String filename, String delimiter);
	public void populateFromResource(BufferedReader reader, String delimiter);
	public void export(String filename, char delimiter);
}
