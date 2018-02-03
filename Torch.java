//Jack Wood

public class Torch extends Gear
{
	private static final String GEAR_TYPE = "torch";
	
	private static final int[] COST = new int[3];
	
	public Torch()
	{
		this("");
	}
	
	public Torch(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}