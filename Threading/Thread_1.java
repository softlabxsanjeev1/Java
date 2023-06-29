package Threading;
import java.lang.*;

class Mythread implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Value of i : "+i);
        }
    }
}
public class Thread_1 {
    public static void main(String[] args) {
        Mythread th = new Mythread();
        Thread t = new Thread(th);
        t.start();
    }
}
