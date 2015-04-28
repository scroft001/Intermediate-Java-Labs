/* recursion for dividing by three and the fibinocci sequence
Steven Croft 
*/

public class RecursiveDividing
{
   public static void main (String [] args )
   {
      System.out.println("The answer is: " + div3(17) );
      System.out.println("The nth term of the sequence is: " + fib(8));
      int index = 0;
      while(index<8)
      {
         System.out.println(fib(index));
         index++;
      }
   } // end main
      
      public static float div3 ( float n)
      {
         if (n <= 1 )
         {
            return n;
         }
         else
         {
            return div3(n/3)/3; 
         }
      }
      
   public static int fib( int f )
   {
      if ( f <= 2 )
      {
         return 1;
      }
      
      else
      {
         int fibTerm = fib(f-1) + fib(f-2);
         return fibTerm;

      }
   }
} // end class