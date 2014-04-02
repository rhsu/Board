package rhsu.board.io;

import java.io.BufferedReader;

public interface BoardIO 
{
	public void populateFromFile(String filename);
	public void populateFromResource(BufferedReader reader);
	public void initializeFromBaseBoard();
	public void export(String filename, char delimiter);
}
