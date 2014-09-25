package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDefaultValueProvider
{
	protected Map<String, Object> defaultValueMap;
	
	public AbstractDefaultValueProvider()
	{
		defaultValueMap = new HashMap<>();

		defaultValueMap.put("BigDecimal", BigDecimal.ZERO);
		defaultValueMap.put("BigInteger", BigInteger.ZERO);
		defaultValueMap.put("Boolean", false);
		defaultValueMap.put("Integer", 0);
		defaultValueMap.put("String", "++");
		defaultValueMap.put("Character", "+");
		defaultValueMap.put("Double", 0.0);
	}
	
	public Object getValue(String key)
	{
		return defaultValueMap.containsKey(key) 
			? defaultValueMap.get(key)
			: null;
	}
	
	public void setValue(String key, Object value)
	{
		defaultValueMap.put(key, value);
	}
}
