//Jack Wood

public class Lute extends Gear
{
	private static final String GEAR_TYPE = "Lute";
	
	private static final int[] COST = new int[3];
	
	public Lute()
	{
		this("");
	}
	
	public Lute(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}