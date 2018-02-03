//Jack Wood

public class Sorcerer extends CharacterClass
{
	private static final String CLASS = "sorcerer";
						 
	private static final int MAX_HEALTH_ROLL = 4;
	
	public Sorcerer()
	{
		super();
		
		this.setClassName(CLASS);
		
		hitDice = new Dice(MAX_HEALTH_ROLL);
	}

	public void setBaseAttackBonus()
	{
		for(int i = 0, j = 1; i < MAX_LEVEL; i++, j++)
		{
			baseAttackBonus[i] = i;
			
			while(j == 2)
			{
				baseAttackBonus[i] = i++;
				
				j = 1;
			}
		}
		
		return;
	}
	
	public void setFortitudeSave()
	{
		for(int i = 0, j = 0, k = 2; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 3)
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
		
		startingPackage = new Item[27 + leftOverGold.rollDice(3)];
				
		startingPackage[i++] = new ShortSpear();
		
		startingPackage[i++] = new LightCrossBow();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();		
		
		startingPackage[i++] = new HoodedLantern();
		
		for(int j = 1; j <= 5; j++)
		{
			startingPackage[i++] = new PintOfOil();
		}		
		
		startingPackage[i++] = new SpellComponentPouch();
		
		startingPackage[i++] = new Case();
		
		for(int j = 1; j <= 10; j++)
		{
			startingPackage[i++] = new Bolt();
		}				
		
		while(i < startingPackage.length)
		{
			startingPackage[i++] = new GoldPiece();
			
			i++;
		}
		
		return;
	}	
}