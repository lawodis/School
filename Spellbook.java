//Jack Wood

public class Spellbook extends Gear
{
	private static final String GEAR_TYPE = "spellbook";
	
	private static final int[] COST = new int[3];
	
	public Spellbook()
	{
		this("");
	}
	
	public Spellbook(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}