//Jack Wood

public class Halfling extends Character 
{
	private static final String RACE = "halfling",//halflings are obviously identified as halflings
								SIZE = "small";//halflings are classified as small sized creatures
	
	private static final int SPEED = 20;//halflings have a base land speed of 30 feet per round
	
	public Halfling()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);
	}
	
	public void abilityAdjustment()
	{
		dexterity.setBaseScore(dexterity.getBaseScore() + 2);
		strength.setBaseScore(strength.getBaseScore() - 2);
	}
}