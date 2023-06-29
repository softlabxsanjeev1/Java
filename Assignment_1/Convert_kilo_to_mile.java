import java.util.Scanner;
public class Convert_kilo_to_mile {
    public static void main(String[] args) {
        // 1 km = 0.62137119 mile
        //use string.fomat() to set limit of digits after decimal
        int distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Kilometer : ");
        distance = sc.nextInt();

        double dis = distance*0.62137119 ;
        System.out.println("Distance in Miles = "+String.format("%.4f",dis)+" miles");

    }
}
