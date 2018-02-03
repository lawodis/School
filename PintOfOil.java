//Jack Wood

public class PintOfOil extends Gear
{
	private static final String GEAR_TYPE = "pint of oil";
	
	private static final int[] COST = new int[3];
	
	public PintOfOil()
	{
		this("");
	}
	
	public PintOfOil(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}