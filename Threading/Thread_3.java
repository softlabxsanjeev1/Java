package Threading;
import java.lang.*;


class MyAnotherThread extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){            
           
                System.out.println("Another thread : "+i);
               
            
        }
    }
}


public class Thread_3 {
    public static void main(String[] args) {
        
// object creation of another thread
        MyAnotherThread thr = new MyAnotherThread();
        Thread th2 = new Thread(thr);  

        // tr1.start();
        th2.start();



}
