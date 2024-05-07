package DSA;
import java.util.*;



    class MyHashMap<K, V> {
        public static final int DEFAULT_INITIAL_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{

            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }

        }

        
        private int n;  // number of entries
        private LinkedList<Node>[] buckets;     // this means the array of linkedlist

        private void initBuckets(int N){        // N - capacity or size of bucket array
            buckets = new LinkedList[N];        // defining the size of the bucket array
            for (int i = 0; i< buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }


        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll ,K key){         // TRAVERSES the linkedlist and looks for a node with key, if founf it returns its'index otherwise it returns null
            for(int i =0; i< ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }


        public MyHashMap(){
            initBuckets(DEFAULT_INITIAL_CAPACITY);
            n =0;
        }

        public int size(){    // return the number of entries in the map
            return n;
        }
    
        public void put(K key , V value){
          int bi = HashFunc(key);
          LinkedList<Node> currBucket = buckets[bi];
          int ei = searchInBucket(currBucket,key);
          if(ei!= -1){     // key exist, update
            Node currNode = currBucket.get(ei);          // and alse we dont need to update n(size of ll)  
            currNode.value = value;                //currBucket.get(ei).value= value; 

          } else{
          
           Node node = new Node(key, value);
            currBucket.add(node);
            n++;
          } 

        }
    
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei==-1){      // not found case
                return null;
            } else{          // found case
                Node currNode = currBucket.get(ei);
                return currNode.value;              // return currBucket.get(ei).value;
               
            }
        }
    
        public V remove(K key){
             int bi = HashFunc(key);
             LinkedList<Node> currBucket = buckets[bi];
             int ei = searchInBucket(currBucket, key);
             if(ei!=-1){
                
                V found =currBucket.get(ei).value;
                currBucket.remove(ei);
                n--;
                return found;
             } 
             return null;
        }
    


    public static void main(String[] args) {

        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");

        mp.put("apple", 10);
        mp.put("banana", 27);
        mp.put("lichi", 93);
        mp.put("peach",55);
        System.out.println("Size: " + mp.size()); // Output: Size: 2
        System.out.println("Value of apple: " + mp.get("apple")); // Output: Value of apple: 10
    }
}