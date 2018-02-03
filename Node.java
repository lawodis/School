/************************************************************************************
 * This will point to an Item being tracked in a data structure                     *
 ************************************************************************************/
public class Node
{
	private Item item;
	
	public Node()
	{
		this(null);
	}
	
	public Node(Item item)
	{
		item(item);
	}
	
	public void item(Item item)
	{
		this.item = item;
	}
	
	public Item item()
	{
		return item;
	}
}