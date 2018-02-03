//Jack Wood

public class Cleric extends CharacterClass
{
	private static final String CLASS = "cleric";
	
	private static final int MAX_HEALTH_ROLL = 8;
	
	public Cleric()
	{
		setClassName(CLASS);
		
		this.hitDice = new Dice(MAX_HEALTH_ROLL);
	}

	public void setBaseAttackBonus()
	{
		for(int i = 0, j = 1; i < MAX_LEVEL; i++, j++)
		{
			baseAttackBonus[i] = i;
			
			while(j == 4)
			{
				baseAttackBonus[i] = i++;
				
				j = 1;
			}
		}
		
		return;
	}
	
	public void setFortitudeSave()
	{
		for(int i = 0, j = 2, k = 2; i < MAX_LEVEL; i++, j++)
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
		for(int i = 0, j = 0, k = 1; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 2)
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
		for(int i = 0, j = 2, k = 2; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 2)
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
		
		skillPoints[i++] = 4 * (modifier + 2);
		
		while(i < MAX_LEVEL)
		{
			skillPoints[i++] = modifier + 2;
		}
	}
	
	public void setStartingPackage()
	{
		int i = 0;
		
		Dice leftOverGold = new Dice(4);
		
		startingPackage = new Item[26 + leftOverGold.rollDice(1)];
		
		startingPackage[i++] = new ScaleMail();
		
		startingPackage[i++] = new HeavyWoodenShield();
		
		startingPackage[i++] = new HeavyMace();
		
		startingPackage[i++] = new LightCrossBow();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();
				
		startingPackage[i++] = new Case();
		
		for(int j = 1; j <= 10; j++)
		{
			startingPackage[i++] = new Bolt();
		}
		
		startingPackage[i++] = new WoodenHolySymbol();
		
		for(int j = 1; j <= 3; j++)
		{
			startingPackage[i++] = new Torch();
		}		
		
		while(i < startingPackage.length)
		{
			startingPackage[i++] = new GoldPiece();
			
			i++;
		}
		
		return;
	}	
}