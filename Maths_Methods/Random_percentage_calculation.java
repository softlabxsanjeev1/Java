
import java.math.*;
import java.util.Scanner;

public class Random_percentage_calculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String myName = scan.next();
        System.out.print("Enter partner name = ");
        String partnerNmae = scan.next();
        int perct = (int)(Math.random()*100);
        System.out.print("Your partner "+partnerNmae+" "+perct+" % loves to you "+myName);
    }
    
}