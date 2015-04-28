import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel // public so we can override and create a paint component of our own
{
	
	public MyDrawPanel() // creating a constructure to build a draw panel
	{
		
	}
	
	public void paintComponent( Graphics g ) // method passed a Graphics object g
	{ 	
		super.paintComponent(g); // super is a keyword that refers to a class above this one
      g.drawLine ( 0,0,200,200); // (startx, starty, endx, endy)
      g.drawRect (100,200,50,80); // (cornerx, cornery, width, height)
      g.drawOval (300,300,25,25); // (cornerx, cornery, width, height)
      g.setColor (Color.RED);
      g.fillRect ( 150,250,50,80);
      g.fillOval ( 310,310,25,25);
      g.setColor (Color.GREEN);
      g.fillRect ( 200,300,50,80);
      g.fillOval ( 320,320, 25,25);
      
			
	}//end paintComponent
}