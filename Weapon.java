//Jack Wood

public class Weapon 

	   extends Item
	   
	   implements WeaponWielder
{	
	private String weaponType,
				   weaponSize,
				   weaponAttackType;
	
	private Dice attackDice = new Dice(DEFAULT_CRITICAL_ROLL);
	
	private int criticalRoll,
				criticalMultiplier;
	
	private Dice[] damageDice;
	
	public Weapon()
	{
		this("", "", "", "", 0, 0, 0, 0, 0, null);
	}
	
	public Weapon(String name, String type, String size, String attackType, int diceNumber, int diceSides, int critical, int multiplier, double weight, int[] cost)
	{
		super(name, ITEM_TYPE, weight, cost);
		
		setWeaponType(type);
		
		setWeaponSize(size);
		
		setWeaponAttackType(attackType);
		
		setDamageDice(diceNumber, diceSides);
		
		setCriticalRoll(critical);
		
		setCriticalMultiplier(multiplier);
	}
	
	public void setWeaponType(String type)
	{
		weaponType = type;
		
		return;
	}
	
	public String getWeaponType()
	{
		return weaponType;
	}
	
	public void setWeaponSize(String size)
	{
		weaponSize = size;
		
		return;
	}
	
	public String getWeaponSize()
	{
		return weaponSize;
	}
	
	public void setWeaponAttackType(String attackType)
	{
		weaponAttackType = attackType;
		
		return;
	}
	
	public String getWeaponAttackType()
	{
		return weaponAttackType;
	}
	
	public void setDamageDice(int diceNumber, int diceSides)
	{
		damageDice = new Dice[diceNumber];
		
		for(int i = 0; i < diceNumber; i++)
		{
			damageDice[i] = new Dice(diceSides);
		}
		
		return;
	}
	
	public Dice[] getDamageDice()
	{
		return damageDice;
	}
	
	public void setCriticalRoll(int critical)
	{
		criticalRoll = critical;
		
		return;
	}
	
	public int getCriticalRoll()
	{
		return criticalRoll;
	}
	
	public void setCriticalMultiplier(int multiplier)
	{
		criticalRoll = multiplier;
		
		return;
	}
	
	public int getMultiplierRoll()
	{
		return criticalMultiplier;
	}
	
	public boolean[] attack(int armorClass, int attackBonus)
	{
		boolean[] attackResult = new boolean[2];
		
		boolean hit, critical;
		
		int i = 0;
		
		hit = critical = false;
		
		if(attackDice.rollDie() >= criticalRoll)
		{
			hit = true;
			
			if(attackDice.rollDie() + attackBonus >= armorClass);
			{
				critical = true;
			}
		}
		if(attackDice.readDie() + attackBonus >= armorClass);
		{
			hit = true;
		}
		
		attackResult[i++] = hit;
		attackResult[i] = critical;
		
		return attackResult;
	}
	
	public int dealDamage(boolean critical)
	{
		int totalDamage = 0;
		
		if(critical)
		{
			for(int i = 0; i < criticalMultiplier; i++)
			{
				for(int j = 0; j < damageDice.length; j++)
				{
					totalDamage += damageDice[j].rollDie();
				}
			}
		}
		else
		{
			for(int j = 0; j < damageDice.length; j++)
			{
				totalDamage += damageDice[j].rollDie();
			}
		}
				
		return totalDamage;
	}

}
