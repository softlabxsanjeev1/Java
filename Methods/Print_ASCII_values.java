package Methods;

import java.util.Scanner;

public class Print_ASCII_values {

    //--------method to return ascii code
    static int returnASCII(char mychar){
        return (int)mychar;
    }


    public static void main(String[] args) {
        // System.out.println("Enetr any character = ");
        // Scanner scan = new Scanner(System.in);
        // char ch = scan.next().charAt(0);
        
        char mychar ='A';
        int rval = returnASCII(mychar);

        for(int i = rval+1; i < (char)'Z'; i++){
            System.out.println((char)i);
        }
    }
    
}
