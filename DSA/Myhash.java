package DSA;
import java.util.*;

public class Myhash {
    int bucket;
    private ArrayList<LinkedList<Integer>> table;
    Myhash(int b){  // declares the size
        bucket =b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i =0; i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){

        int i = key%bucket;
        table.get(i).add(key);
    }

    void remove(int key){
        int i = key% bucket;
        table.get(i).remove((Integer) i);
    }

    boolean search(int key){
        int i =key % bucket;
        return table.get(i).contains(key);
    }



    public static void main(String[] args) {

        Myhash hash = new Myhash(10);
        hash.insert(70);
        hash.insert(71);
        hash.insert(56);
        hash.insert(9);
        hash.insert(7);
        hash.insert(74);
        hash.insert(712);
        hash.insert(82);
        hash.insert(47);
        hash.insert(52);
        hash.insert(79);

        System.out.println(hash.search(56));
        System.out.println(hash.table);

    }
}




