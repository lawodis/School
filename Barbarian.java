
public class Barbarian extends CharacterClass
{
	private static final String CLASS = "barbarian";
	
	private static final int MAX_HEALTH_ROLL = 12;
	
	public Barbarian()
	{
		setClassName(CLASS);
		
		this.hitDice = new Dice(MAX_HEALTH_ROLL);
	}

	public void setBaseAttackBonus()
	{
		for(int i = 0; i < MAX_LEVEL; i++)
		{
			baseAttackBonus[i] = i + 1;
		}
		
		return;
	}
	
	public void setFortitudeSave()
	{
		for(int i = 0, j = 2, k = 1; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 2)
			{
				fortitudeSave[(int) i] = (int) j;
				
				i++;
				k++;
			}
		}
		
		return;
	}
	
	public void setReflexSave()
	{
		for(int i = 0, j = 0, k = 2; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 3)
			{
				reflexSave[i] = j;
				
				i++;
				k++;
			}
		}
		
		return;
	}
	
	public void setWillSave()
	{
		for(int i = 0, j = 0, k = 2; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 3)
			{
				willSave[i] = j;
				
				i++;
				k++;
			}
		}
		
		return;
	}
	
	public void setSkillPoints(int modifier)
	{
		int i = 0;
		
		skillPoints[i++] = 4 * (modifier + 4);
		
		while(i < MAX_LEVEL)
		{
			skillPoints[i++] = modifier + 4;
		}
	}
	
	public void setStartingPackage()
	{
		int i = 0;
		
		Dice leftOverGold = new Dice(4);
		
		startingPackage = new Item[31 + leftOverGold.rollDice(2)];
		
		startingPackage[i++] = new StuddedLeather();
		
		startingPackage[i++] = new Greataxe();
		
		startingPackage[i++] = new ShortBow();
		
		startingPackage[i++] = new Dagger();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();
		
		startingPackage[i++] = new Quiver();
		
		for(int j = 1; j <= 20; j++)
		{
			startingPackage[i++] = new Arrow();
		}
		
		while(i < startingPackage.length)
		{
			startingPackage[i++] = new GoldPiece();
		}
		
		return;
	}	
}