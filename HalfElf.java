//Jack Wood

public class HalfElf extends Character 
{
	private static final String RACE = "half elf",//half elves are obviously identified as half elves
								SIZE = "medium";//half elves are classified as medium sized creatures
	
	private static final int SPEED = 30;//half elves have a base land speed of 30 feet per round
	
	public HalfElf()
	{
		super();
		
		this.setCharacterRace(RACE);
		
		this.setSize(SIZE);
		
		this.setSpeed(SPEED);
	}
	
}