//Jack Wood

public class ScaleMail extends Armor
{
	private static final String ARMOR_TYPE = "scale mail";
	
	private static final int[] COST = new int[3];
	
	private static final int ARMOR_BONUS = 4,
							 ARMOR_CHECK_PENALTY = -4,
							 WEIGHT = 30;
	
	
	ScaleMail()
	{
		super("", ARMOR_TYPE, ARMOR_BONUS, ARMOR_CHECK_PENALTY, WEIGHT, COST);		
	}
}
