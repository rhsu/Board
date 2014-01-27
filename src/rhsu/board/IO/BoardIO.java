package rhsu.board.IO;

import java.io.BufferedReader;

public interface BoardIO 
{
	public void populateFromFile(String filename);
	public void populateFromResource(BufferedReader reader);
}
