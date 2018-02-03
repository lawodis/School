/*
 * Jack Wood
 * 
 * Each character in D&D has 6 ability scores. When playing the game a player would roll 4 six sided dice, discount
 * the lowest roll, and add the remaining 3 rolls together for each score.
 * 
 * This class allows for this to be done and then receive the ability score to be stored, or to simulate the rolls
 * for the user
 */
import java.util.Scanner;

public class AbilityScore
		implements AbilityScoreOutline
{	
	private String scoreName;//this can only be strength, dexterity, constitution, wisdom, intelligence, or charisma
	
	private int baseScore,//this is the value that can be improved upon by the player when leveling up
				modifier;//this value is based on the base score and is applied to different actions that relate to 
							//the ability
	private final int SCORE_DICE = 4,//each ability score uses 4 dice
					  DIE_SIDES = 6;//and each of these dice has 6 sides
			
	public AbilityScore()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("An ability score has been created without a name.\n\nPlease enter a name for this score:");
		
		setScoreName(keyboard.nextLine());
		
		rollNewScore();//an ability score has no purpose until its been rolled		
		
		return;
	}
	
	public AbilityScore(String name)
	{
		if(isValidName(name))
		{
			setScoreName(name);
		}
		
		rollNewScore();//an ability score has no purpose until its been rolled
		
		return;
	}
	
	public boolean isValidName(String name)
	{
		return (name == STRENGTH ||
				name == DEXTERITY ||
				name == CONSTITUTION ||
				name == WISDOM ||
				name == INTELLIGENCE ||
				name == CHARISMA);
	}
	
	public void setScoreName(String name)
	{
		scoreName = name;
		
		return;
	}
	
	public String getScoreName()
	{
		return scoreName;
	}
	
	public void rollNewScore()
	{
		Dice[] sixSided = new Dice[SCORE_DICE];//creates an array of four dice to roll the score
		
		int[] roll = new int[SCORE_DICE];//creates an array of four integers to store the rolls of the dice
		
		int lowestRoll = 0;//this will store the lowest roll so that can just be subtracted from the total of the
						   //rolls I initialized it here because eclipse didn't like me putting the other
						   //initialization in an if statement
		baseScore = 0;//baseScore is initialized at zero so we can use += in the for loop
		
		for(int i = 0; i <= 3; i++)
		{
				sixSided[i] = new Dice(DIE_SIDES);//creates 1 of the 4 six sided dice
			
				roll[i] = sixSided[i].rollDie();//rolls the dice and stores it as 1 of the 4 integers
		
				baseScore += roll[i];//adds the roll to the total of all the rolls so far
				
				if(i == 0)
				{//if i is 0 then we're looking at the first element so we can set lowest roll to the ith element
					lowestRoll = roll[i];//original initialization that eclipse didn't like, silly eclipse doesn't
											//know java very well
				}
				else if(roll[i] < lowestRoll)
				{//other wise we can compare the ith element to lowestRoll	
					lowestRoll = roll[i];//and if that element is less than lowestRoll then it becomes the new 
											//lowest roll
				}
		}
		
		baseScore -= lowestRoll;//now baseScore is the total of the rolls and lowestRoll is the lowest of the four 
									//rolls, so we can subtract lowestRoll from the baseScore
		setModifier();
		
		return;
	}
	
	public void setModifier()
	{
		modifier = (baseScore - 10) / 2;//this is the simple relationship between the base score and the modifier that
											// can be seen in the chart in a Player's Handbook
		return;
	}
	
	public void setBaseScore(int score)
	{
		baseScore = score;
		
		setModifier();
		
		return;
	}//every four levels a character gains allows the player to add one point to an ability score, there are also
		//unfortunate circumstances where a character's ability score can be lowered
	
	public int getBaseScore()
	{
		return baseScore;
	}//this will mostly come into play just to have the score displayed some how although it could probably be used as
		// a part of a call like this: setBaseScore(getBaseScore() + 1) if the character chooses to improve that score
		// when they level up
	
	public int getModifier()
	{
		return modifier;
	}//many character's abilities need to have an ability modifier added in before they are complete 
}
