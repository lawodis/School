//Jack Wood

import java.awt.*;



public class CombatController extends FourthWall 
{
	private static final String TITLE = "Dungeon Master Combat Controler";
	
	private static final int WINDOW_X_COORDINATE = 100, WINDOW_Y_COORDINATE = 100,
							 WINDOW_WIDTH = 300, WINDOW_HEIGHT = 400,
							 BUTTON_WIDTH = 100, BUTTON_HEIGHT = 25;

	
	private Character[] combatant;
	
	private int combatants;
	
	private int[] rollForInitiative;
	
	private Abutton[] turnOrder;
	       
	
	public CombatController(Player[] party, NPC[] opponent, int x, int y)
	{
		super(TITLE, x + WINDOW_X_COORDINATE, y, (party.length + opponent.length + 4) * BUTTON_HEIGHT, WINDOW_WIDTH);
		
		combatants = party.length + opponent.length;
		
		combatant = new Character[combatants];
		
		turnOrder = new Abutton[combatants];
		
		Dice initiative = new Dice(20);
		
		for(int i = 0; i < combatants;)
		{
			for(int j = 0; j < opponent.length; i++, j++)
			{
				combatant[i] = opponent[j].getPlayerCharacter();
				
				rollForInitiative[i] = initiative.rollDie() + combatant[i].getInitiative();
			}
			
			for(int j = 0; j < party.length; i++, j++)
			{
				combatant[i] = party[j].getPlayerCharacter();
				
				rollForInitiative[i] = initiative.rollDie() + combatant[i].getInitiative();
			}
		}
		
		int switchesMade;
		
		do{
			switchesMade = 0;
		
			for(int i = 0; i < combatants - 1; i++)
			{
				if(rollForInitiative[i] > rollForInitiative[i + 1])
				{
					int temp = rollForInitiative[i];
					rollForInitiative[i] = rollForInitiative[i + 1];
					rollForInitiative[i + 1] = temp;
					
					Character dummy = combatant[i];
					combatant[i] = combatant[i + 1];
					combatant[i + 1] = dummy;
					
					switchesMade++;
				}
			}
		}while(switchesMade > 0);
		
		for(int i = 0; i < combatants; i++)
		{
			turnOrder[i] = new Abutton(combatant[i].getCharacterName(),
					   Color.red,
					   100, ((party.length + opponent.length + 4) * BUTTON_HEIGHT) - (BUTTON_HEIGHT * i),
					   BUTTON_WIDTH, BUTTON_HEIGHT);
		}
		
		repaint();
	}
	
	public void paint(Graphics pane)
	{
		for(int i = 0; i < combatants; i++)
		{
			if(turnOrder[i] != null)
			{
				turnOrder[i].paint(pane);
			}
		}
	}
}
