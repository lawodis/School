/*
 * Jack Wood
 * 
 * This class will define a quarter of the cards in the deck
 */

import java.awt.Color;
import java.awt.Graphics;


public class Diamond extends Card
{
	public Diamond(String rank)
	{
		super(rank, DIAMONDS);		
	}
	
	public void paint(Graphics pane)
	{
		super.paint(pane);
		
		if(faceUp)
		{
			pane.setColor(Color.red);
			//diamonds use the color red
			
			int[] xPoints = new int[3],
					yPoints = new int[3];
			
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 12;
			xPoints[2] = xSuitPosition + 37;
			
			yPoints[0] = ySuitPosition - 25;
			yPoints[1] = ySuitPosition;
			yPoints[2] = ySuitPosition;
			
			pane.fillPolygon(xPoints, yPoints, 3);
			
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 12;
			xPoints[2] = xSuitPosition + 37;
			
			yPoints[0] = ySuitPosition + 25;
			yPoints[1] = ySuitPosition;
			yPoints[2] = ySuitPosition;
			
			pane.fillPolygon(xPoints, yPoints, 3);
			//paints two triangles to create a diamond when all i had to do was paint one polygon, C'est la vie
			
			paintCardCharacter(pane);
		}		
	}
}
