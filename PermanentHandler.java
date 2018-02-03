
public interface PermanentHandler
{
	public void setCastingCost(Mana[] cost);
	
	public Mana[] getCastingCost();
	
	public void tap();
	
	public void untap();
}
