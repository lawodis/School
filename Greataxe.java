//Jack Wood

public class Greataxe extends Weapon
{
	private static final String WEAPON_TYPE = "greataxe",
								WEAPON_SIZE = "two handed",
								WEAPON_ATTACK_TYPE = "melee";
	
	private static final int NUMBER_OF_DAMAGE_DICE = 1,
							 MAX_DAMAGE_ROLL = 12,
							 CRITICAL_ROLL = 20,
							 CRITICAL_MULTIPLIER = 3;
							 
	private static final double WEIGHT = 19.0;
	
	private static final int[] COST = new int[3];
	
	public Greataxe()
	{
		this("");
	}
	
	public Greataxe(String name)
	{
		super(name,WEAPON_TYPE, WEAPON_SIZE, WEAPON_ATTACK_TYPE, NUMBER_OF_DAMAGE_DICE,MAX_DAMAGE_ROLL,CRITICAL_ROLL,CRITICAL_MULTIPLIER, WEIGHT, COST);
		
		
	}
}
