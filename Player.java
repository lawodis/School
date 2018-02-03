/*
 * Jack Wood
 * 
 * This Class defines the actions of a player playing poker, it is used for the user and the computer
 */
import java.awt.Color;
import java.awt.Graphics;

public class Player
{
	private Player opponent;
	
	private Hand hand;	
	
	private int xHandPosition,
				yHandPosition;
	
	public Player(int x, int y)
	{
		hand = null;
		
		setHandPosition(x,y);
	}
	
	public void cardFromDealer(Card newCard)
	{		
		if(hand == null)
		{
			hand = new Hand(this);
		}		
		
		hand.add(newCard);
	}
	
	public void flipCards()
	{
		hand.flipCards();
	}
	
	public void setOpponent(Player opponent)
	{
		this.opponent = opponent;
	}
	
	public Player getOpponent()
	{
		return opponent;
	}
	
	public void rankHand()
	{
		hand.rankHand();		
	}
	
	public String getHandName()
	{
		return hand.getHandName();
	}
	
	public int getHandRank()
	{
		return hand.getHandRank();
	}
	
	public Card fold()
	{
		Card hand = this.hand.getHand();
		
		this.hand = null;
				
		return hand;
	}
	
	public void setHandPosition(int x, int y)
	{
		xHandPosition = x;
		
		yHandPosition = y;
	}
	
	public int getXHandPosition()
	{
		return xHandPosition;
	}
	
	public int getYHandPosition()
	{
		return yHandPosition;
	}
	
	public void paint(Graphics pane)
	{
		if(hand != null)
		{
			hand.paint(pane);
		}		
	}
}
