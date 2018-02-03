/************************************************************************************
 * Parent class of something to be tracked by a data structure                      *
 ************************************************************************************/
public class Item
{
	private String name;
	
	public Item()
	{
		this("");
	}
	
	public Item(String name)
	{
		name(name);
	}
	
	public void name(String name)
	{
		this.name = name;
	}
	
	public String name()
	{
		return name;
	}
}