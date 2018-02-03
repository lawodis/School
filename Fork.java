/************************************************************************************
 * This will create a tree of Nodes                                                 *
 ************************************************************************************/
public class Fork

extends Node
{
	private Node left,
				 right;
	
	public Fork()
	{
		this(null, null, null);
	}
	
	public Fork(Item item)
	{
		this(item, null, null);
	}
	
	public Fork(Node left)
	{		
		this(null, left, null);
	}
	
	public Fork(Item item, Node left)
	{
		this(item, left, null);
	}
	
	public Fork(Node left, Node right)
	{
		this(null, left, right);
	}
	
	public Fork(Item item, Node left, Node right)
	{
		super(item);
		
		left(left);
		
		right(right);
	}
	
	public void left(Node left)
	{
		this.left = left;
	}
	
	public Node left()
	{
		return left;	
	}
	
	public void right(Node right)
	{
		this.right = right;
	}
	
	public Node right()
	{
		return right;
	}
}