package rhsu.board2.implementations.factories;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DefaultValueProvider extends AbstractDefaultValueProvider
{
	public BigDecimal getDefaultBigDecimal() { return (BigDecimal) this.defaultValueMap.get("BigDecimal"); }
	public BigInteger getDefaultBigInteger() { return (BigInteger) this.defaultValueMap.get("BigInteger"); }
	public Boolean getDefaultBoolean() { return (Boolean) this.defaultValueMap.get("Boolean"); }
	public Character getDefaultCharacter() { return (Character) this.defaultValueMap.get("Character"); }
	public Double getDefaultDouble() { return (Double) this.defaultValueMap.get("Double"); }
	public Integer getDefaultInteger() { return (Integer) this.defaultValueMap.get("Integer"); }
	public String getDefaultString() { return (String) this.defaultValueMap.get("String"); }
	
	public void setDefaultBigInteger(BigInteger value) { this.defaultValueMap.put("BigInteger", value); };
	public void setDefaultBigDecimal(BigDecimal value) { this.defaultValueMap.put("BigDecimal", value); };
	public void setDefaultBoolean(Boolean value) { this.defaultValueMap.put("Boolean", value); };
	public void setDefaultCharacter(Character value) { this.defaultValueMap.put("Character", value); };
	public void setDefaultDouble(Double value) { this.defaultValueMap.put("Double", value); };
	public void setDefaultInteger(Integer value) { this.defaultValueMap.put("Integer", value); };
	public void setDefaultString(String value) { this.defaultValueMap.put("String", value); };
}
