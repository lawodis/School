//Jack Wood

public class Currency extends Item
{
	private static final String ITEM_TYPE = "currency";
	
	private static final double WEIGHT = 0.1;
	
	private String currencyType;
	
	public Currency()
	{
		this("", "");
	}
	
	public Currency(String name, String type)
	{
		super(name, ITEM_TYPE, WEIGHT, null);
		
		setCurrencyType(type);
	}
	
	public void setCurrencyType(String type)
	{
		currencyType = type;
		
		return;
	}
	
	public String getCurrencyType()
	{
		return currencyType;
	}
}
