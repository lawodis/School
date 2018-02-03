//Jack Wood

public class Gear extends Item
{
	private static final String ITEM_TYPE = "gear";
	
	private static final double WEIGHT = 0.1;
	
	private String gearType;
	
	public Gear()
	{
		this("", "", null);		
	}
	
	public Gear(String name, String type, int[] cost)
	{
		super(name, ITEM_TYPE, WEIGHT, cost);
		
		setGearType(type);
	}
	
	public void setGearType(String type)
	{
		gearType = type;
		
		return;
	}
	
	public String getGearType()
	{
		return gearType;
	}
}
