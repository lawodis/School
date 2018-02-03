//Jack Wood

public class SpellComponentPouch extends Gear
{
	private static final String GEAR_TYPE = "spell component pouch";
	
	private static final int[] COST = new int[3];
	
	public SpellComponentPouch()
	{
		this("");
	}
	
	public SpellComponentPouch(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}