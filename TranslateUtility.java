/*
 * Jack Wood
 * 
 * This interface defines the methods for switching back and for between integer and String values of a cards Rank and suit
 */
public interface TranslateUtility extends CardHandler
{
	public int translateRank(String rank);
	
	public String translateRank(int rank);
	
	public int translateSuit(String suit);
	
	public String translateSuit(int suit);
}
