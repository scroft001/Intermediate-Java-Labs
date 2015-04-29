/* lion test
Steven Croft */

public class FelineLionTest
{

public static void main ( String [] args )
   {
      FelineLion l = new FelineLion ("Simba" , 2, 500, 10);
      l.eat ();
      l.roam ();
      l.sleep (1200);
      l.makeNoise();
      l.hunting ();
      System.out.println (" BM is: " + l.getBodyMass ());
      System.out.println ( " fangs are " + l.getFangLength () + " inches long." );
   }
}