package rhsu.board2.boardModules.boardFileIO;

import java.io.BufferedReader;

public interface BoardFileResource<T> extends BoardFileIO<T>
{
	public void populateFromResource(BufferedReader reader, String delimiter);
}
