import AdvanceJava.Producer;

class Company{
    int n;
    boolean flag =false;
    // if flag is true then produce will run
    //if flag is false then its consumer chance
    
    synchronized public void produceItem(int i){
        if(!flag){
            try{wait();} catch(Exception e){}
        }
        this.n =i;
        System.out.println(n+ ": is being produced");
        flag = false;
        notify();
        
    }

    synchronized public int consumedItem(int i){
        if(flag){
            try{wait();} catch(Exception e){};
        }
        System.out.println("consumed :" + this.n);
        this.flag = true;
        notify();
        return this.n;
    }

}

class Producer extends Thread{
    Company c;

    public Producer(Company c){
        this.c = c;
    }
    public void run(){
        int i =1;
        while(true){
            this.c.produceItem(i);
            try{Thread.sleep(500);} catch(Exception e){}
            i++;

        }
    }
}


class consumer extends Thread{
    Company c;

    public consumer (Company c){
        this.c = c;
    }
    public void run(){
        int i =1;
        while(true){
            this.c.consumedItem(i);
            try{Thread.sleep(1000);} catch(Exception e){}
            i++;

        }
    }
}
public class ProducerAndConsumerProblem {
    
public static void main(String[] args) {

    Company comp = new Company();
    Producer prod = new Producer(comp);
    consumer cons = new consumer(comp);

    prod.start();
    cons.start();   
}
}
