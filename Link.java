/************************************************************************************
 * This will create a one way linked list of Nodes                                  *
 ************************************************************************************/
public class Link

extends Node
{
	private Node next;
	
	public Link()
	{
		this(null, null);
	}
	
	public Link(Item item)
	{
		this(item, null);
	}
	
	public Link(Node next)
	{
		this(null, next);
	}	
	
	public Link(Item item, Node next)
	{
		super(item);
		
		next(next);
	}
	
	public void next(Node next)
	{
		this.next = next;
	}
	
	public Node next()
	{
		return next;
	}
}