/* animal cat class
Steven Croft */

public class FelineCat extends Animal
{
  private int bodyMass;
   
      
   public int getBodyMass ()
   {
      return bodyMass;
   }

   public FelineCat ( String n, int a, int bm)
   {
      name = n;
      age = a;
      bodyMass = bm;
   }

   public void makeNoise ()
      {
         System.out.println ("Meow");
      }
   public void scratchPost ()
   {
      System.out.println ( name + " is scratching their post.");
   }
    public void sleep ( int minutes )
   {
      System.out.println ( name + " is sleeping for the next " + minutes + " minutes");
   }
   public void eat ()
   {
      System.out.println ( name + " is eating.");
   }
   public void roam ()
   {
      System.out.println( name + " is roaming around the house");
   }

}