package rhsu.board;

/**
 * Interface for generating a random type
 * @param <T> The random type to generate
 */
public interface RandomGenerator<T>
{
	T getRandom();
}
