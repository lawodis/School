//Jack Wood

public class Stone extends Gear
{
	private static final String GEAR_TYPE = "stone";
	
	private static final int[] COST = new int[3];
	
	public Stone()
	{
		this("");
	}
	
	public Stone(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}