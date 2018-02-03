/*
 * Jack Wood
 * 
 * This class will define a quarter of the cards in the deck
 */

import java.awt.Color;
import java.awt.Graphics;

public class Club extends Card
{
	public Club(String rank)
	{		
		super(rank, CLUBS);		
	}
	
	public void paint(Graphics pane)
	{
		super.paint(pane);
		
		if(faceUp)
		{
			pane.setColor(Color.black);
			
			int[] xPoints = new int[3],
					yPoints = new int[3];
			
			pane.fillOval(xSuitPosition - 12, ySuitPosition - 16, 25, 25);
			pane.fillOval(xSuitPosition + 12, ySuitPosition - 16, 25, 25);
			pane.fillOval(xSuitPosition, ySuitPosition - 28, 25, 25);
			
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 10;
			xPoints[2] = xSuitPosition + 34;
			
			yPoints[0] = ySuitPosition - 3;
			yPoints[1] = ySuitPosition + 25;
			yPoints[2] = ySuitPosition + 25;
			
			pane.fillPolygon(xPoints, yPoints, 3);
			//paints the club
			
			paintCardCharacter(pane);
		}		
	}
}
