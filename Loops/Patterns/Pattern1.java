package Loops.Patterns;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();

         for(int row = 1; row <= num; row++){
            for(int col =1; col <= num; col++){
                System.out.print(" "+ "*");
            }
            System.out.println();
         }
    }
}
