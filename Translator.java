/*
 * Jack Wood
 * 
 * The purpose of this class is easily toggle back and forth between the integer and String values of a a Card's rank and suit
 */
public class Translator implements TranslateUtility,
								   CardHandler
{
	public Translator()
	{

	}
	/*
	 * this method will give and int for the String rank
	 * (non-Javadoc)
	 * @see TranslateUtility#translateRank(java.lang.String)
	 */
	public int translateRank(String rank)
	{
		int translation = KING_VALUE;
		
		if(rank.equals(ACE))
		{
			translation = ACE_LOW_VALUE;
		}
		else if(rank.equals(TWO))
		{
			translation = TWO_VALUE;
		}
		else if(rank.equals(THREE))
		{
			translation = THREE_VALUE;
		}
		else if(rank.equals(FOUR))
		{
			translation = FOUR_VALUE;
		}
		else if(rank.equals(FIVE))
		{
			translation = FIVE_VALUE;
		}
		else if(rank.equals(SIX))
		{
			translation = SIX_VALUE;
		}
		else if(rank.equals(SEVEN))
		{
			translation = SEVEN_VALUE;
		}
		else if(rank.equals(EIGHT))
		{
			translation = EIGHT_VALUE;
		}
		else if(rank.equals(NINE))
		{
			translation = NINE_VALUE;
		}
		else if(rank.equals(TEN))
		{
			translation = TEN_VALUE;
		}
		else if(rank.equals(JACK))
		{
			translation = JACK_VALUE;
		}
		else if(rank.equals(QUEEN))
		{
			translation = QUEEN_VALUE;
		}		
				
		return translation;
	}
	/*
	 * this method will give a String for the integer rank
	 * 
	 * (non-Javadoc)
	 * @see TranslateUtility#translateRank(int)
	 */
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
		else
		{			
			translation = KING;		
		}
		
		return translation;
	}
	/*
	 * this method will give and integer for the String suit
	 * (non-Javadoc)
	 * @see TranslateUtility#translateSuit(java.lang.String)
	 */
	public int translateSuit(String suit)
	{
		int translation;
		
		if(suit.equals(SPADES))
		{
			translation = SPADES_VALUE;
		}
		else if(suit.equals(HEARTS))
		{
			translation = HEARTS_VALUE;
		}
		else if(suit.equals(DIAMONDS))
		{
			translation = DIAMONDS_VALUE;
		}
		else
		{
			translation = CLUBS_VALUE;
		}		
		
		return translation;
	}
	/*
	 * this method will give a String for the integer suit
	 * (non-Javadoc)
	 * @see TranslateUtility#translateSuit(int)
	 */
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
}
