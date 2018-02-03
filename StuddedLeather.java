//Jack Wood

public class StuddedLeather extends Armor
{
	private static final String ARMOR_TYPE = "studded leather";
	
	private static final int ARMOR_BONUS = 3,
							 ARMOR_CHECK_PENALTY = -1;
							 
	private static final double WEIGHT = 20;
	
	private static final int[] COST = new int[3];	
	
	StuddedLeather()
	{
		super("", ARMOR_TYPE, ARMOR_BONUS, ARMOR_CHECK_PENALTY, WEIGHT, COST);		
	}
}
