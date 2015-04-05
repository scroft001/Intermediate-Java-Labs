/* The ShellLinkedList class
Steven Croft */

public abstract class ShellLinkedList
{
   protected PlayerNode head;
   protected int numberOfItems;
   
   // constructor sets head to null and numberOfItems to 0
   public ShellLinkedList ()
   {
      head = null;
      numberOfItems = 0;
   }
   
   // accessor for numberOfItems returns numberOfItems
   public int getNumberOfItems ()
   {
      return numberOfItems;
   }
   
   // inEmpty returns true if no items in list; false otherwise
   public boolean isEmpty ()
   {
      return ( numberOfItems == 0 );
   }
   
   // to string return the contents of the list
   public String toString ()
   {
      String listString = "";
      PlayerNode current = head;
      for ( int i = 0; i < numberOfItems; i++ )
      {
         listString += current.getPlayer().toString() + "\n";
         current = current.getNext();
      }
      return listString;
   }
}