//Jack Wood

public class Druid extends CharacterClass
{
	private static final String CLASS = "druid";
	
	private static final int MAX_HEALTH_ROLL = 8;
	
	public Druid()
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
		
		skillPoints[i++] = 4 * (modifier + 4);
		
		while(i < MAX_LEVEL)
		{
			skillPoints[i++] = modifier + 4;
		}
	}
	
	public void setStartingPackage()
	{
		int i = 0;
		
		Dice leftOverGold = new Dice(6);
		
		startingPackage = new Item[27 + leftOverGold.rollDice(1)];
		
		startingPackage[i++] = new AnimalHide();
		
		startingPackage[i++] = new HeavyWoodenShield();
		
		startingPackage[i++] = new Scimitar();
		
		startingPackage[i++] = new Club();
		
		startingPackage[i++] = new Sling();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();
						
		for(int j = 1; j <= 10; j++)
		{
			startingPackage[i++] = new Bullet();
		}
		
		startingPackage[i++] = new Holly();
		
		startingPackage[i++] = new Mistletoe();
		
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