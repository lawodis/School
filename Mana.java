
public class Mana implements ManaHandler
{
	private String color;
	
	public Mana()
	{
		this(COLORLESS);
	}
	
	public Mana(String color)
	{
		setColor(color);
	}
	
	public void setColor(String color)
	{
		this.color = color;		
	}
	
	public String getColor()
	{
		return color;
	}
}
