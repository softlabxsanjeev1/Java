package Loops.Patterns;

import java.util.Scanner;

public class Reverse_counting_pattern {
    public static void main(String[] args) {
        System.out.print("Enter size here = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        //----------------print-------

        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size - row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
