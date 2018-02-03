
public class Bard extends CharacterClass
{
	private static final String CLASS = "bard";
	
	private static final int MAX_HEALTH_ROLL = 6;
	
	public Bard()
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
		for(int i = 0, j = 2, k = 1; i < MAX_LEVEL; i++, j++)
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
		for(int i = 0, j = 2, k = 1; i < MAX_LEVEL; i++, j++)
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
		
		skillPoints[i++] = 4 * (modifier + 6);
		
		while(i < MAX_LEVEL)
		{
			skillPoints[i++] = modifier + 6;
		}
	}
	
	public void setStartingPackage()
	{
		int i = 0;
		
		Dice leftOverGold = new Dice(4);
		
		startingPackage = new Item[26 + leftOverGold.rollDice(2)];
		
		startingPackage[i++] = new StuddedLeather();
		
		startingPackage[i++] = new LongSword();
		
		startingPackage[i++] = new LightCrossBow();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();
		
		for(int j = 1; j <= 3; j++)
		{
			startingPackage[i++] = new Torch();
		}		
		
		startingPackage[i++] = new Case();
		
		for(int j = 1; j <= 10; j++)
		{
			startingPackage[i++] = new Bolt();
		}
		
		startingPackage[i++] = new Lute();
		
		startingPackage[i++] = new SpellComponentPouch();
		
		while(i < startingPackage.length)
		{
			startingPackage[i++] = new GoldPiece();
			
			i++;
		}
		
		return;
	}	
}