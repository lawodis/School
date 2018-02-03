/*
 * Jack Wood
 * 
 * This class handles a player's hand including the ranking that will tell the dealer which player has won
 */
import java.awt.Graphics;

public class Hand implements HandRanker
{
	private Player thePlayer;
	
	private Card hand;
	
	private String handName;
	
	private int handRank,
				kickerIndex;
	
	private int[] kicker;	
			
	public Hand(Player thePlayer)
	{
		setThePlayer(thePlayer);
		
		kicker = new int[5];
		
		kickerIndex = 0;
		
		for(int i = kickerIndex; i < FIVE_VALUE; kicker[i++] = kickerIndex){}
	}
	
	public void setThePlayer(Player thePlayer)
	{
		this.thePlayer = thePlayer;
	}
	
	public Player getThePlayer()
	{
		return thePlayer;
	}
	
	public void setHand(Card hand)
	{
		this.hand = hand;
	}
	
	public Card getHand()
	{
		return hand;
	}
	
	public void setHandRank(int rank)
	{
		handRank = rank;
	}
	
	public int getHandRank()
	{
		return handRank;
	}
	
	public int getKicker()
	{
		return kicker[kickerIndex++];
	}
	
	public void add(Card hand)
	{
		hand.setFaceUp(false);
		
		if(this.hand != null)
		{
			this.hand.setPrevious(hand);			
		}		
		
		hand.setNext(this.hand);
		
		this.hand = hand;
	}
	
	public void setHandName(String name)
	{
		handName = name;
	}
	
	public String getHandName()
	{
		return handName;
	}
	
	public void rankHand()
	{		
		AceHighOrLow();
		
		orderByRank();
				
		setHandName("");
		
		if(isFlush())
		{			
			if(isStrait())
			{
				setHandName(ROYAL_FLUSH + hand.getCardSuit() + "s");
				
				setHandRank(ROYAL_FLUSH_VALUE);
				
				kicker[kickerIndex] = FIVE_VALUE - hand.getCardSuitNumber();
			}
			else
			{
				AceHighOrLow();
				
				orderByRank();
				
				if(isStrait())
				{
					setHandName(hand.getCardRank() + " " + HIGH_CARD + STRAIT_FLUSH + hand.getCardSuit());
					
					setHandRank(STRAIT_FLUSH_VALUE);
					
					kicker[kickerIndex] = hand.getCardRankNumber();
					
					kicker[kickerIndex + 1] = FIVE_VALUE - hand.getCardSuitNumber();
				}
				else
				{
					setHandName(FLUSH + hand.getCardSuit());
					
					setHandRank(FLUSH_VALUE);
					
					kicker[kickerIndex] = FIVE_VALUE - hand.getCardSuitNumber();
				}
			}
		}
		else if(isFourOfAKind())
		{
			setHandName(FOUR_OF_A_KIND + handName);
		}
		else if(isThreeOfAKind())
		{
			Card start = hand;
			
			for(int i = 0; i < THREE_VALUE; i++, start = start.getNext()){}
						
			if(isPair())
			{
				setHandName(FULL_HOUSE + handName);
			}
			else
			{
				setHandName(THREE_OF_A_KIND + handName);
			}
		}
		else if(isStrait())
		{
			setHandName(hand.getCardRank() + " " + HIGH_CARD + STRAIT);
		}
		else if(isPair())
		{
			if(isPair())
			{
				setHandName(TWO_PAIR + handName);
			}
			else
			{
				setHandName(PAIR + handName);
			}
		}
		else
		{
			setHandName(hand.getCardRank() + " " + HIGH_CARD);
		}		
	}
	
	private void orderByRank()
	{		
			
	}	
	
	private Card removeHighCard(Card hand)
	{
		Card highest = hand;
				
		for(Card current = hand.getNext(); current != null; current = current.getNext())
		{
			if(current.getCardRankNumber() > highest.getCardRankNumber())
			{
				highest = current;
			}
		}
		
		Card before = highest.getPrevious(),
			 after = highest.getNext();
		
		if(before != null)
		{
			before.setNext(after);
		}
		
		if(after != null)
		{
			after.setPrevious(before);
		}
		
		return highest;
	}	
	
	public void AceHighOrLow()
	{
		for(Card current = hand; current != null; current = current.getNext())
		{
			if(current.getCardRankNumber() == ACE_LOW_VALUE)
			{
				current.setCardRankNumber(ACE_HIGH_VALUE);
			}
			else if(current.getCardRankNumber() == ACE_HIGH_VALUE)
			{
				current.setCardRankNumber(ACE_LOW_VALUE);
			}
		}
	}
	
	public boolean isFlush()
	{		
		boolean flush = true;
		
		int suit = hand.getCardSuitNumber();
		
		for(Card current = hand.getNext(); current != null && flush; current = current.getNext())
		{
			flush = (current.getCardSuitNumber() == suit);			
		}		
		
		return flush;
	}
	
	public boolean isFourOfAKind()
	{			
		return isOfKind(FOUR_VALUE);
	}	
	
	public boolean isOfKind(int set)
	{		
		return isOfKind(hand, set);
	}
	
	private boolean isOfKind(Card start, int set)
	{
		boolean kind = false;
		
		if(start != null)
		{
			int count = 1,
			rank = start.getCardRankNumber();
		
			String rankName = start.getCardRank();		
		
			for(Card current = start.getNext(); current != null; current = current.getNext())
			{
				if(current.getCardRankNumber() == rank)
				{
					count++;				
				}
			}
		
			if(count == set)
			{
				kind = true;
			
				if(handName.equals(""))
				{
					handName += rankName + "s"; 
				}
				else
				{
					handName += " and " + rankName + "s";
				}
			}
			else
			{
				kind = isOfKind(start.getNext(), set);
			}
		}
		
		return kind; 
	}
	
	public boolean isPair()
	{		
		return isOfKind(TWO_VALUE);
	}	
	
	public boolean isStrait()
	{		
		return isStrait(hand);
	}
	
	private boolean isStrait(Card start)
	{
		return start.getCardRankNumber() - 1 == (start.getNext()).getCardRankNumber() && isStrait(start.getNext());
	}
	
	public boolean isThreeOfAKind()
	{	
		return isOfKind(THREE_VALUE);
	}
	
	public void paint(Graphics pane)
	{
		Card current = hand;
		
		int i = 0;
		
		while(current != null)
		{
			current.setStartingPosition(thePlayer.getXHandPosition() + (100 * i), thePlayer.getYHandPosition());
			
			current.paint(pane);
			
			current = current.getNext();
			
			i++;
		}
	}

	public void flipCards()
	{
		for(Card current = hand; current != null;current.setFaceUp(!current.getFaceUp()), current = current.getNext()){}	
	}
	
	public String toString()
	{		
		return getHandName();
	}	
}
