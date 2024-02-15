
public class LL {
    
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;  
        }
    }
    public static Node head;
    public static Node tail;
    
    
    //add -first,last
    public void addFirst(int data){
        //create a new node
        Node newnode = new Node(data);
        if(head==null){
          head = tail =newnode;
          return;
        }
  
        //step2 -newNode next = head
        newnode.next=head; //the value of head is stored into next(property) of the newnode

        //step3 -head = newnode
        head = newnode;

    }

    public void addLast(int data){
     Node newnode = new Node(data);
     if(head ==null){
        head = tail= newnode;
        return;
     }
     tail.next = newnode;
     tail =newnode;
    }


    public void print(){
        if(head ==null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
            LL list = new LL();
            list.addFirst(1);
            list.addFirst(2);
            list.addLast(3);
            list.addLast(4);
        
            list.print();
        
    }
}
