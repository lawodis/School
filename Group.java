
public class Group
{
	private String groupName;
	
	private int numberOfItems;
	
	private Object[] item;
	
	public Group(String name)
	{
		setGroupName(name);
		
		item = new Object[numberOfItems = 0];
	}
	
	public void setGroupName(String name)
	{
		groupName = name;
	}
	
	public String getGroupName()
	{
		return groupName;
	}
	
	public void add(Object newItem)
	{
		Object[] oldItem = item;
		
		item = new Object[numberOfItems + 1];
		
		for(int i = 0; i < numberOfItems; i++)
		{
			item[i] = oldItem[i];
		}
		
		item[numberOfItems++] = newItem;		
	}
	
	public void remove(Object item)
	{		
		Object[] oldItem = this.item;
		
		this.item = new Object[--numberOfItems];
		
		boolean itemFound = false;
		
		for(int i = 0, j = 0; i < numberOfItems; i++, j++)
		{
			if(itemFound = this.item[i].equals(item))
			{
				j++;
			}
			
			this.item[i] = oldItem[j];
		}
		
		if(!itemFound)
		{
			this.item = oldItem;
		}
	}
}
