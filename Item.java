//Jack Wood

public class Item
{
	private String name;
	
	private String itemType;
	
	private double weight;
	
	private int[] cost = new int[3];
	
	public Item()
	{
		return;
	}
	
	public Item(String name, String type, double weight, int[] cost)
	{
		setName(name);
		
		setItemType(type);
		
		setWeight(weight);
		
		setCost(cost);
		
		return;
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
	
	public void setItemType(String type)
	{
		itemType = type;
		
		return;
	}
	
	public String getItemType()
	{
		return itemType;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
		
		return;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setCost(int[] cost)
	{
		this.cost = cost;
		
		return;
	}
	
	public int[] getCost()
	{
		return cost;
	}
}
