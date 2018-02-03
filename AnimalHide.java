
public class AnimalHide extends Armor
{
	private static final String ARMOR_TYPE = "animal hide";
	
	private static final int ARMOR_BONUS = 3,
							 ARMOR_CHECK_PENALTY = -3;
	
	private static final int[] COST = new int[3];
							 
	private static final double WEIGHT = 25;
	
	AnimalHide()
	{
		super("", ARMOR_TYPE, ARMOR_BONUS, ARMOR_CHECK_PENALTY, WEIGHT, COST);		
	}
}
