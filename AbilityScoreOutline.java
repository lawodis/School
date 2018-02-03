/*
 * Jack Wood
 * 
 * This interface outlines the proper implementation
 * of the AbilityScore
 */
public interface AbilityScoreOutline
{
	/*
	 * These are the only names that any instance of 
	 * an AbilityScore should have
	 */
	public final String STRENGTH = "strength",
						DEXTERITY = "dexterity",
						CONSTITUTION = "constitution",
						WISDOM = "wisdom",
						INTELLIGENCE = "intelligence",
						CHARISMA = "charisma";
	/*
	 * Each AbilityScroe will use 4 dice that have 6
	 * sides
	 */
	public final int SCORE_DICE = 4,
	  				 DIE_SIDES = 6;
	/*
	 * This method will be used to make sure that any
	 * String passed to name an AbilityScore is one of
	 * these Strings	
	 */
	public boolean isValidName(String name);
	/*
	 * This method will be used to set the value of
	 * of the instance String scoreName if it is a
	 * valid name
	 */
	public void setScoreName(String name);
	/*
	 * This method will return the value of the
	 * scoreName 
	 */
	public String getScoreName();
	/*
	 * This method will create 4 dice with 6 sides
	 * and use them to determine the value for the
	 * baseScore by rolling all of them, dropping
	 * the lowest roll and adding the remaining 3
	 * together. This value then gets passed to the
	 * setBaseScore method
	 */
	public void rollNewScore();
	/*
	 * This method receives an int and assigns it to
	 * the instance variable baseScore. This is used
	 * initially receiving a value that was either 
	 * rolled with real dice or the rollNewScore
	 * method. This method will later be called every
	 * 4 levels to raise one AbilityScore by 1
	 */
	public void setBaseScore(int score);
	/* This will mostly come into play just to have 
	 * the score displayed some how although it could
	 * probably be used as a part of a call like this:
	 * setBaseScore(getBaseScore() + 1) if the 
	 * character chooses to improve that score when 
	 * they level up
	 */
	public int getBaseScore();
	/*
	 * modifier = (baseScore - 10) / 2	
	 */
	public void setModifier();
	/*
	 * many character's abilities need to have an 
	 * ability modifier added in before they are 
	 * complete
	 */
	public int getModifier();
}
