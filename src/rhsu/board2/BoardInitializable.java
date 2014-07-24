package rhsu.board2;

public interface BoardInitializable<T>
{
	public BoardPiece2<T>[][] initializeBoard(BoardPiece2<T>[][] boardArray);
}
