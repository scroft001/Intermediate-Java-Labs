


/* Steven Croft
   miles to km
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilesToKilometers extends JFrame implements ActionListener
{
   // Swing interface fields ( should be private )can be used through out the class
   private JButton bConvert; 
   private JLabel lblKilometers;
   private JTextField tfMiles;
    
   public MilesToKilometers () // doesn't need parameters because knows fields
   {
      // Title window using super
      super ("Convert Miles to Kilometers");
      setBounds ( 100,100,300,100 );
      setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);
      
      setLayout ( new GridLayout (2,2,6,6) );
      
      // create jbuttons and jlabels
      bConvert = new JButton ("Convert");
      
      lblKilometers = new JLabel ("Kilometers");
      tfMiles = new JTextField ("");
      
      // add controls to the content pane
      add(new JLabel ("Miles: "));
      add(tfMiles);
      add(bConvert);
      add(lblKilometers);
      bConvert.addActionListener(this);
      
      setVisible (true); //mutator
      
   }
   
   public void actionPerformed ( ActionEvent ae ) // whenever action performed is called action event is passed to action listener
   {
      final float mtokmf = 1.60f;
      String sMiles = tfMiles.getText();
      
      try
      {
         float kilometers = Float.parseFloat(sMiles) * mtokmf;
         lblKilometers.setText(Float.toString( kilometers ) );
      }
      catch(NumberFormatException nfe)
      {
         lblKilometers.setText (tfMiles.getText() + " is not a number" );
      }
   }
    
   public static void main ( String [] args )
   {
      MilesToKilometers mtk = new MilesToKilometers(); // calls the constructer
   }
   
   
}   