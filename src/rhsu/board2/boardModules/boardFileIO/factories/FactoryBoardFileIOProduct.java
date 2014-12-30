package rhsu.board2.boardModules.boardFileIO.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import rhsu.board2.boardModules.boardFileIO.BoardFileIO;

public interface FactoryBoardFileIOProduct
{
	BoardFileIO<BigDecimal> getBigDecimalImplementation();
	BoardFileIO<BigInteger> getBigIntegerImplementation();
	BoardFileIO<Boolean> getBooleanImplementation();
	BoardFileIO<Character> getCharacterImplentation();
	BoardFileIO<Double> getDoubleImplementation();
	BoardFileIO<Integer> getIntegerImplementation();
	BoardFileIO<String> getStringImpelementation();
}
