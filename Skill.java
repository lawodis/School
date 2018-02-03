//Jack Wood

public class Skill 
{
	private String name;
	private int ranks, modifier;
	private AbilityScore score;
	
	public Skill(String name, AbilityScore score)
	{
		setName(name);
		
		this.score = score;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setModifier()
	{
		modifier = ranks + score.getModifier();
	}
	
	public int getModifier()
	{
		return modifier;
	}
	
	public void addRanks(int ranks)
	{
		this.ranks += ranks;
		
		setModifier();
	}
}
