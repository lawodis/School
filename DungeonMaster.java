/*
 * Jack Wood
 */
import java.util.Scanner;

public class DungeonMaster 
{
	public static void main(String[] args)
	{
		Campaign activeQuest = new Campaign();
		
		//buildParty();		
	}
	
	public static void buildParty()
	{
		Player[] party;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the size of the party here:");
		
		int partySize = keyboard.nextInt();
		
		party = new Player[partySize];
		
		for(int i = 0; i < partySize; i++)
		{
			party[i] = new Player();
		}
		
		for(int i = 0; i < partySize; i++)
		{
			System.out.println(party[i].getPlayerName() + ":     " + party[i].getCharacterName() + "    "
							   + party[i].getPlayerCharacter().getCharacterRace() + "\n"
							   + "    " + party[i].getPlayerCharacter().strength.getScoreName() + ":         "
							   + party[i].getPlayerCharacter().strength.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().strength.getModifier() + "\n"
							   + "    " + party[i].getPlayerCharacter().dexterity.getScoreName() + ":        "
							   + party[i].getPlayerCharacter().dexterity.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().dexterity.getModifier() + "\n"
							   + "    " + party[i].getPlayerCharacter().constitution.getScoreName() + ":    "
							   + party[i].getPlayerCharacter().constitution.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().constitution.getModifier() + "\n"
							   + "    " + party[i].getPlayerCharacter().wisdom.getScoreName() + ":           "
							   + party[i].getPlayerCharacter().wisdom.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().wisdom.getModifier() + "\n"
							   + "    " + party[i].getPlayerCharacter().intelligence.getScoreName() + ":     "
							   + party[i].getPlayerCharacter().intelligence.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().intelligence.getModifier() + "\n"
							   + "    " + party[i].getPlayerCharacter().charisma.getScoreName() + ":         "
							   + party[i].getPlayerCharacter().charisma.getBaseScore() + "    "
							   + party[i].getPlayerCharacter().charisma.getModifier() + "\n");
		}
		
		//FourthWall battleStats = new FourthWall("Battle Stats", 550, 250, 500, 200);
		
		int x, y;
		x = y = 100;
		
		for(int i = 0; i <= partySize - 1; i++)
		{
			/*battleStats//drawString(party[i].getPlayerName(), x, y);
			
			battleStats.drawString(party[i].getCharacterName(), x + 100, y);*/
		}
		
		return;
	}

}
