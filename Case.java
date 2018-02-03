//Jack Wood

public class Case extends Gear
{
	private static final String GEAR_TYPE = "case";
	
	private static final int[] COST = new int[3];
	
	public Case()
	{
		this("");
	}
	
	public Case(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}