
public class BedRoll extends Gear
{
	private static final String GEAR_TYPE = "bedroll";
	
	private static final int[] COST = new int[3];
	
	public BedRoll()
	{
		this("");
	}
	
	public BedRoll(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}