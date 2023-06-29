import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        System.out.println("Velocity is the rate of change in displacement with respect to time.\n V = s/t; here s=speed, t= time, and v=velocity");
        System.out.println("Units /n /n Displacement = meter /n Time = hours");

        //variables
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter displacement = ");
          float displacement = scan.nextFloat();
          System.out.print("Enter time = ");
           float time = scan.nextFloat();

           System.out.println("Displacement = "+displacement);
           System.out.println("Time = "+time);
            float velocity = displacement/time;
            System.out.println("Velocity = "+velocity+"  m/s");

    }
    
}


// extra feature convert hours into seconds and km into meter.


