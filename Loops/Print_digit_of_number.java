package Loops;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Print_digit_of_number {
    public static void main(String[] args) {
        System.out.print("Enetr no smaller than 5 digit = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        for(int i = 0; i<5; i++){
            int rem = num % 10;
            System.out.print(rem+",");
            num = num / 10;
        }

    }
    
}
