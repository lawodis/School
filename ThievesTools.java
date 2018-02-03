//Jack Wood

public class ThievesTools extends Gear
{
	private static final String GEAR_TYPE = "thieves tools";
	
	private static final int[] COST = new int[3];
	
	public ThievesTools()
	{
		this("");
	}
	
	public ThievesTools(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}