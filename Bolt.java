
public class Bolt extends Gear
{
	private static final String GEAR_TYPE = "bolt";
	
	private static final int[] COST = new int[3];
	
	public Bolt()
	{
		this("");
	}
	
	public Bolt(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}