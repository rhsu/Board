package rhsu.board2.randomGenerators;

/**
 * Interface for generating a random type
 * @param <T> The random type to generate
 */
public interface RandomGenerator<T>
{
	T getRandom();
}
