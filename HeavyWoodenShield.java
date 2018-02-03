//Jack Wood

public class HeavyWoodenShield extends Armor
{
	private static final String ARMOR_TYPE = "heavy wooden shield";
	
	private static final int ARMOR_BONUS = 2,
							 ARMOR_CHECK_PENALTY = -2;
	
	private static final int[] COST = new int[3];
							 
	private static final double WEIGHT = 10;
	
	HeavyWoodenShield()
	{
		super("", ARMOR_TYPE, ARMOR_BONUS, ARMOR_CHECK_PENALTY, WEIGHT, COST);		
	}
}
