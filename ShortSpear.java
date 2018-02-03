//Jack Wood

public class ShortSpear extends Weapon
{
	private static final String WEAPON_TYPE = "short spear",
								WEAPON_SIZE = "one handed",
								WEAPON_ATTACK_TYPE = "melee";

	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 6,
							 CRITICAL_ROLL = 20,
							 CRITICAL_MULTIPLIER = 2;
							 
	private static final double WEIGHT = 3.0;
	
	private static final int[] COST = new int[3];

	public ShortSpear()
	{
		this("");
	}

	public ShortSpear(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
	}
}
