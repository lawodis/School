
public interface DiceRoller
{
	public final int FOUR_SIDED = 4,
					 SIX_SIDED = 6,
					 EIGHT_SIDED = 8,
					 TEN_SIDED = 10,
					 TWELVE_SIDED = 12,
					 TWENTY_SIDED = 20,
					 HUNDRED_SIDED = 100;
						
	public void addDie(int sides);
	
	public void addDice(int quantity, int sides);
	
	public int rollFourSidedDice(int quantity);
	
	public int rollSixSidedDice(int quantity);
	
	public int rollEightSidedDice(int quantity);
	
	public int rollTenSidedDice(int quantity);
	
	public int rollTwelveSidedDice(int quantity);
	
	public int rollTwentySidedDice(int quantity);
	
	public int rollHundredSidedDice(int quantity);
	
	public int rollCorrectDice(int sides);
	
	public int rollDiceAndDropLowest(int quantity, int sides);
	
	public boolean rollDiceCheck(int diceCheck, int rollModifier);
	
	public int rollDiceCheck(int quantity, int diceCheck, int rollModifier);
	
	public boolean specialDiceCheck(int sides, int diceCheck, int rollModifier);
	
	public int specialDiceCheck(int quantity, int sides, int diceCheck, int rollModifier);
	
	public Object[] Attack(int naturalCritical, int attackModifier, int armorClass, int[][] damageDice);
	
	public boolean isNaturalCritical(int roll, int naturalCritical);
	
	public boolean isCriticalDamage(int attackModifier, int armorClass);
	
	public int rollDamage(int[][] damageDice);	
}
