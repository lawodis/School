//Jack Wood

public class Mistletoe extends Gear
{
	private static final String GEAR_TYPE = "mistletoe";
	
	private static final int[] COST = new int[3];
	
	public Mistletoe()
	{
		this("");
	}
	
	public Mistletoe(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}