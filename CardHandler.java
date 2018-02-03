/*
 * Jack Wood
 * 
 * The purpose of this interface is to define the most basic constants involved with cards regardless of what they would be used for
 */
public interface CardHandler
{
	/*
	 * There are 52 cards in a deck
	 * Each deck has 4 suits
	 * Each suit has 13 ranks
	 * 
	 * hence:
	 */
	public final int CARDS_IN_A_DECK = 52,
					 SUITS_IN_A_DECK = 4,
					 RANKS_IN_A_SUIT = 13,
					 
					 CARD_HEIGHT = 100,
					 CARD_WIDTH = 75;
	/*
	 * The ranks include Ace, the numbers two through ten, Jack, Queen, and King
	 */
	public final String ACE = "Ace",
						TWO = "Two",
						THREE = "Three",
						FOUR = "Four",
						FIVE = "Five",						
						SIX = "Six",
						SEVEN = "Seven",
						EIGHT = "Eight",						
						NINE = "Nine",
						TEN = "Ten",
						JACK = "Jack",
						QUEEN = "Queen",
						KING = "King",
						/*
						 * The suits have come to be spades, hearts, diamonds, and clubs
						 */
						SPADES = "Spades",
						HEARTS = "Hearts",
						DIAMONDS = "Diamonds",
						CLUBS = "Clubs";
	/*
	 * Aces are worth 1, though sometimes they could be worth 14
	 * The numbers 2 through 10 are worth the same as their name
	 * Jack, Queen, and King are worth 11, 12, and 13 respectively
	 */
	public final int ACE_LOW_VALUE = 1,//Ace can be low
					 TWO_VALUE = 2,
					 THREE_VALUE = 3,
					 FOUR_VALUE = 4,
					 FIVE_VALUE = 5,						
					 SIX_VALUE = 6,
					 SEVEN_VALUE = 7,
					 EIGHT_VALUE = 8,						
					 NINE_VALUE = 9,
					 TEN_VALUE = 10,
					 JACK_VALUE = 11,
					 QUEEN_VALUE = 12,
					 KING_VALUE = 13,
					 ACE_HIGH_VALUE = 14,//Ace can be High
					 /*
					  * When suits are called into question the hierarchy is spades, hearts, diamonds, then clubs
					  */
					 SPADES_VALUE = 0,
					 HEARTS_VALUE = 1,
					 DIAMONDS_VALUE = 2,
					 CLUBS_VALUE = 3;	
}
