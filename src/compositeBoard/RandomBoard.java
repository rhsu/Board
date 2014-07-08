package compositeBoard;

import rhsu.board2.random.RandomGenerator;

public interface RandomBoard<T>
{
	public RandomGenerator<T> randomGenerator();
}
