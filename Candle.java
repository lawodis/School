
public class Candle extends Gear
{
	private static final String GEAR_TYPE = "candle";
	
	private static final int[] COST = new int[3];
	
	public Candle()
	{
		this("");
	}
	
	public Candle(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}