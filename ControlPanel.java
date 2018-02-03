//Jack Wood

import java.awt.*;
import java.awt.event.MouseEvent;

public class ControlPanel extends FourthWall
{
	private static final String TITLE = "Dungeon Master Control Panel";
	
	private static final int WINDOW_X_COORDINATE = 100, WINDOW_Y_COORDINATE = 100,
							 WINDOW_WIDTH = 300, WINDOW_HEIGHT = 400,
							 BUTTON_WIDTH = 100, BUTTON_HEIGHT = 25,
							 ADD_NEW_DICE_X = 25, ADD_NEW_DICE_Y = 50,
							 DELETE_DICE_X = 25, DELETE_DICE_Y = 100,
							 ROLL_DICE_X = 25, ROLL_DICE_Y = 150,
							 ADD_NEW_PLAYER_X = 275, ADD_NEW_PLAYER_Y = 50,
							 DELETE_PLAYER_X = 275, DELETE_PLAYER_Y = 100,
							 VIEW_PLAYER_X = 275, VIEW_PLAYER_Y = 150,
							 ADD_NEW_NPC_X = 150, ADD_NEW_NPC_Y = 50,
							 DELETE_NPC_X = 150, DELETE_NPC_Y = 100,
							 VIEW_NPC_X = 150, VIEW_NPC_Y = 150,
							 START_ENCOUNTER_X = 150, START_ENCOUNTER_Y = 200;
							 
	private Dice[] dicePouch;
	
	private Player[] party;
	
	private NPC[] opponent;
	
	private int dice,
				players,
				opponents;
	
	private Abutton addNewDice, deleteDice, rollDice,
					addNewPlayer, deletePlayer, viewPlayer,
					addNewNPC, deleteNPC, viewNPC,
					startEncounter;
	
	private FourthWall questEncounter,
	   				   questCombat;
	
	
	public ControlPanel()
	{
		super(TITLE, WINDOW_X_COORDINATE, WINDOW_Y_COORDINATE, WINDOW_HEIGHT, WINDOW_WIDTH);
		
		addMouseListener(this);
		
		dice = players = opponents = 0;
		
		dicePouch = new Dice[dice];
		party = new Player[players];
		opponent = new NPC[opponents];
		
		addNewDice = new Abutton("Add New Dice",
				   Color.red,
				   ADD_NEW_DICE_X, ADD_NEW_DICE_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		addNewPlayer = new Abutton("Add New Player",
				   Color.red,
				   ADD_NEW_PLAYER_X, ADD_NEW_PLAYER_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		addNewNPC = new Abutton("Add New NPC",
				   Color.red,
				   ADD_NEW_NPC_X, ADD_NEW_NPC_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		deleteDice = new Abutton("Delete Dice",
				   Color.red,
				   DELETE_DICE_X, DELETE_DICE_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		deletePlayer = new Abutton("Delete Player",
				   Color.red,
				   DELETE_PLAYER_X, DELETE_PLAYER_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		deleteNPC = new Abutton("Delete NPC",
				   Color.red,
				   DELETE_NPC_X, DELETE_NPC_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		rollDice = new Abutton("Roll Dice",
				   Color.red,
				   ROLL_DICE_X, ROLL_DICE_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		viewPlayer = new Abutton("View Player",
				   Color.red,
				   VIEW_PLAYER_X, VIEW_PLAYER_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		viewNPC = new Abutton("View NPC",
				   Color.red,
				   VIEW_NPC_X, VIEW_NPC_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		startEncounter = new Abutton("Start Encounter",
				   Color.red,
				   START_ENCOUNTER_X, START_ENCOUNTER_Y,
				   BUTTON_WIDTH, BUTTON_HEIGHT);
		
		
		
		repaint();			
	}
	
	public void paint(Graphics pane)
	{
		if(addNewDice != null)
		{
			addNewDice.paint(pane);
		}
		
		if(addNewPlayer != null)
		{
			addNewPlayer.paint(pane);
		}
		
		if(addNewNPC != null)
		{
			addNewNPC.paint(pane);
		}
		
		if(deleteDice != null)
		{
			deleteDice.paint(pane);
		}
		
		if(deletePlayer != null)
		{
			deletePlayer.paint(pane);
		}
		
		if(deleteNPC != null)
		{
			deleteNPC.paint(pane);
		}
		
		if(rollDice != null)
		{
			rollDice.paint(pane);
		}
		
		if(viewPlayer != null)
		{
			viewPlayer.paint(pane);
		}
		
		if(viewNPC != null)
		{
			viewNPC.paint(pane);
		}
		
		if(startEncounter != null)
		{
			startEncounter.paint(pane);
		}
	}
	
	public void check()
	{
		if(addNewDice.isInside(lastX, lastY))
		{
			dice++;
			
			Dice[] temp = new Dice[dice];
			
			for(int i = 0; i < dice - 1; i++)
			{
				temp[i] = dicePouch[i];
			}
			
			temp[dice - 1] = new Dice();
			
			dicePouch = temp;
		}
		if(addNewPlayer.isInside(lastX, lastY))
		{
			players++;
			
			Player[] temp = new Player[players];
			
			for(int i = 0; i < players - 1; i++)
			{
				temp[i] = party[i];
			}
			
			temp[players - 1] = new Player();
			
			party = temp;
		}
		if(addNewNPC.isInside(lastX, lastY))
		{
			opponents++;
			
			NPC[] temp = new NPC[opponents];
			
			for(int i = 0; i < opponents - 1; i++)
			{
				temp[i] = opponent[i];
			}
			
			temp[opponents - 1] = new NPC();
			
			opponent = temp;
		}
		if(startEncounter.isInside(lastX, lastY))
		{
			questEncounter = new EncounterDisplay();
			questCombat = new CombatController(party, opponent, WINDOW_X_COORDINATE + WINDOW_WIDTH, WINDOW_Y_COORDINATE);	
		}	
		
		repaint();
	}
	
	public void flipWhenInside()
	{
		
	}
}
