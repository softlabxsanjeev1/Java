import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Swapping_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter second no = ");
        int num2 = scan.nextInt();
        System.out.println("Before swapping num1 = "+num1+" num2 = "+num2);
        System.out.println();
        

        //------------swapping logic ----------( Method 1 using temp var)-------
        //  int temp = num1;
        //  num1 = num2;
        //  num2 = temp;
        //  System.out.print("After swapping num1 = "+num1+" /nnum2 = "+num2);
        //  System.out.println();


        //---------swapping logic ------(Method 2 without temp and use arithmetic op)---
        num1= num1+num2;          //5=3+2
        num2=num1-num2;           //3=5-2
        num1=num1-num2;           //2=5-3
        System.out.print("After swapping num1 = "+num1+" num2 = "+num2);
        System.out.println();
    }
}
