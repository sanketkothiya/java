public class oddeventhread {

    public static void main(String[] args) {
        Runnable r = new odd1();
        Thread t = new Thread(r);
        Runnable r2 = new even1();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class even1 implements Runnable{
    public void run(){
        for(int i=0;i<11;i+=2) {
			 System.out.println("\neven number is:"+i);
         
        }
    }
}

class odd1 implements Runnable{
    public void run(){
        for(int i=1;i<=11;i+=2) {
			 System.out.println("\nodd  number is:"+i);
           
        }
    }
}