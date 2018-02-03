//Jack Wood

public class Fighter extends CharacterClass
{
	private static final String CLASS = "fighter";
	
	private static final int MAX_HEALTH_ROLL = 10;
	
	public Fighter()
	{
		setClassName(CLASS);
		
		this.hitDice = new Dice(MAX_HEALTH_ROLL);
	}

	public void setBaseAttackBonus()
	{
		for(int i = 0; i < MAX_LEVEL; i++)
		{
			baseAttackBonus[i] = i +1;			
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
		for(int i = 0, j = 0, k = 1; i < MAX_LEVEL; i++, j++)
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
		
		startingPackage = new Item[31 + leftOverGold.rollDice(2)];
		
		startingPackage[i++] = new ScaleMail();
		
		startingPackage[i++] = new GreatSword();
		
		startingPackage[i++] = new ShortBow();
		
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
			
			i++;
		}
		
		return;
	}	
}