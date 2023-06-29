import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);             /*--- make object of scanner class ---*/

        // Variable declaretions
        
        System.out.print("Enter 1st number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter secont number = ");
        int num2 = scan.nextInt();

        System.out.println("Sum of two digit is = "+ (num1+num2));         /*--- Output --- */
                
    }
}
