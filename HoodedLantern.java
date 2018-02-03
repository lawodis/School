//Jack Wood

public class HoodedLantern extends Gear
{
	private static final String GEAR_TYPE = "hooded lantern";
	
	private static final int[] COST = new int[3];
	
	public HoodedLantern()
	{
		this("");
	}
	
	public HoodedLantern(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}