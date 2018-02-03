//Jack Wood

public class Quiver extends Gear
{
	private static final String GEAR_TYPE = "quiver";
	
	private static final int[] COST = new int[3];
	
	public Quiver()
	{
		this("");
	}
	
	public Quiver(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}