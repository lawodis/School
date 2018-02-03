//Jack Wood

public class Sack extends Gear
{
	private static final String GEAR_TYPE = "sack";
	
	private static final int[] COST = new int[3];
	
	public Sack()
	{
		this("");
	}
	
	public Sack(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}