//Jack Wood

public class Human extends Character 
{
	private static final String RACE = "human",//humans are obviously identified as humans
								SIZE = "medium";//humans are classified as medium sized creatures
	
	private static final int SPEED = 30,//humans have a base land speed of 30 feet per round
							 ADULTHOOD = 15;
	
	public Human()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);		
	}
	
	public void randomAge()
	{
		if(characterClass.getClassName().equals(BARBARIAN))
	}
}
