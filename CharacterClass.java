//Jack Wood

public class CharacterClass
{
	protected static final int MAX_LEVEL = 20;
	
	private String className;
	
	protected int level;
	
	protected CharacterClass crossClass;
	
	protected int[] baseAttackBonus = new int[MAX_LEVEL];

	protected int[] fortitudeSave = new int[MAX_LEVEL], 
					reflexSave = new int[MAX_LEVEL],
					willSave = new int[MAX_LEVEL],
					skillPoints = new int[MAX_LEVEL];
	
	protected Item[] startingPackage;
	
	protected Dice hitDice;
	
	public CharacterClass()
	{
		return;
	}
	
	public void setClassName(String name)
	{
		className = name;
		
		return;
	}
	
	public String getClassName()
	{
		return className;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
		
		return;
	}
	
	public void levelUp()
	{
		level++;
		
		return;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setBaseAttackBonus()
	{
		return;
	}
	
	public int getBaseAttackBonus()
	{
		return baseAttackBonus[level - 1];
	}
	
	public void setFortitudeSave()
	{
		return;
	}
	
	public int getFortitudeSave()
	{
		return fortitudeSave[level - 1];
	}
	
	public void setReflexSave()
	{
		return;
	}
	
	public int getReflexSave()
	{
		return reflexSave[level - 1];
	}
	
	public void setWillSave()
	{
		return;
	}
	
	public int getWillSave()
	{
		return willSave[level - 1];
	}
	
	public void setSkillPoints()
	{
		return;
	}
	
	public int getSkillPoints()
	{
		return skillPoints[level - 1];
	}
	
	public void setStartingPackage()
	{
		
	}
	
	public Item[] getStartingPackage()
	{
		return startingPackage;
	}
}
