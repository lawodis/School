/*
 * Jack Wood
 * 
 * This class will define a quarter of the cards in the deck
 */

import java.awt.Color;
import java.awt.Graphics;

public class Spade extends Card
{
	public Spade(String rank)
	{
		super(rank, SPADES);		
	}
	
	public void paint(Graphics pane)
	{
		super.paint(pane);
		
		if(faceUp)
		{
			pane.setColor(Color.black);
			//spades use the color black
			
			int[] xPoints = new int[3],
					yPoints = new int[3];
			//these will allow us to paint triangles
			
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 9;
			xPoints[2] = xSuitPosition + 34;
			
			yPoints[0] = ySuitPosition - 3;
			yPoints[1] = ySuitPosition + 25;
			yPoints[2] = ySuitPosition + 25;
			//these are the points for the stem of the spade
			
			pane.fillPolygon(xPoints, yPoints, 3);
			//paints the stem using the points
			
			pane.fillOval(xSuitPosition - 12, ySuitPosition - 12, 25, 25);
			pane.fillOval(xSuitPosition + 12, ySuitPosition - 12, 25, 25);
						
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 12;
			xPoints[2] = xSuitPosition + 37;
			
			yPoints[0] = ySuitPosition - 28;
			yPoints[1] = ySuitPosition - 3;
			yPoints[2] = ySuitPosition - 3;
			
			pane.fillPolygon(xPoints, yPoints, 3);
			
			pane.fillOval(xSuitPosition, ySuitPosition - 16, 25, 25);
			//paints an upside down heart of sorts
			
			paintCardCharacter(pane);	
		}		
	}
}
