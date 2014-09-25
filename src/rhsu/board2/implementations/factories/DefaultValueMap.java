package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class DefaultValueMap extends HashMap<String, Object>//extends AbstractDefaultValueProvider
{
	public BigDecimal getDefaultBigDecimal() { return (BigDecimal) this.get("BigDecimal"); }
	public BigInteger getDefaultBigInteger() { return (BigInteger) this.get("BigInteger"); }
	public Boolean getDefaultBoolean() { return (Boolean) this.get("Boolean"); }
	public Character getDefaultCharacter() { return (Character) this.get("Character"); }
	public Double getDefaultDouble() { return (Double) this.get("Double"); }
	public Integer getDefaultInteger() { return (Integer) this.get("Integer"); }
	public String getDefaultString() { return (String) this.get("String"); }
	
	public void setDefaultBigInteger(BigInteger value) { this.put("BigInteger", value); };
	public void setDefaultBigDecimal(BigDecimal value) { this.put("BigDecimal", value); };
	public void setDefaultBoolean(Boolean value) { this.put("Boolean", value); };
	public void setDefaultCharacter(Character value) { this.put("Character", value); };
	public void setDefaultDouble(Double value) { this.put("Double", value); };
	public void setDefaultInteger(Integer value) { this.put("Integer", value); };
	public void setDefaultString(String value) { this.put("String", value); };
	
	public DefaultValueMap()
	{
		this.put("BigDecimal", BigDecimal.ZERO);
		this.put("BigInteger", BigInteger.ZERO);
		this.put("Boolean", false);
		this.put("Integer", 0);
		this.put("String", "++");
		this.put("Character", '+');
		this.put("Double", 0.0);
	}
}
