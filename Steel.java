//Jack Wood

public class Steel extends Gear
{
	private static final String GEAR_TYPE = "steel";
	
	private static final int[] COST = new int[3];
	
	public Steel()
	{
		this("");
	}
	
	public Steel(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}