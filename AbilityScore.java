
public class AbilityScore implements ScoreRoller
{
	private String scoreName;
	
	private int scoreValue;
	
	public AbilityScore(String name)
	{
		setScoreName(name);
		
		setScoreValue(0);
	}
	
	public void setScoreName(String name)
	{
		scoreName = name;
	}
	
	public void roll()
	{
		int[] roll = new int[NUMBER_OF_DICE];
		
		int lowestRoll = SIDES_OF_SCORE_DICE,
			totalRoll = 0;
		
		Die sixSided = new Die(lowestRoll);		
		
		for(int i = 0; i < NUMBER_OF_DICE; i++)
		{
			sixSided.roll();
			
			totalRoll += roll[i] = sixSided.readDie();
			
			if(roll[i] < lowestRoll)
			{
				lowestRoll = roll[i];
			}
		}
		
		setScoreValue(totalRoll - lowestRoll);
	}
	
	public void setScoreValue(int score)
	{
		this.scoreValue = score;
	}
	
	public int getScoreValue()
	{
		return scoreValue;
	}
	
	public int getModifier()
	{
		return (scoreValue - 10) / 2; 
	}
}
