/*
 * Jack Wood
 * 
 * The purpose of this class is to define the applet
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Game implements MouseListener
{	
	private Applet theApplet;
	/*
	 * These buttons are the user's controls. The applet will toggle between showing the deal button and the play and fold buttons
	 */
	private Abutton dealButton,
					playButton,
					foldButton;
	/*
	 * The dealer will handle the cards
	 */
	private Dealer theDealer;
	
	private final int DELTA = 16;			//	Spacing for the buttons and elements
	/*
	 * These will keep track of where the mouse has been clicked
	 */
	private int lastX,
				lastY;	
	/*
	 * The game is constructed with an applet
	 */
	public Game(Applet mainProgram)
	{
		theApplet = mainProgram;		

		theApplet.addMouseListener(this);		//	To check on the mouse

		int x = DELTA;
		int y = DELTA;
		
		dealButton = new Abutton("Deal", Color.green, x, y);
		y += Abutton.BUTTON_HEIGHT * 1.25;		
		/*
		 * We instatiate the dealer so it can start creating and manipulating the deck
		 */
		theDealer = new Dealer();		
	}
	/*
	 * if the mouse is clicked we want to check where it clicked
	 * 
	 */
	public void mouseClicked(MouseEvent event)
	{
		check();		
	}	
	/*
	 * this method will let the buttons know to change to their active color if they've been clicked
	 * 
	 */
	public void mousePressed(MouseEvent event)
	{
		lastX = event.getX();
		lastY = event.getY();
			
		flipWhenInside();
	}
	/*
	 * this method will let the buttons know to change to their regular color after they've been released
	 * 
	 */
	public void mouseReleased(MouseEvent event)
	{
		flipWhenInside();
	}
	/*
	 * this method checks if a mouse click was inside a button and changes between the active and default colors	
	 */
	private void flipWhenInside()
	{
		if (dealButton != null && dealButton.isInside(lastX, lastY))
		{
			dealButton.flip();
		}			
		else if (playButton != null && playButton.isInside(lastX, lastY))
		{
			playButton.flip();
		}		
		else if (foldButton != null && foldButton.isInside(lastX, lastY))
		{
			foldButton.flip();
		}
		
		theApplet.repaint();
	}
	/*
	 * This method handles what happens when the different buttons are clicked
	 */
	private void check()
	{
		if(dealButton != null && dealButton.isInside(lastX, lastY))
		{//if dealButton is instantiated and has been clicked
			dealButton = null;
			//then it will go away
			theDealer.deal();
			//and the dealer will deal the cards
			theApplet.repaint();
			//and the applet will repaint itself
			int x = DELTA;
			int y = DELTA;
						
			playButton = new Abutton("Play", Color.green, x, y);
			//playButton is instantiated
			y += Abutton.BUTTON_HEIGHT * 1.5;
			
			foldButton = new Abutton("Fold", Color.red, x, y);
			//foldButton is instantiated
		}
		else if(playButton != null && playButton.isInside(lastX, lastY))
		{//if playButton is instantiated and has been clicked
			theDealer.reveal();
			//the dealer will reveal the opponents hand and who has won
			playButton = foldButton = null;
			//playButton and foldButton will go away			
			int x = DELTA;
			int y = DELTA;
			//dealButton is instantiated again
			dealButton = new Abutton("Deal", Color.green, x, y);			
		}
		else if(foldButton != null && foldButton.isInside(lastX, lastY))
		{//if foldButton is instantiated and has been clicked
			theDealer.clear();
			//the dealer will clear the cards it dealt
			playButton = foldButton = null;
			//playButton and foldButton will go away
			int x = DELTA;
			int y = DELTA;
			//dealButton is instantiated again
			dealButton = new Abutton("Deal", Color.green, x, y);			
		}
		//the applet will repaint itself no matter what has been clicked
		theApplet.repaint();
	}
	
	public void paint(Graphics pane)
	{	//any buttons that have been instantiated will be painted	
		if(dealButton != null)
		{
			dealButton.paint(pane);			
		}
		if(playButton != null)
		{
			playButton.paint(pane);
		}
		if(foldButton != null)
		{
			foldButton.paint(pane);
		}		
		//if the dealer has been instantiated it will be painted
		if(theDealer != null)
		{
			theDealer.paint(pane);
		}		
	}
	//these methods are not necessary	
	public void mouseEntered(MouseEvent event){}		
	public void mouseExited(MouseEvent event){}
}
