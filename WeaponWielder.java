
public interface WeaponWielder
{
	public final int DEFAULT_CRITICAL_ROLL = 20;
	
	public static final String ITEM_TYPE = "weapon";
	/*
	 * The weapon will return whatever bonus it gives
	 * for attack rolls
	 */
	public int attack();
	
	public int maxDamage();
	
}
