//Jack Wood

public class HalfOrc extends Character 
{
	private static final String RACE = "half orc",//half orcs are obviously identified as half orcs
								SIZE = "medium";//half orcs are classified as medium sized creatures
	
	private static final int SPEED = 30;//half orcs have a base land speed of 30 feet per round
	
	public HalfOrc()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);
	}
	
	public void abilityAdjustment()
	{
		strength.setBaseScore(strength.getBaseScore() + 2);
		intelligence.setBaseScore(intelligence.getBaseScore() - 2);
		charisma.setBaseScore(charisma.getBaseScore() - 2);
	}
}