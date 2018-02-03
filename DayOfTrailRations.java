//Jack Wood

public class DayOfTrailRations extends Gear
{
	private static final String GEAR_TYPE = "day of trail rations";
	
	private static final int[] COST = new int[3];
	
	public DayOfTrailRations()
	{
		this("");
	}
	
	public DayOfTrailRations(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}