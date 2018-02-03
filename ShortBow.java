//Jack Wood

public class ShortBow extends Weapon
{
	private static final String WEAPON_TYPE = "short bow",
								WEAPON_SIZE = "Two Handed",
								WEAPON_ATTACK_TYPE = "ranged";

	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 6,
							 CRITICAL_ROLL = 20,
							 CRITICAL_MULTIPLIER = 3;
							 
	private static final double WEIGHT = 2.0;
	
	private static final int[] COST = new int[3];

	public ShortBow()
	{
		this("");
	}

	public ShortBow(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
	}
}
