//Jack Wood

public class Dagger extends Weapon
{
	private static final String WEAPON_TYPE = "dagger",
								WEAPON_SIZE = "Two Handed",
								WEAPON_ATTACK_TYPE = "melee";

	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 12,
							 CRITICAL_ROLL = 20,
							 CRITICAL_MULTIPLIER = 3;

	private static final Double WEIGHT = 19.0;
	
	private static final int[] COST = new int[3];

	public Dagger()
	{
		this("");
	}

	public Dagger(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
		
		return;
	}
}
