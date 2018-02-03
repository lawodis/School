/*
 * Jack Wood
 * 
 * This class will define a quarter of the cards in the deck
 */

import java.awt.Color;
import java.awt.Graphics;

public class Heart extends Card
{
	public Heart(String rank)
	{
		super(rank, HEARTS);		
	}
	
	public void paint(Graphics pane)
	{
		super.paint(pane);
		
		if(faceUp)
		{
			pane.setColor(Color.red);
			//hearts use the color red
			
			int[] xPoints = new int[3],
					yPoints = new int[3];
			
			pane.fillOval(xSuitPosition - 12, ySuitPosition - 25, 25, 25);
			pane.fillOval(xSuitPosition + 12, ySuitPosition - 25, 25, 25);
			
			xPoints[0] = xSuitPosition + 12;
			xPoints[1] = xSuitPosition - 12;
			xPoints[2] = xSuitPosition + 37;
			
			yPoints[0] = ySuitPosition + 25;
			yPoints[1] = ySuitPosition - 6;
			yPoints[2] = ySuitPosition - 6;
			
			pane.fillPolygon(xPoints, yPoints, 3);
			
			pane.fillOval(xSuitPosition, ySuitPosition - 19, 25, 25);
			//paints a heart
			
			paintCardCharacter(pane);	
		}		
	}

}
