//Jack Wood

public class SavingThrow
{
	private String name;
	
	private int total,
				baseSave,
				abilityModifier,
				magicModifier,
				miscModifier;
	
	public SavingThrow()
	{
		this("", 0, 0, 0, 0);
	}
	
	public SavingThrow(String name, int base, int ability, int magic, int misc)
	{
		setName(name);
		
		setBaseSave(base);
		
		setAbilityModifier(ability);
		
		setMagicModifier(magic);
		
		setMiscModifier(misc);
		
		calculateTotal();
	}
	
	public void setName(String name)
	{
		this.name = name;
		
		return;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBaseSave(int base)
	{
		baseSave = base;
		
		return;
	}
	
	public int getBaseSave()
	{
		return baseSave;
	}
	
	public void setAbilityModifier(int ability)
	{
		abilityModifier = ability;
		
		return;
	}
	
	public int getAbilityModifier()
	{
		return abilityModifier;
	}
	
	public void setMagicModifier(int magic)
	{
		magicModifier = magic;
		
		return;
	}
	
	public int getMagicModifier()
	{
		return magicModifier;
	}
	
	public void setMiscModifier(int misc)
	{
		miscModifier = misc;
		
		return;
	}
	
	public int getMiscModifier()
	{
		return miscModifier;
	}
	
	public void calculateTotal()
	{
		total = baseSave + abilityModifier + magicModifier + miscModifier;
	}
	
	public int getTotal()
	{
		return total;
	}
}
