//Jack Wood

public class PageOfParchment extends Gear
{
	private static final String GEAR_TYPE = "page of parchment";
	
	private static final int[] COST = new int[3];
	
	public PageOfParchment()
	{
		this("");
	}
	
	public PageOfParchment(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}