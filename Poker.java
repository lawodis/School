/*
 * Jack Wood
 * Final Project Prototype
 * 
 * This Project will allow the user to play
 * a game of poker against a computer opponent.
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Poker extends Applet
{
	private Game theGame;
	
	public void init()
	{
		theGame = new Game(this);
				
		//setBackground(new Color(189, 198, 222));//if you want a nice grey
		
		setSize(CardHandler.CARD_WIDTH * 10, CardHandler.CARD_HEIGHT * 3);
				
		setBackground(new Color(50, 125, 100));//This will make it look like we're playing on a green felt casino table
	}
	
	public void paint(Graphics pane)
	{
		if(theGame != null)
		{
			theGame.paint(pane);//if the game is there it needs to be painted
		}		
	}
}