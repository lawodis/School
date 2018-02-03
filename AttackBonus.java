
public class AttackBonus
{
	private int baseAttack;
	
	public AttackBonus()
	{
		
	}
	
	public void setBaseAttack(int base)
	{
		baseAttack = base;
	}
	
	public int getBaseAttack()
	{
		return baseAttack;
	}
	
	public int getNumberOfAttacks()
	{
		return baseAttack / 5 + 1;
	}
}
