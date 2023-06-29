import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.print("Enter no = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // initialize first two digit of fabinacci series

        int num1 = 0 ;
        int num2 = 1;
        int next;
        System.out.print(num1+","+num2);

        for(int i = 1; i < num; i++){
            next = num1 + num2;
            System.out.print(","+next);
            num1 = num2;
            num2 = next;
        }
    }    
}
