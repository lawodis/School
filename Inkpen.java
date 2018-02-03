//Jack Wood

public class Inkpen extends Gear
{
	private static final String GEAR_TYPE = "inkpen";
	
	private static final int[] COST = new int[3];
	
	public Inkpen()
	{
		this("");
	}
	
	public Inkpen(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}