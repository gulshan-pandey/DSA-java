package DSA;
public class SinglyLinkedList {

    private Node head;          // head variable will be override everytime we create a new node
    private Node tail;

    private int size;

    public void insertFirst(int val){           // inserting the first element
        Node node = new Node(val);
        node.next = head;       // connecting the next node to the head  { as head is already pointing to the previous node }
        head = node;            // the head is now pointing to the new node
        if(tail==null){
            tail= head;         // both head and tail are pointing ot the same
        }
        size+=1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail==null){
            insertFirst((val));
        }else{
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int val,int index){              //insert at particular index

        if(index==0) insertFirst((val));
        else if(index==size) insertLast(val);
        else{
            Node temp = head;
            for(int i=1; i<index;i++){
               temp= temp.next;
            }
            Node node = new Node(val);
//            Node node = new Node(val,temp.next);          // ---> another way by using perameterized constructor of the Node class
            Node temp2 = temp.next;
            temp.next =node;
            node.next =temp2;
            size++;
            System.out.println("successfully added " + val + " to " + index + "-index   (❁´◡`❁) !");

        }
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
       size--;
        return val;
    }

    public int deleteLast(){                    // the complexity is O(n)
        if(size<=1){
            return deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next =null;
        size--;
        return val;
    }

    public Node find(int value){            // complexity is O(n)
        Node node = head;
        while(node!= null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public Node get(int index){            // to get the specific index to delete
        Node node = head;
        for(int i =0; i<index; i++){
            node=node.next;
        }
        return node;
    }


//    public int deleteLast(){              //another method to delete last
//        if(size<=1){
//            return deleteFirst();
//        }
//        int val = tail.value;
//        Node temp = head;
//        for(int i=0;i<size-2; i++){
//            temp =temp.next;
//        }
//        tail =temp;
//        tail.next = null;
//
//        return val;
//    }
//    public int delete(){
//
//    }

    public int delete(int index){
        if(index <=0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        Node delElement =prev.next;           // FUNFACT : these all are just objects and references  （￣︶￣）
        int val = prev.next.value;
        prev.next =delElement.next;     // or prev.next.next;
//        delElement.next = null;       // Optional: Clear the deleted node's next pointer
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;       // moving to the next node
        }
        System.out.println("End");
    }

    public void getSize(){
        System.out.println("the current size is : " +  size);
    }


    private class Node{             //Node can be static as well

        private int value;
        private Node next;          //for storing the address of next node

        public Node( int value){
            this.value = value;
        }

        public Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }


}
