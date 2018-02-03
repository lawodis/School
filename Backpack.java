
public class Backpack extends Gear
{
	private static final String GEAR_TYPE = "backpack";
	
	private static final int[] COST = new int[3];
	
	private Item[] itemInBackpack;
	
	private int itemsInBackpack;

	public Backpack()
	{
		this("");
	}

	public Backpack(String name)
	{
		super(name, GEAR_TYPE, COST);
		
		return;
	}
	
	public void addItem(Item newItem)
	{
		Item[] oldItemInBackpack = itemInBackpack;
				
		for(int i = 0; i < itemsInBackpack; i++)
		{
			itemInBackpack[i] = oldItemInBackpack[i];
		}
		
		itemInBackpack[itemsInBackpack++] = newItem;
	}
}