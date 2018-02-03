//Jack Wood

public class Pouch extends Gear
{
	private static final String GEAR_TYPE = "pouch";
	
	private static final int[] COST = new int[3];
	
	public Pouch()
	{
		this("");
	}
	
	public Pouch(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}