import java.awt.Color;
import java.awt.Graphics;

/*
 * Jack Wood
 * 
 * This class will function as a node of a linked list.
 */
public class Card implements CardHandler
{
	private String cardRank,//each card has a rank
				   cardSuit;//and a suit
	
	private char cardCharacter;
	
	private int cardRankNumber,//each rank corresponds to a number
				cardSuitNumber;

	protected int xStartPosition,
				  yStartPosition,
				  xSuitPosition,
				  ySuitPosition,
				  xCharacterPosition,
				  yCharacterPosition;
	
	protected boolean faceUp;
	
	private Card previous,//this points to the card "on top" this card, if this card is at the top this will be null
				 next;//this points to the card "underneath" this card, if this card is at the bottom this will be null 
	/*
	 * This is a simple constructor when we don't care what card we create
	 */
	public Card()
	{
		drawNewCard();//A card can be drawn at random if we don't care what it is
	}
	/*
	 * This constructor receives a rank and a suit for when we care which card we create
	 */
	public Card(String rank, String suit)
	{		
		setCardRank(rank);//so this will set the rank to what we want
				
		setCardSuit(suit);//and the suit to what we want
		
		setFaceUp(false);
	}
	
	public void setPrevious(Card prev)
	{
		previous = prev;
	}
	
	public Card getPrevious()
	{
		return previous;
	}
	/*
	 * This receives what the card "underneath" this card should be
	 */
	public void setNext(Card next)
	{
		this.next = next;//and set our instance variable, could be null
	}
	/*
	 * This returns the card "underneath" this card 
	 */
	public Card getNext()
	{
		return next;//like I said. If its null we know this is the last card
	}		
	
	public void setFaceUp(Boolean up)
	{
		faceUp = up;
	}
	
	public boolean getFaceUp()
	{
		return faceUp;
	}
		
	public void setStartingPosition(int x, int y)
	{
		xStartPosition = x;
		
		yStartPosition = y;
		
		xSuitPosition = xStartPosition + CARD_WIDTH / 3;
		
		yCharacterPosition = ySuitPosition = yStartPosition + CARD_HEIGHT / 2;
		
		xCharacterPosition = xStartPosition + CARD_WIDTH / 2 - 3;
	}
	/*
	 * This will randomly set the rank and suit of the card without concern for what other cards there might be
	 */
	public void drawNewCard()
	{
		setCardRankNumber((int) Math.random() * RANKS_IN_A_SUIT + 1);//There are only so many ranks in a suit and we want one at random
		
		setCardSuitNumber((int) Math.random() * SUITS_IN_A_DECK);//There are only so many suits in a deck and we want one at random as well
	}
	/*
	 * This handles what we want to happen if we print a card 
	 */
	public String toString()
	{
		return getCardName();
	}
	/*
	 * This returns the name of the card
	 */
	public String getCardName()
	{
		return getCardRank() + " of " + getCardSuit();//ex: Ace of Spades (good song)
	}
	/*
	 * Sets the rank of the card to what we want
	 */
	public void setCardRank(String rank)
	{		
		cardRank = rank;//This sets the String value of the rank		
		
		if(rank != translateRank(getCardRankNumber()))
		{
			setCardRankNumber(translateRank(rank));//and this sets the numeric value to agree with the String we just received
		}	
	}
	/*
	 * This returns the string value of the card's rank
	 */
	public String getCardRank()
	{
		return cardRank;
	}
	/*
	 * sets the suit of
	 */
	public void setCardSuit(String suit)
	{
		cardSuit = suit;
		
		if(suit != translateSuit(getCardSuitNumber()))
		{
			setCardSuitNumber(translateSuit(suit));
		}		
	}
	
	public String getCardSuit()
	{
		return cardSuit;
	}
	
	public void setCardRankNumber(int rank)
	{
		cardRankNumber = rank;		
		
		if(rank != translateRank(getCardRank()))
		{
			setCardRank(translateRank(rank));			
		}
		
		setCardCharacter(rank);
	}
	
	public int getCardRankNumber()
	{
		return cardRankNumber;
	}
	
	public void setCardCharacter(int rank)
	{
		if(rank >= TWO_VALUE && rank <= NINE_VALUE)
		{
			cardCharacter = ("" + cardRankNumber).charAt(0);
		}
		else if(rank == TEN_VALUE)
		{
			cardCharacter = "X".charAt(0);
		}		
		else
		{
			cardCharacter = cardRank.toUpperCase().charAt(0);
		}
	}
	
	public char getCardCharacter()
	{
		return cardCharacter;
	}
	
	protected void paintCardCharacter(Graphics pane)
	{
		pane.setColor(Color.white);
		
		pane.drawString("" + cardCharacter, xCharacterPosition, yCharacterPosition);			
	}
	
	public void setCardSuitNumber(int suit)
	{
		cardSuitNumber = suit;
		
		if(suit != translateSuit(getCardSuit()))
		{
			setCardSuit(translateSuit(suit));
		}
	}
	
	public int getCardSuitNumber()
	{
		return cardSuitNumber;
	}
	
	public int translateRank(String rank)
	{
		int translation;
				
		if(rank == ACE)
		{
			translation = ACE_LOW_VALUE;
		}
		else if(rank == TWO)
		{
			translation = TWO_VALUE;
		}
		else if(rank == THREE)
		{
			translation = THREE_VALUE;
		}
		else if(rank == FOUR)
		{
			translation = FOUR_VALUE;
		}
		else if(rank == FIVE)
		{
			translation = FIVE_VALUE;
		}
		else if(rank == SIX)
		{
			translation = SIX_VALUE;
		}
		else if(rank == SEVEN)
		{
			translation = SEVEN_VALUE;
		}
		else if(rank == EIGHT)
		{
			translation = EIGHT_VALUE;
		}
		else if(rank == NINE)
		{
			translation = NINE_VALUE;
		}
		else if(rank == TEN)
		{
			translation = TEN_VALUE;
		}
		else if(rank == JACK)
		{
			translation = JACK_VALUE;
		}
		else if(rank == QUEEN)
		{
			translation = QUEEN_VALUE;
		}
		else if(rank == KING)
		{			
			translation = KING_VALUE;
		}
		else
		{
			translation = -1;
		}
				
		return translation;
	}
	
	public String translateRank(int rank)
	{
		String translation;		
		
		if(rank == ACE_LOW_VALUE || rank == ACE_HIGH_VALUE)
		{
			translation = ACE;
		}
		else if(rank == TWO_VALUE)
		{
			translation = TWO;
		}
		else if(rank == THREE_VALUE)
		{
			translation = THREE;
		}
		else if(rank == FOUR_VALUE)
		{
			translation = FOUR;
		}
		else if(rank == FIVE_VALUE)
		{
			translation = FIVE;
		}
		else if(rank == SIX_VALUE)
		{
			translation = SIX;
		}
		else if(rank == SEVEN_VALUE)
		{
			translation = SEVEN;
		}
		else if(rank == EIGHT_VALUE)
		{
			translation = EIGHT;
		}
		else if(rank == NINE_VALUE)
		{
			translation = NINE;
		}
		else if(rank == TEN_VALUE)
		{
			translation = TEN;
		}
		else if(rank == JACK_VALUE)
		{
			translation = JACK;
		}
		else if(rank == QUEEN_VALUE)
		{
			translation = QUEEN;
		}
		else if(rank == QUEEN_VALUE)
		{
			translation = KING;			
		}
		else
		{
			translation = "error";
		}
		
		return translation;
	}
	
	public int translateSuit(String suit)
	{
		int translation;
		
		if(suit == SPADES)
		{
			translation = SPADES_VALUE;
		}
		else if(suit == HEARTS)
		{
			translation = HEARTS_VALUE;
		}
		else if(suit == DIAMONDS)
		{
			translation = DIAMONDS_VALUE;
		}
		else
		{
			translation = CLUBS_VALUE;
		}		
		
		return translation;
	}
	
	public String translateSuit(int suit)
	{
		String translation;
		
		if(suit == SPADES_VALUE)
		{
			translation = SPADES;
		}
		else if(suit == HEARTS_VALUE)
		{
			translation = HEARTS;
		}
		else if(suit == DIAMONDS_VALUE)
		{
			translation = DIAMONDS;
		}
		else
		{
			translation = CLUBS;
		}	
		
		return translation;
	}
	
	public void paint(Graphics pane)
	{
		pane.setColor(Color.black);
		
		pane.fillRoundRect(xStartPosition, yStartPosition, CARD_WIDTH, CARD_HEIGHT, FIVE_VALUE, FIVE_VALUE);
		
		pane.setColor(Color.white);
		
		pane.fillRoundRect(xStartPosition + 4, yStartPosition + 4, CARD_WIDTH - 8, CARD_HEIGHT - 8, FIVE_VALUE, FIVE_VALUE);
		
		if(!faceUp)
		{
			pane.setColor(Color.black);
			
			pane.fillRoundRect(xStartPosition + 8, yStartPosition + 8, CARD_WIDTH - 16, CARD_HEIGHT - 16, FIVE_VALUE, FIVE_VALUE);
		}
	}
}
