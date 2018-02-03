
public class Character implements AbilityScoreHandler
{
	private String characterName;
	
	private AbilityScore strength,
						 dexterity,
						 constitution,
						 wisdom,
						 intelligence,
						 charisma;
	
	private AttackBonus baseAttack,
						grapple,
						melee,
						ranged;
	
	public Character()
	{
		
	}
	
	public void setCharacterName(String name)
	{
		characterName = name;
	}
	
	public String getCharacterName()
	{
		return characterName;
	}
	
	public void rollAbilityScores()
	{
		strength = new AbilityScore(STRENGTH);
		
		strength.roll();
		
		dexterity = new AbilityScore(DEXTERITY);
		
		dexterity.roll();
		
		constitution = new AbilityScore(CONSTITUTION);
		
		constitution.roll();
		
		wisdom = new AbilityScore(WISDOM);
		
		wisdom.roll();
		
		intelligence = new AbilityScore(INTELLIGENCE);
		
		intelligence.roll();
		
		charisma = new AbilityScore(CHARISMA);
		
		charisma.roll();
	}
}
