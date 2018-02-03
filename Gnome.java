//Jack Wood

public class Gnome extends Character 
{
	private static final String RACE = "gnome",//gnomes are obviously identified as gnomes
								SIZE = "small";//gnomes are classified as small sized creatures
	
	private static final int SPEED = 20;//gnomes have a base land speed of 20 feet per round
	
	public Gnome()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);
		
		
	}
	
	public void abilityAdjustment()
	{
		constitution.setBaseScore(constitution.getBaseScore() + 2);
		strength.setBaseScore(strength.getBaseScore() - 2);
	}
	
}