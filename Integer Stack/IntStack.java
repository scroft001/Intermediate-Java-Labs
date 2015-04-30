/* Array stack class using ints
Steven Croft
*/

public class IntStack < E >  // have to put in adt methods
{
   private  final int STACK_SIZE; // number of elements in the stack
   private E [] elements; //  array that stores stack elements
   private int top; // last used index; top of the stack
   
   public IntStack (int stack)
   {
      int stack = STACK_SIZE;
      top = -1; // stack is empty
   }
   
   // push method
   public boolean push ( int pushedElement )
   {
      if ( !isFull () ) // is there room to insert?
      {
         stack [++top] = pushedElement;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   // pop method
   public int pop () throws DataStructureException
   {
      if (!isEmpty () ) // is there something to delete?
      {
         return ( stack [top--] );
      }
      else
      {
         throw new DataStructureException ( "Stack empty: cannot pop" );
      }
   }
   
   // peek method
   /*public int peek () throws DataStructureException
   {
      if (!isEmpty () ) // stack is not empty
      {
         return new int stack [top] ; // what is on the top of the int stack
      }
      else
      {
         throw new DataStructureException ( "Stack empty: cannot peek" );
      }
   }
   */
   
   // is Empty method
   public boolean isEmpty ()
   {
      return ( top == -1 );
   }
   
   // is full method
   public boolean isFull ()
   {
      return ( top == (STACK_SIZE -1 ) );
   }
   
   public String toString ()
   {
      String stackString = "";
      for ( int i = top; i>=0; i--)
      {
         stackString += ( i + ": " + stack[i] + "\n");
      }
      return stackString;
   }
} // end of class