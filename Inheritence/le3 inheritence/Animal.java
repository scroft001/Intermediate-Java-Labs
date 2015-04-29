/* animal class
Steven Croft */

public abstract class Animal
{
   protected String name;
   protected int age;
   
      
   public void makeNoise ()
   {
      System.out.println ("Generic Animal Noise");
   }
   
   public abstract void eat ();
   
   public void roam ()
   {
      System.out.println ("Generic Animal Roam");
   }
   
   public abstract void sleep (int minutes);
}