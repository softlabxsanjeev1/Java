import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class Sum_and_average {
    public static void main(String[] args) {
        System.out.println("Enetr 5 values : ");
        Scanner sc = new Scanner(System.in);

        //array to take input
        int arr[] = new int [5];
        for(int i = 0; i<5;i++){
            arr[i] = sc.nextInt();
        }
        // sum
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum : "+sum);
        System.out.println();

        //average
        System.out.println("Average : "+(sum/5));
        }
    
}
