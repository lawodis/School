
public class Bullet extends Gear
{
	private static final String GEAR_TYPE = "bullet";
	
	private static final int[] COST = new int[3];
	
	public Bullet()
	{
		this("");
	}
	
	public Bullet(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
}