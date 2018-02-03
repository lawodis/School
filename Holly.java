//Jack Wood

public class Holly extends Gear
{
	private static final String GEAR_TYPE = "holly";
	
	private static final int[] COST = new int[3];
	
	public Holly()
	{
		this("");
	}
	
	public Holly(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}