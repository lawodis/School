//Jack Wood

public class Wizard extends CharacterClass
{
	private static final String CLASS = "wizard";
	
	private static final int MAX_HEALTH_ROLL = 4;
	
	public Wizard()
	{
		setClassName(CLASS);
		
		this.hitDice = new Dice(MAX_HEALTH_ROLL);
	}

	public void setBaseAttackBonus()
	{
		for(int i = 0, j = 0, k = 2; i < MAX_LEVEL; i++, j++)
		{
			while(k <= 2)
			{
				baseAttackBonus[(int) i] = (int) j;
				
				i++;
				k++;
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
		
		startingPackage = new Item[37 + leftOverGold.rollDice(3)];
				
		startingPackage[i++] = new Quarterstaff();
		
		startingPackage[i++] = new LightCrossBow();
		
		startingPackage[i++] = new Backpack();
		
		startingPackage[i++] = new Waterskin();
		
		startingPackage[i++] = new DayOfTrailRations();
		
		startingPackage[i++] = new BedRoll();
		
		startingPackage[i++] = new Sack();
		
		startingPackage[i++] = new Flint();
		
		startingPackage[i++] = new Steel();		
		
		for(int j = 1; j <= 10; j++)
		{
			startingPackage[i++] = new Candle();
		}		
		
		startingPackage[i++] = new MapCase();
		
		for(int j = 1; j <= 3; j++)
		{
			startingPackage[i++] = new PageOfParchment();
		}		
		
		startingPackage[i++] = new Ink();
		
		startingPackage[i++] = new Inkpen();
		
		startingPackage[i++] = new SpellComponentPouch();
		
		startingPackage[i++] = new Spellbook();
		
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