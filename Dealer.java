/*
 * Jack Wood
 * 
 * The purpose of this class is to handle the deck, deal the cards, and decide who wins
 */
import java.awt.Color;
import java.awt.Graphics;

public class Dealer implements DeckShuffler
{
	private Deck theDeck;
	
	private Player user;
	
	private boolean cardsDealt;//this will control when the cards are painted
	
	private int PLAYERS = 2;//there is the user and the computer
	
	private String resultText;
	
	private final int xResultPosition = 200,
					  yResultPosition = 300;
	
	private boolean resultVisible;
	
	private Color resultColor;
	
	Dealer()
	{
		user = new Player(100, 150);//the user is instantiated with x y coordinates for where to paint its hand
		
		user.setOpponent(new Player(100, 20));//the user points at its newly instantiated computer opponent
		
		(user.getOpponent()).setOpponent(user);//the computer is set to point back to the user
		
		resultVisible = cardsDealt = false;//the cards haven't been dealt yet
					
		theDeck = new Deck();//the dealer instantiated a new deck
		
		shuffle();//and shuffles
	}
	/*
	 * this method is called by the game class when the deal button is clicked
	 */
	public void deal()
	{			
		if(cardsDealt)
		{//if cards are still in the game the dealer needs to clear them
			clear();			
		}
		
		Player currentPlayer = user;//the dealer starts with the user
				
		for(int i = 0; i < PLAYERS * CARDS_IN_A_HAND; i++)
		{//the dealer will deal a hand to each player
			Card newCard = theDeck.draw();//the dealer draws a new card from the deck			
			
			currentPlayer.cardFromDealer(newCard);//the dealer gives that card to the player they are focusing on
			
			currentPlayer = currentPlayer.getOpponent();//and then moves on to the other player
		}		
		
		cardsDealt = true;//now the cards have been dealt
		
		user.flipCards();//the user's cards are flipped face up
	}	
	
	public void paint(Graphics pane)
	{
		if(theDeck != null)
		{//if the deck has been instantiated it needs to be painted
			theDeck.paint(pane);
		}
		if(cardsDealt)
		{//if the cards have been dealt the users will paint their cards
			user.paint(pane);
			
			user.getOpponent().paint(pane);
		}
		if(resultVisible)
		{
			pane.setColor(resultColor);			
			
			pane.drawString(resultText, xResultPosition, yResultPosition);
		}
	}
	/*
	 * This method is called by the game class when the playButton is clicked
	 */
	public void reveal()
	{
		user.getOpponent().flipCards();//the user's opponent flips their cards for the user to see
		
		user.rankHand();//the user's hand is ranked
		
		user.getOpponent().rankHand();//and the user's opponents hand is ranked
		
		if(user.getHandRank() > user.getOpponent().getHandRank())
		{
			resultText = HandRanker.WIN + user.getHandName();
			
			resultColor = Color.green;
		}
		else
		{
			resultText = HandRanker.LOSE + user.getOpponent().getHandName();
			
			resultColor = Color.red;
		}
		
		resultVisible = true;
	}
	/*
	 * This method is can be called by the game class when the fold button is clicked
	 * 
	 * Or when the deal method is called and cards are still dealt from the last hand
	 */
	public void clear()
	{		
		resultVisible = cardsDealt = false;//the cards are no longer dealt
		
		Player player = user;//we start with the user
		
		do
		{
			theDeck.setToBottom(player.fold());//one player folds their hand and puts it on the bottom of the deck
						
			player = player.getOpponent();//then their opponent will do the same
		}
		while (player != user);//this will stop looping when it comes back around to the user
		
		shuffle();// the deck is shuffled
	}
	/*
	 * this method will randomize which cards are dealt
	 * 
	 */
	public void shuffle()
	{	//but it passes the buck to theDeck
		theDeck.shuffle();
	}
	/*
	 * this method creates an ordered deck
	 * 
	 */
	public void sort()
	{	//a new deck is instantiated
		theDeck = new Deck();
		//and then it is told to sort itself
		theDeck.sort();
	}
	/*
	 * 
	 * if the dealer is told to print
	 */
	public String toString()
	{//then it will print the deck
		return theDeck.toString();
	}
	/*
	 * 
	 * these methods are not used by the dealer
	 */
	public void bridgeShuffle(){}		
	public void cut(){}
	public void cut(int numberOfCuts){}
	public void clumpShuffle(){}
	public Card deleteBottom(Card top){return null;}
	public Card getBottom(Card top){return null;}
	public Card removeBottom(){return null;}
	public void setToBottom(Card bottom){}
}
