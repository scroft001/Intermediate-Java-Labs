/* a better stack
Steven Croft
*/

public class Stack <E>
{
   private final int size; // number of elemnts in the stack
   private int top; // location of the top of the stack
   private E [] elements; // arrat that stores stack elements
   
   // no argument constructor creates a stack of the default size
   public Stack ()
   {
      this (10); // default stack size
   } // end no argument constructor
   
   //constructor creates a stack for the specified number of elements
   public Stack ( int s )
   {
      size = s > 0 ? s : 10; // set size of stack
      top = -1; // stack initaially empty
      elements = ( E[] ) new Object [ size ]; // create array and cast to type E
   } // end one argument stack constructor
   
   // push element onto stack; if successful, return true; if full throw FullStackException
   public void push ( E pushValue )
   {
      if ( top == size - 1 ) // if stack is full
         throw new FullStackException ("Stack is full, cannot push" + pushValue);
      elements [ ++ top ] = pushValue; // place push value on stack
   } // end push method
   
   // return the top element if not empty; else throw EmptyStackException
   public E pop ()
   {
      if ( top == -1 ) // if stack is empty
         throw new EmptyStackException ( "Stack is empty, cannot pop" );
      return elements [top--]; // remove and return top element of Stack
   }// end pop
}//end class Stack<E>