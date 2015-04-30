/* generic queue
Steven Croft
*/

public class Gqueue <Item>
{
  
      private int N;               // number of elements on queue
      private Node<Item> first;    // beginning of queue
      private Node<Item> last;     // end of queue

    // helper linked list class
    private static class Node<Item> 
    {
        private Item item;
        private Node<Item> next;
    }

    
    public Gqueue() 
    {
        first = null;
        last  = null;
        N = 0;
    }

    
    public boolean isEmpty() 
    {
        return first == null;
    }

    
    public int size() 
    {
        return N;     
    }

   
  
    
    public void enqueue(Item item) 
    {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        N++;
    }

    
    public Item dequeue() 
    {
        if (isEmpty()) throw new EmptyStackException("Queue underflow");
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    }

   public static void main (String [] args)
   {
      Gqueue<Float> gq = new Gqueue <Float> ();
      gq.enqueue(28.2f);
   }
}