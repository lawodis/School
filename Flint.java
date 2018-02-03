
public class Flint extends Gear
{
	private static final String GEAR_TYPE = "flint";
	
	private static final int[] COST = new int[3];
	
	public Flint()
	{
		this("");
	}
	
	public Flint(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}