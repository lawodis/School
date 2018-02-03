
public class Armor extends Item
{
	private static final String ITEM_TYPE = "armor";
	
	private String armorType;
	
	private int armorBonus,
				armorCheckPenalty;
		
	public Armor(String name, String type, int bonus, int penalty, double weight, int[] cost)
	{
		super("", ITEM_TYPE, weight, cost);		
			
		setArmorType(type);
		
		setArmorBonus(bonus);
		
		setArmorCheckPenalty(penalty);
	}

	private void setArmorType(String type)
	{
		armorType = type;
		
		return;
	}
	
	private String getArmorType()
	{
		return armorType;		
	}
	
	private void setArmorBonus(int bonus)
	{
		armorBonus = bonus;
		
		return;
	}
	
	private int getArmorBonus()
	{
		return armorBonus;		
	}
	
	private void setArmorCheckPenalty(int penalty) 
	{
		armorCheckPenalty = penalty;
		
		return;
	}
	
	private int getArmorCheckPenalty() 
	{
		return armorCheckPenalty;		
	}
}
