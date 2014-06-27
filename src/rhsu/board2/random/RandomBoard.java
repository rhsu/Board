package rhsu.board2.random;

import rhsu.board2.Board2;

public interface RandomBoard<T> extends Board2<T>
{
	public RandomGenerator<T> randomGenerator();
}
