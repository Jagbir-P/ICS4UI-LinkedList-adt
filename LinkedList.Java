public class LinkedList{
       
    private Node head;
    private int numItems;
 
    public LinkedList(){
       this.head = null;
       this.numItems = 0;
    }
 
 
    public void add(int element){

      Node a = new Node(element);

      Node ThisNode = this.head;
      
      // check if head is empty
      if (numItems == 0){
         numItems++;
         this.head = a;
      }
      // find end of list 
      else {

         while(ThisNode.hasNext()){
            ThisNode = ThisNode.next();
         }
         // once at end of list insert item
         ThisNode.setNext(a);
         numItems++;

      }
   }


   // method to print out the list
      public void printOut(){

         Node current = this.head;

         while(current.hasNext()){
            System.out.println(current.getNumber());
            current = current.next();
         }
         System.out.println(current.getNumber());
      }

      
       
 
    public void add(int index, int element){
 
    }
 
    public int get(int index){
      return 0;
    }
 
    public int remove(int index){
      return 0;
    }
 
    public int size(){
      return this.numItems;
    }
 
    public boolean isEmpty(){
      return false;
    }
 
 }
 
 