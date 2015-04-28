/* post fix evaluator
Steven Croft  */

import java.util.StringTokenizer;
import java.io.*;


public class PostFixEvaluator 
{
   public static class Evaluation
   {
   
      public int calculate ( ) throws DataStructureException
      {
         IntStack stack = new IntStack (); // create a new stack
         
         String pfe = "2 3 - 4 *"; // the post fix expression to be evaluated
         String DELIMS = " +-*/";
         
         StringTokenizer st = new StringTokenizer(pfe,"DELIMS",true); // creates new string tokenizer that will read pfe
         int numberOfTokens = st.countTokens(); // count number of tokens
         int i = 0;
         int r = 0;
         
         for ( i=0; i<numberOfTokens; i ++ )
         {
            System.out.println(st.nextToken () );
            char ch = pfe.charAt(i); // ch is character at i in pfe
            if ( ch>='0' && ch<='9' )
            {
               stack.push(ch); // push int onto stack
            }
            else
            {
               int x=stack.pop(); // use x as variable for popped number
               int y=stack.pop(); // use y as variable for second pop
               switch (ch)
               {  
                 case '+':r=x+y;  
                     break;  
                 case '-':r=y-x;  
                     break;  
                 case '*':r=x*y;  
                     break;  
                 case '/':r=y/x;  
                     break;  
                 default:r=0;
               } // end switch
               stack.push(r);
            } // end else
         } // end for
         r=stack.pop();
         return (r);
         } // end calculate
      } // end evaluation
   public static void main(String[] args) throws DataStructureException 
   {  
      Evaluation e = new Evaluation ();
      System.out.println("The result is: " + e.calculate() );
   }
     
   
} // end class

 
