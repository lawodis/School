/*
 * Jack Wood
 * 
 * The purpose of this Class is to define the constants and methods for ranking a hand of cards
 */
public interface HandRanker extends CardHandler
{
	public final String ROYAL_FLUSH = "A Royal Flush of ",
						STRAIT_FLUSH = "Strait Flush of ",
						FOUR_OF_A_KIND = "Four ",
						FULL_HOUSE = "A Full House, ",
						FLUSH = "A Flush of ",
						STRAIT = "Strait",
						THREE_OF_A_KIND = "Three ",
						TWO_PAIR = "Two Pair, ",
						PAIR = "A Pair of ",
						HIGH_CARD = "High",
						
						WIN = "You win with ",
						LOSE = "You lose against ",
						TIE = "You tie with";
	
	public final int ROYAL_FLUSH_VALUE = 10,
					 STRAIT_FLUSH_VALUE = 9,
					 FOUR_OF_A_KIND_VALUE = 8,
					 FULL_HOUSE_VALUE = 7,
					 FLUSH_VALUE = 6,
					 STRAIT_VALUE = 5,
					 THREE_OF_A_KIND_VALUE = 4,
					 TWO_PAIR_VALUE = 3,
					 PAIR_VALUE = 2,
					 HIGH_CARD_VALUE = 1;
			
	public boolean isFourOfAKind();
		
	public boolean isFlush();
	
	public boolean isStrait();
	
	public boolean isThreeOfAKind();	
	
	public boolean isPair();
	
	public boolean isOfKind(int set);	
	
	public void AceHighOrLow();
}
