//Jack Wood

import java.util.*;

public class Campaign 
{
	private Scanner keyboard = new Scanner(System.in);
	
	private String campaignName;
	
	private FourthWall questBuilder;
					   
	
	private Player[] player;
	
	private Character[] partyMember,
						nonPlayableCharacter,
						enemy;
	
	private int numberOfPlayers,
				partySize,
				nonPlayableCharacters,
				enemies;
	
	public Campaign()
	{
		questBuilder = new ControlPanel();
				
		return;
	}
	
	public void setCampaignName(String name)
	{
		campaignName = name;
		
		return;
	}
	
	public String getCampaignName()
	{
		return campaignName;
	}
	
	public void addPlayer()
	{
		numberOfPlayers++;
		
		if(player == null)
		{
			player = new Player[numberOfPlayers];
			
			player[0] = new Player();			
		}
		else
		{
			Player[] temp = new Player[numberOfPlayers];
			
			for(int i = 0; i < numberOfPlayers - 1; i++)
			{
				temp[i] = player[i];
			}
			
			temp[numberOfPlayers - 1] = new Player();
			
			player = temp;
		}
	}
	
	public void attack(Character attacker, Character defender)
	{
		boolean hit = false,
				critical = false;
		
		int attackRoll = attacker.player().rollD20();
		
		if(attackRoll >= attacker.criticalThreshold())
		{
			hit = true;
			
			critical = attacker.player().rollD20() >= defender.armorClass();
		}
		else if(attackRoll >= defender.armorClass())
		{
			hit = true;
		}
		
		if(hit)
		{
			int multiplier = 1,
				damage = 0;
						
			if(critical)
			{
				multiplier = attacker.criticalMultiplier();
			}
			
			for(int i = 0;
			
				i <= multiplier;
				
				i++)
			{
				damage += attacker.player().rollDamage();
			}
			
			defender.currentHitPoints(defender.currentHitPoints() - damage);
		}
	}
}
