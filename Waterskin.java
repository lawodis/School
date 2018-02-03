//Jack Wood

public class Waterskin extends Gear
{
	private static final String GEAR_TYPE = "waterskin";
	
	private static final int[] COST = new int[3];
	
	public Waterskin()
	{
		this("");
	}
	
	public Waterskin(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}
