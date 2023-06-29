import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Reverse_no {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println();
        int rev = 0;
        System.out.println("Number = "+num);
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;            //------------logic to reverse no
            num = num/10;
        }
        num =rev;
        System.out.println("Reverse = "+num);
    }    
}
