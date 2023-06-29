package Loops.Patterns;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter size here = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for(int row =1; row < size; row++){
            //--------------loop for sapces ------------
            for(int sp = 1; sp < size-row; sp++){
                System.out.print("   ");
            }
            //-------------- loop for star --------------
            for(int star = 1; star <= row; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
