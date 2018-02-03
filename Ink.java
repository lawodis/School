//Jack Wood

public class Ink extends Gear
{
	private static final String GEAR_TYPE = "ink";
	
	private static final int[] COST = new int[3];
	
	public Ink()
	{
		this("");
	}
	
	public Ink(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}