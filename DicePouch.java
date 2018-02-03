
public class DicePouch implements DiceRoller {

	private Dice[] dieInHand;
	
	private int diceInHand,
				lastValueRolled,
				lastTotalValue;
	
	public DicePouch()
	{
		diceInHand = 0;
		
		dieInHand = new Dice[diceInHand];		
	}
	
	public Object[] Attack(int naturalCritical, int attackModifier,
			int armorClass, int[][] damageDice) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDice(int quantity, int sides)
	{
		for(int i = 0; i < quantity; i++)
		{
			addDie(sides);
		}
	}

	public void addDie(int sides)
	{
		Dice[] oldDie = dieInHand;
		
		dieInHand = new Dice[diceInHand + 1];
		
		for(int i = 0; i < diceInHand; i++)
		{
			dieInHand[i] = oldDie[i];
		}
		
		dieInHand[diceInHand++] = new Dice(sides);
	}

	@Override
	public boolean isCriticalDamage(int attackModifier, int armorClass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNaturalCritical(int roll, int naturalCritical) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rollCorrectDice(int sides) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollDamage(int[][] damageDice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollDiceAndDropLowest(int quantity, int sides) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean rollDiceCheck(int diceCheck, int rollModifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rollDiceCheck(int quantity, int diceCheck, int rollModifier) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollEightSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollFourSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollHundredSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollSixSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollTenSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollTwelveSidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rollTwentySidedDice(int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean specialDiceCheck(int sides, int diceCheck, int rollModifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int specialDiceCheck(int quantity, int sides, int diceCheck,
			int rollModifier) {
		// TODO Auto-generated method stub
		return 0;
	}

}
