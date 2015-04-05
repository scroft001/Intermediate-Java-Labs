import java.awt.*;
import javax.swing.*;

public class SimpleGUI
{
	JFrame f; // field called JFrame

	public void go() // method
	{
		f = new JFrame("A Drawing Panel"); // create a JFrame i.e., window
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel dP = new MyDrawPanel(); //create the MyDrawPanel object

		f.add(dP); // add the object to the window's contentPane
		
		f.setSize(800,800); // 800 pixels wide, 800 pixels tall
		f.setVisible(true); // show the window
	}

	public static void main(String args[])
	{
		SimpleGUI gui = new SimpleGUI();
		gui.go(); // makes the window by calling the method go
	}

}