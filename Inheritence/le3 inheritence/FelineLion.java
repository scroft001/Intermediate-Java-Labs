/* lion
Steven Croft */

public class FelineLion extends Animal
{
  private int bodyMass;
  private int fangLength;
    
   public int getBodyMass ()
   {
      return bodyMass;
   }
   public int getFangLength()
   {
      return fangLength;
   }
   public String getName ()
   {
      return name;
   }


   public FelineLion ( String n, int a, int bm, int f)
   {
      name = n;
      age = a;
      bodyMass = bm;
      fangLength = f;
   }

   public void makeNoise ()
      {
         System.out.println ("ROAR");
      }
   public void hunting ()
   {
      System.out.println ( name + " is out hunting");
   }
    public void sleep ( int minutes )
   {
      System.out.println ( name + " is sleeping for the next " + minutes + " minutes");
   }
   public void eat ()
   {
      System.out.println ( name + " is eating a Zebra.");
   }
   public void roam ()
   {
      System.out.println( name + " is roaming around the Sahara");
   }

}