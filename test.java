
    

    class Count extends Thread{
        static int counts = 0;
    
        private void increment() {
            counts++;
        }
    
        public int getCount() {
            return counts;
        }

        public void run(){
            for(int i =0;i<10000;i++){
                increment();
            }
        }
    }
    public class test {
    public static void main(String[] args) throws InterruptedException {
        

        Count c = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c.start();
        c2.start();
        c3.start();

        c.join();
        c2.join();
        c3.join();

        System.out.println(Count.counts);
    }
}
