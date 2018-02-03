
public class Die implements Roller
{
	private int sidesOfDie,
			    valueOnDie;
	
	public Die()
	{
		this(SIDES_OF_CHECK_DICE);
	}
	
	public Die(int sides)
	{
		setSidesOfDie(sides);
		
		roll();
	}
	
	public void setSidesOfDie(int sides)
	{
		sidesOfDie = sides;
	}
	
	public int getSidesOfDie()
	{
		return sidesOfDie;
	}
	
	public void roll()
	{
		valueOnDie = (int) (sidesOfDie * Math.random() + LOWEST_VALUE);
	}
	
	public int readDie()
	{
		return valueOnDie;
	}
}
