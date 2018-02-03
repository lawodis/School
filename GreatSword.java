//Jack Wood

public class GreatSword extends Weapon
{
	private static final String WEAPON_TYPE = "great sword",
								WEAPON_SIZE = "two handed",
								WEAPON_ATTACK_TYPE = "melee";
	
	private static final int NUMBER_OF_DAMAGE_DICE = 2,
							 MAX_DAMAGE_ROLL = 6,
							 CRITICAL_ROLL = 19,
							 CRITICAL_MULTIPLIER = 2;
							 
	private static final double WEIGHT = 8.0;
	
	private static final int[] COST = new int[3];
	
	public GreatSword()
	{
		this("");
	}
	
	public GreatSword(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);	
	}
}
