/*
 * Jack Wood
 * 
 * This interface defines the shuffling actions that the dealer will use to manipulate the deck
 */
public interface DeckShuffler extends CardHandler
{
	public final int CUTS_FOR_SHUFFLING = 2,
					 CARDS_IN_A_HAND = 5;
	
	public void cut();
		
	public void cut(int numberOfCuts);
			
	public void sort();
		
	public void shuffle();
		
	public void clumpShuffle();
		
	public void bridgeShuffle();
	
	public void setToBottom(Card bottom);
	
	public Card getBottom(Card top);
		
	public Card removeBottom();
	
	public Card deleteBottom(Card top);	
}
