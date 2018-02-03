//Jack Wood

public class LightCrossBow extends Weapon
{
	private static final String WEAPON_TYPE = "light cross bow",
								WEAPON_SIZE = "one handed",
								WEAPON_ATTACK_TYPE = "ranged";
	
	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 6,
							 CRITICAL_ROLL = 19,
							 CRITICAL_MULTIPLIER = 2;
							 
	private static final double WEIGHT = 2.0;
	
	private static final int[] COST = new int[3];
	
	public LightCrossBow()
	{
		this("");
	}
	
	public LightCrossBow(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
	}
}
