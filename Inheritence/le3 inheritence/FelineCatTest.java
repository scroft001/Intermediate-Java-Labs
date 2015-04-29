/* Cattest class for the feline and animal 
Steven Croft */

public class FelineCatTest
{

public static void main ( String [] args )
   {
      FelineCat c = new FelineCat ("Tom" , 2, 20);
      c.eat ();
      c.roam ();
      c.sleep (1200);
      c.makeNoise();
      c.scratchPost ();
      System.out.println ("Tom's BM " + c.getBodyMass ());
   }
}