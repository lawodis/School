//Jack Wood

public class Dwarf extends Character 
{
	private static final String RACE = "dwarf",//dwarves are obviously identified as dwarves
								SIZE = "medium";//dwarves are classified as medium sized creatures
	
	private static final int SPEED = 20;//humans have a base land speed of 20 feet per round
	
	public Dwarf()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.abilityAdjustment();
	}
	
	public void abilityAdjustment()
	{
		constitution.setBaseScore(constitution.getBaseScore() + 2);
		charisma.setBaseScore(charisma.getBaseScore() - 2);
	}
}