//Jack Wood

import java.awt.*;
import java.awt.event.*;

public class FourthWall extends Frame implements MouseListener
{
	private UneFenetre myWindow = new UneFenetre();
	
	private Boolean initializationComplete = false;
	
	protected int lastX, lastY;
	
	public FourthWall()
	{
		this("Fourth Wall", 50, 50, 100, 100);
	}
	
	public FourthWall(String title, int startingXCoordinate, int startingYCoordinate, int windowHeight, int windowWidth)
	{
		setTitle(title);
		setLocation(startingXCoordinate, startingYCoordinate);
		setSize(windowHeight, windowWidth);
		setBackground(Color.black);
		
		setVisible(true);
		
		addWindowListener(myWindow);
				
		repaint();//defines window using Frame class
		
		//create(startingXCoordinate, startingYCoordinate, windowHeight,windowWidth);
		
		
	}
	
	public void paint()
	{
		
	}
	
	public void check()
	{
	
	}
	
	public void flipWhenInside()
	{
		
	}
	
	public void mouseClicked(MouseEvent event)
	{
			check();
	}

	public void mousePressed(MouseEvent event)
	{
			lastX = event.getX();
			lastY = event.getY();
			
			flipWhenInside();
	}

	public void mouseReleased(MouseEvent event)
	{
		flipWhenInside();
	}	
	
	public void mouseEntered(MouseEvent event){}
	public void mouseExited(MouseEvent event){}

	
}
