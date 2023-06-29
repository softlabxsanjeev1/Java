package Strings;

import java.util.Scanner;

public class User_input_string_type {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        // we use next() to take string
        String str = scan.nextLine();
        System.out.print("Your name is : " + str);

    }
}
