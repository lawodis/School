//Jack Wood

public class Elf extends Character 
{
	private static final String RACE = "elf",//elves are obviously identified as elves
								SIZE = "medium";//elves are classified as medium sized creatures
	
	private static final int SPEED = 30;//elves have a base land speed of 30 feet per round
	
	public Elf()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);
	}
	
	public void abilityAdjustment()
	{
		dexterity.setBaseScore(dexterity.getBaseScore() + 2);		
		constitution.setBaseScore(constitution.getBaseScore() - 2);		
	}
	
}