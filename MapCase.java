//Jack Wood

public class MapCase extends Gear
{
	private static final String GEAR_TYPE = "map case";
	
	private static final int[] COST = new int[3];
	
	public MapCase()
	{
		this("");
	}
	
	public MapCase(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}