/*
 * Jack Wood
 * 
 * The purpose of this class is to store and manipulate the cards used in the game
 */
import java.awt.Color;
import java.awt.Graphics;

public class Deck implements CardHandler,
							 TranslateUtility,
							 DeckShuffler
{
	private Translator cardReader;//the card reader helps convert between the numbers and strings associated with each card
	
	private Card top;//this is a linked list of every card in the deck
					
	private Cut cutOfDeck;//when shuffling the deck is separated into cuts which are like smaller decks
	
	private int xStartPosition,//these position where the deck is painted on the applet
				yStartPosition;//
		
	public Deck()
	{						
		cardReader = new Translator();//a new translator is instantiated
		
		sort();// the deck is sorted
		
		xStartPosition = 8 * CARD_WIDTH;//the deck is painted far enough over for the cards to be painted later
		yStartPosition = CARD_WIDTH;
	}
	/*
	 * 
	 * this method doesn't really sort the deck, instead it populates it in order
	 */
	public void sort()
	{
		while(cardReader == null){}//card reader needs to be instantiated, deck will wait in case it isn't
		
		for(int suit = SPADES_VALUE; suit < SUITS_IN_A_DECK; suit++)
		{//a loop to control the suit
			for(int rank = ACE_LOW_VALUE; rank <= RANKS_IN_A_SUIT; rank++)
			{//and a loop to control the rank				
				if(suit == SPADES_VALUE)
				{//if the suit is spades then a new spade is created of the current rank										
					add(new Spade(translateRank(rank)));
				}
				else if(suit == HEARTS_VALUE)
				{//if the suit is hearts then a new heart is created of the current rank
					add(new Heart(translateRank(rank)));
				}
				else if(suit == DIAMONDS_VALUE)
				{//if the suit is diamonds then a new diamond is created of the current rank
					add(new Diamond(translateRank(rank)));
				}
				else
				{//otherwise a new club is created
					add(new Club(translateRank(rank)));					
				}
			}
		}
	}
	/*
	 * this method adds a card to the top of the deck
	 */
	public void add(Card top)
	{
		if(this.top != null)
		{//if there already was a card on top then it will point "up" to the new card
			this.top.setPrevious(top);			
		}
		//the new card will point "down" to the old top
		top.setNext(this.top);
		//and the new card will become the new top
		this.top = top;		
	}
		
	public void setToBottom(Card bottom)
	{
		Card top;
		
		for(top = this.top; top.getNext() != null; top = top.getNext()){}
		
		top.setNext(bottom);
	}
	
	public Card getBottom(Card top)
	{		
		Card bottom = top;
		
		while(bottom.getNext() != null)
		{			
			bottom = bottom.getNext();
		}		
		
		return bottom;
	}
	
	public Card removeBottom()
	{
		Card bottom = getBottom(top);
		
		deleteBottom(top);
		
		return bottom;
	}
	
	public Card deleteBottom(Card top)
	{
		Card next = null;
		
		if(top.getNext() != null)
		{
			top.setNext(deleteBottom(top.getNext()));
			
			next = top;
		}
		
		return next;
	}	
	
	public Card drawFromBottom()
	{
		return removeBottom();
	}
	/*
	 * this method will take a card off the top of the deck	
	 */
	public Card draw()
	{
		Card offTheTop = top;
		
		System.out.print("The Deck"  + "\n" + this.toString());
		
		int temp =(int)( 30 * Math.random() + 1);		
		
		for(int i = 0; i < temp; i++)
		{
			offTheTop = offTheTop.getNext();
		}
		
		if(top == offTheTop)
		{//if there is a card on top then we set it to be taken off the top
			offTheTop = top;
			//the card underneath top will be promoted
			top = top.getNext();
			
			if(top != null)
			{//if there is a new top it won't point at the old one anymore
				top.setPrevious(null);	
			}			
		}	
		else
		{
			Card before = offTheTop.getPrevious(),
				 after = offTheTop.getNext();
			
			before.setNext(after);
			after.setPrevious(before);
		}
		//if any card was taken off the top it is returned
		return offTheTop;
	}
	/*
	 * this method will draw multiple cards
	 */
	public Card draw(int cards)
	{
		Card offTheTop = null;
				
			for(int i = 0; i < cards; i++)
			{
				if(top != null)
				{
					Card another = draw();
					
					another.setNext(offTheTop);
					
					offTheTop.setPrevious(another);
					
					offTheTop = another;
				}				
			}
			
		return offTheTop;
	}	
	/*
	 * 
	 * this method will shuffle the deck in order to produce randomly dealt cards
	 */
	public void shuffle()
	{				
		/*for(int j = 0, n = FOUR_VALUE; j < n; j++)
		{
			for(int i = 0, m = TWO_VALUE; i < m; i++)
			{					
				clumpShuffle();
			}
			
			bridgeShuffle();
		}	*/	
	}
	
	public void clumpShuffle()
	{		
		cut();
			
		Cut other = cutOfDeck.getNext();
			
		int here = 0;
		
		for(Card clump = cutOfDeck.drawFromBottom();
			clump != null;
			other.setToBottom(clump), clump = cutOfDeck.drawFromBottom()){}
				
		top = cutOfDeck.top;
				
		cutOfDeck = null;
	}
	
	public void bridgeShuffle()
	{
		cut();
		
		for(Cut current = cutOfDeck; cutOfDeck.top != null || (cutOfDeck.getNext()).top != null; current = current.getNext())
		{			
			Card  bottom;
			
			for(int i = 0, n = SUITS_IN_A_DECK * SUITS_IN_A_DECK; i < n && current.top != null; i++)
			{
				bottom = current.removeBottom();
				
				add(bottom);
			}			
		}		
		
		cutOfDeck = null;
	}
	
	public void cut()
	{
		cut(CUTS_FOR_SHUFFLING);
	}
		
	public Card[][] cut(Card[] deckToCut)
	{
		return null;
	}
	
	public void cut(int numberOfCuts)
	{
		int cards = 0,
			cutTo;
		
		if(cutOfDeck == null)
		{
			cutOfDeck = new Cut();
			
			cutOfDeck.setNext(new Cut());
		}
		
		for(Card current = top; current != null; current = current.getNext(), cards++){}
		
		cutOfDeck.add(draw(cutTo = cards / numberOfCuts	+ ((int) (RANKS_IN_A_SUIT * Math.random()+ 1))));
		
		(cutOfDeck.getNext()).add(draw(cards - cutTo));	
		
	}
	
	public Card[][] cut(int numberOfCuts, Cut top)
	{
		return null;
	}
	/*
	 * 
	 * this method translates a card rank's string value to its integer value
	 */
	public int translateRank(String rank)
	{
		return cardReader.translateRank(rank);
	}
	/*
	 * 
	 *this method translates a card rank's integer value to its string value 
	 */
	public String translateRank(int rank)
	{		
		return cardReader.translateRank(rank);
	}
	/*
	 * 
	 * this method translates a card suit's string value to its integer value
	 */
	public int translateSuit(String suit)
	{
		return cardReader.translateSuit(suit);
	}
	/*
	 * 
	 * this method translates a card suit's integer value to its String value
	 */
	public String translateSuit(int suit)
	{
		return cardReader.translateSuit(suit);
	}	
	/*
	 * 
	 * this method will print all the cards in the deck
	 */
	public String toString()
	{
		String cardNames = "";
		
		int cards = 0;
		
		for(Card current = top; current != null; current = current.getNext())
		{
			cardNames += (current.toString() + ++cards + "\n");
		}
		
		return cardNames;
	}
	/*
	 * this method will paint the deck
	 */
	public void paint(Graphics pane)
	{
		pane.setColor(Color.black);
		
		pane.fillRoundRect(xStartPosition, yStartPosition, CARD_WIDTH, CARD_HEIGHT, FIVE_VALUE, FIVE_VALUE);
		
		pane.setColor(Color.white);
		
		pane.fillRoundRect(xStartPosition + 4, yStartPosition + 4, CARD_WIDTH - 8, CARD_HEIGHT - 8, FIVE_VALUE, FIVE_VALUE);		
		
		pane.setColor(Color.black);
		
		pane.fillRoundRect(xStartPosition + 8, yStartPosition + 8, CARD_WIDTH - 16, CARD_HEIGHT - 16, FIVE_VALUE, FIVE_VALUE);
	}
}

class Cut implements DeckShuffler
{
	Cut next;
	
	Card top;	
	
	Cut()
	{
		this(null);
	}
	
	Cut(Card top)
	{
		this.top = top;
	}
	
	void setNext(Cut next)
	{
		this.next = next;
	}
	
	Cut getNext()
	{
		return next;
	}

	void add(Card top)
	{
		top.setNext(this.top);
		
		this.top = top;
	}
	
	Card draw()
	{
		Card top = this.top;
		
		if(this.top != null)
		{
			this.top = (this.top).getNext();
		}
		
		return top;
	}
	
	public void setToBottom(Card bottom)
	{
		for(Card top = this.top; top.getNext() != null; top = top.getNext()){}
		
		top.setNext(bottom);
	}
	
	public Card getBottom(Card top)
	{			
		Card bottom = top;	
		
		while(bottom.getNext() != null)
		{			
			bottom = bottom.getNext();
		}
				
		return bottom;
	}
	
	public Card removeBottom()
	{
		Card bottom = getBottom(top);
		
		deleteBottom(top);
		
		return bottom;
	}
	
	public Card deleteBottom(Card top)
	{
		Card next = null;
		
		if(top.getNext() != null)
		{
			top.setNext(deleteBottom(top.getNext()));
			
			next = top;
		}
		
		return next;
	}	
	
	public Card drawFromBottom()
	{
		return removeBottom();
	}
	
	public void bridgeShuffle(){}
	public void cut(){}	
	public void cut(int numberOfCuts){}
	public void clumpShuffle(){}
	public void shuffle(){}
	public void sort(){}
}