//Jack Wood

public class Leather extends Armor
{
	private static final String ARMOR_TYPE = "leather";
	
	private static final int[] COST = new int[3];
	
	private static final int ARMOR_BONUS = 2,
							 ARMOR_CHECK_PENALTY = 0;
							 
	private static final double WEIGHT = 7.5;
	
	
	Leather()
	{
		super("", ARMOR_TYPE, ARMOR_BONUS, ARMOR_CHECK_PENALTY, WEIGHT, COST);		
	}
}
