package Threading;
import java.lang.Thread;
// use thread class
// sleep() method use to run task after a time interval

class Mythrad extends Thread{
    public void run(){
    for(int i = 0;i<=10;i++){
        System.out.println("Value of i "+i);        
            // Thread.sleep(1000);

    }
}
}
public class Thread_2 {
    public static void main(String[] args) {
        Mythrad th = new Mythrad();        //we create a refernce of our thread
        Thread thr = new Thread(th);        //start our thread that reference we passes
        thr.start();
    }
    
}
