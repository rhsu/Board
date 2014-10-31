package rhsu.board2.boardModules;

import rhsu.board2.Board2;

public interface BoardModule<T>
{
	public Board2<T> getParent();
	public void setParent(Board2<T> parent);
}
