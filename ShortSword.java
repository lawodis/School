//Jack Wood

public class ShortSword extends Weapon
{
	private static final String WEAPON_TYPE = "short sword",
								WEAPON_SIZE = "one handed",
								WEAPON_ATTACK_TYPE = "melee";

	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 6,
							 CRITICAL_ROLL = 19,
							 CRITICAL_MULTIPLIER = 2;
							 
	private static final double WEIGHT = 2.0;
	
	private static final int[] COST = new int[3];

	public ShortSword()
	{
		this("");
	}

	public ShortSword(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
	}
}
