
public class Arrow extends Gear
{
	private static final String GEAR_TYPE = "arrow";
	
	private static final int[] COST = new int[3];
	
	public Arrow()
	{
		this("");
	}
	
	public Arrow(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}