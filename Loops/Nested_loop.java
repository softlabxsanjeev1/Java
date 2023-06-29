package Loops;
// print matrix

import java.util.Scanner;

public class Nested_loop {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // Nested loop
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
