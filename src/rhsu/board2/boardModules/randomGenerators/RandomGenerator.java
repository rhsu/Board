package rhsu.board2.boardModules.randomGenerators;

import rhsu.board2.boardModules.BoardModule;

/**
 * Interface for generating a random type
 * @param <T> The random type to generate
 */
public interface RandomGenerator<T> extends BoardModule<T>
{
	T getRandom();
}
