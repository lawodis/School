//Jack Wood

import java.util.Scanner;

public class Player 
{
	private String playerName;
	
	private Character playerCharacter;
	
	private Scanner keyboard = new Scanner(System.in);
	
	private static final String HUMAN = "human",
						 		ELF = "elf",
						 		DWARF = "dwarf",
						 		GNOME = "gnome",
						 		HALFLING = "halfling",
						 		HALF_ELF = "half elf",
						 		HALF_ORC = "half orc";
	
	public Player()
	{
		System.out.print("Enter Player's name here:");
			
		setPlayerName(keyboard.nextLine());			

		createNewCharacter();
	}
	
	public Player(String name)
	{
		setPlayerName(name);
		
		createNewCharacter();
	}
	
	public void setPlayerName(String name)
	{
		playerName = name.trim();
				
		return;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public String getCharacterName()
	{
		return this.playerCharacter.getCharacterName();
	}
	
	public void createNewCharacter()
	{
		System.out.print("\nPlease enter one of the following for the character's race:\nhuman, elf, dwarf, gnome," +
						 " halfling, half elf, half orc\n\n");
		
		String race = keyboard.nextLine();
		
		if(race.equals(HUMAN))
		{
			createNewHuman();
		}
		else if(race.equals(ELF))
		{
			createNewElf();
		}
		else if(race.equals(DWARF))
		{
			createNewDwarf();
		}
		else if(race.equals(GNOME))
		{
			createNewGnome();
		}
		else if(race.equals(HALFLING))
		{
			createNewHalfling();
		}
		else if(race.equals(HALF_ELF))
		{
			createNewHalfElf();
		}
		else if(race.equals(HALF_ORC))
		{
			createNewHalfOrc();
		}
		else
		{
			System.out.println("Please reenter the race to match one of the listed race");
			
			createNewCharacter();
		}
		
		return;
	}
	
	public void createNewHuman()
	{
		playerCharacter = new Human();
		
		return;
	}
	
	public void createNewElf()
	{
		playerCharacter = new Elf();
		
		return;
	}
	
	public void createNewDwarf()
	{
		playerCharacter = new Dwarf();
		
		return;
	}
	
	public void createNewGnome()
	{
		playerCharacter = new Gnome();
		
		return;
	}
	
	public void createNewHalfling()
	{
		playerCharacter = new Halfling();
		
		return;
	}
	
	public void createNewHalfElf()
	{
		playerCharacter = new HalfElf();
		
		return;
	}
	
	public void createNewHalfOrc()
	{
		playerCharacter = new HalfOrc();
		
		return;
	}
			
	public Character getPlayerCharacter()
	{
		return playerCharacter;
	}

	public int rollD20()
	{
		Dice d20 = new Dice();
		
		return d20.read();
	}
}
