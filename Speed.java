import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class Speed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in meter = ");
        float distance = scan.nextFloat();
        System.out.print("Enter time in second = ");
        float time = scan.nextFloat();

        double speed = distance/time;
        System.out.println("Speed = "+speed +" m/s");


        
    }
    
}


